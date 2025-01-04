import br.com.ewerton.dao.ClienteDao;
import br.com.ewerton.dao.IClienteDao;
import br.com.ewerton.domain.Cliente;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ClienteTest {

    private IClienteDao clienteDao;

    @Test
    public void cadastrarTest() throws Exception {
        clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();

        cliente.setCodigo("11");
        cliente.setNome("Guilherme");
        Integer countCad = clienteDao.cadastrar(cliente);
        Assert.assertEquals(1, (int) countCad);

        Cliente clienteBD = clienteDao.buscar("11");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDao.excluir(clienteBD);
        Assert.assertEquals(1, (int) countDel);

    }

    @Test
    public void buscarTest() throws Exception {
        clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();

        cliente.setCodigo("10");
        cliente.setNome("Ewerton Rodrigues");
        Integer countCad = clienteDao.cadastrar(cliente);
        Assert.assertEquals(1, (int) countCad);

        Cliente clienteBD = clienteDao.buscar("10");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

       clienteDao.excluir(clienteBD);


    }

    @Test
    public void excluirTest() throws Exception {
        clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();

        cliente.setCodigo("10");
        cliente.setNome("Ewerton Rodrigues");
        Integer countCad = clienteDao.cadastrar(cliente);
        Assert.assertEquals(1, (int) countCad);

        Cliente clienteBD = clienteDao.buscar("10");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer countDel = clienteDao.excluir(clienteBD);
        Assert.assertEquals(1, (int) countDel);

    }

    @Test
    public void buscarTodosTest() throws Exception {
        clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();

        cliente.setCodigo("10");
        cliente.setNome("Ewerton Rodrigues");
        Integer countCad = clienteDao.cadastrar(cliente);
        Assert.assertEquals(1, (int) countCad);

        cliente.setCodigo("11");
        cliente.setNome("Guilherme");
        Integer countCad2 = clienteDao.cadastrar(cliente);
        Assert.assertEquals(1, (int) countCad2);

        List<Cliente> list = clienteDao.buscarTodos();
        Assert.assertNotNull(list);
        Assert.assertEquals(2, list.size());

        int countDel = 0;
        for (Cliente cli : list) {
            clienteDao.excluir(cli);
            countDel++;
        }
        Assert.assertEquals(list.size(), countDel);
        list = clienteDao.buscarTodos();
        Assert.assertEquals(list.size(), 0);

    }

    @Test
    public void atualizarTest() throws Exception {
        clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();

        cliente.setCodigo("10");
        cliente.setNome("Ewerton Rodrigues");
        Integer countCad = clienteDao.cadastrar(cliente);
        Assert.assertEquals(1, (int) countCad);

        Cliente clienteBD = clienteDao.buscar("10");
        Assert.assertNotNull(clienteBD);
        Assert.assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        Assert.assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setCodigo("11");
        clienteBD.setNome("Guilherme");
        Integer countUpdate = clienteDao.atualizar(clienteBD);
        Assert.assertEquals(1, (int) countUpdate);

        Cliente clienteBD1 = clienteDao.buscar("10");
        Assert.assertNull(clienteBD1);


        Cliente clienteBD2 = clienteDao.buscar("11");
        Assert.assertNotNull(clienteBD2);
        Assert.assertEquals(clienteBD.getId(), clienteBD2.getId());
        Assert.assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
        Assert.assertEquals(clienteBD.getNome(), clienteBD2.getNome());

        List<Cliente> list = clienteDao.buscarTodos();
        for (Cliente cli : list) {
            clienteDao.excluir(cli);
        }
    }

}
