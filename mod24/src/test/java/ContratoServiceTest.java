import br.com.ewerton.dao.ContratoDao;
import br.com.ewerton.service.ContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarContratoTest() {
        ContratoDao contratoDao = new ContratoDao();
        ContratoService contrato1 = new ContratoService(contratoDao);
        String retorno1 = contrato1.salvarContratoService();
        Assert.assertEquals("Contrato Salvo", retorno1);
    }

    @Test
    public void buscarContratoTest() {
        ContratoDao contratoDao = new ContratoDao();
        ContratoService contrato2 = new ContratoService(contratoDao);
        String retorno2 = contrato2.buscarContraService();
        Assert.assertEquals("Contrato Encontrado", retorno2);
    }

    @Test
    public void excluirContratoTest() {
        ContratoDao contratoDao = new ContratoDao();
        ContratoService contrato3 = new ContratoService(contratoDao);
        String retorno3 = contrato3.excluirContratoService();
        Assert.assertEquals("Contrato Excluido", retorno3);
    }

    @Test
    public void atualizarContratoTest() {
        ContratoDao contratoDao = new ContratoDao();
        ContratoService contrato4 = new ContratoService(contratoDao);
        String retorno4 = contrato4.atualizarContratoService();
        Assert.assertEquals("Contrato Atualizado", retorno4);
    }

}
