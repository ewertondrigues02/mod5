import br.com.ewerton.dao.ClienteDaoMock;
import br.com.ewerton.dao.IClienteDao;
import br.com.ewerton.domain.Cliente;
import br.com.ewerton.service.ClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private ClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDao iClienteDaoMock = new ClienteDaoMock();
        clienteService = new ClienteService(iClienteDaoMock);
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
        clienteService.salvarCliente(cliente);
    }

    @Test
    public void salvarCliente() {
        clienteService.salvarCliente(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarCliente(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluirCliente(cliente.getCpf());
    }

    @Test
    public void alterarCliente() {
        cliente.setNome("Ewerton");
        clienteService.alterarCliente(cliente);
        Assert.assertEquals("Ewerton", cliente.getNome());
    }

}
