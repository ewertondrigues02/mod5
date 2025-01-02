import br.com.ewerton.dao.ClienteDaoMock;
import br.com.ewerton.dao.IClienteDao;
import br.com.ewerton.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDaoTest {

    private IClienteDao clienteDao;
    private Cliente cliente;

    public ClienteDaoTest() {
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12345678910L);
        cliente.setNome("Ewerton Rodrigues");
        cliente.setCidade("Balneario");
        cliente.setNumero(1234567891);
        cliente.setEnd("Rua 12B");
        cliente.setEstado("São Paulo");
        cliente.setTel(121455469874L);

    }

    @Test
    public void salvarClienteDao() {
        clienteDao.salvarClienteDao(cliente);
    }

    @Test
    public void buscarClienteDao() {
        Cliente clienteConsultado = clienteDao.buscarClienteDao(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void excluirClienteDao() {
        clienteDao.excluirClienteDao(cliente.getCpf());
    }

}
