import br.com.ewerton.dao.ClienteDAO;
import br.com.ewerton.dao.IClienteDAO;
import br.com.ewerton.domain.Cliente;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.MaisDeUmRegistroException;
import br.com.ewerton.exceptions.TableException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    public ClienteDAOTest() {
        clienteDao = new ClienteDAO();
    }

    @After
    public void end() throws DAOException {
        Collection<Cliente> list = clienteDao.buscarTodos();
        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli.getCpf());
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });
    }

    @Test
    public void pesquisarCliente() throws MaisDeUmRegistroException, TableException, TipoChaveNaoEncontradaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Ewerton");
        cliente.setCidade("Santa Catarina");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        clienteDao.cadastrar(cliente);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Ewerton");
        cliente.setCidade("Santa Catarina");
        cliente.setEnd("End");
        cliente.setEstado("SC");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente.getCpf());
    }


    @Test
    public void excluirCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Ewerton");
        cliente.setCidade("Santa Catarina");
        cliente.setEnd("End");
        cliente.setEstado("SC");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteDao.excluir(cliente.getCpf());
        clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNull(clienteConsultado);
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, MaisDeUmRegistroException, TableException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Ewerton");
        cliente.setCidade("Santa Catarina");
        cliente.setEnd("End");
        cliente.setEstado("SC");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);

        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);

        clienteConsultado.setNome("Ewerton Rodrigues");
        clienteDao.alterar(clienteConsultado);

        Cliente clienteAlterado = clienteDao.consultar(clienteConsultado.getCpf());
        Assert.assertNotNull(clienteAlterado);
        Assert.assertEquals("Ewerton Rodrigues", clienteAlterado.getNome());

        clienteDao.excluir(cliente.getCpf());
        clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNull(clienteConsultado);
    }

    @Test
    public void buscarTodos() throws TipoChaveNaoEncontradaException, DAOException {
        Cliente cliente = new Cliente();
        cliente.setCpf(56565656565L);
        cliente.setNome("Ewerton");
        cliente.setCidade("Santa Catarina");
        cliente.setEnd("End");
        cliente.setEstado("SC");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);

        Cliente cliente1 = new Cliente();
        cliente1.setCpf(56565656569L);
        cliente1.setNome("Guilherme");
        cliente1.setCidade("Santa Catarina");
        cliente1.setEnd("End");
        cliente1.setEstado("SC");
        cliente1.setNumero(11);
        cliente1.setTel(1199999999L);
        cliente1.setEstadoCivil("Solteiro");
        Boolean retorno1 = clienteDao.cadastrar(cliente1);
        Assert.assertTrue(retorno1);

        Collection<Cliente> list = clienteDao.buscarTodos();
        Assert.assertTrue(list != null);
        Assert.assertTrue(list.size() == 2);

        list.forEach(cli -> {
            try {
                clienteDao.excluir(cli.getCpf());
            } catch (DAOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        Collection<Cliente> list1 = clienteDao.buscarTodos();
        Assert.assertTrue(list1 != null);
        Assert.assertTrue(list1.size() == 0);
    }
}
