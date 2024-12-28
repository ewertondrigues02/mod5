import br.com.ewerton.dao.ClienteDaoMock;
import br.com.ewerton.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mock = new ClienteDaoMock();
        ClienteService service =  new ClienteService(mock);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
