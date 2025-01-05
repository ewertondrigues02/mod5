import br.com.ewerton.dao.IClienteDAO;
import br.com.ewerton.domain.Cliente;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;
import br.com.ewerton.service.ClienteService;
import br.com.ewerton.service.IClienteService;
import dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Ewerton");
        cliente.setCidade("Santa Catarina");
        cliente.setEnd("End");
        cliente.setEstado("SC");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        cliente.setEstadoCivil("Casado");

    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Ewerton Rodrigues");
        clienteService.alterar(cliente);

        Assert.assertEquals("Ewerton Rodrigues", cliente.getNome());
    }
}