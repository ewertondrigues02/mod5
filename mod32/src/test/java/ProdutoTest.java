import br.com.ewerton.dao.IProdutoDao;
import br.com.ewerton.dao.ProdutoDao;
import br.com.ewerton.domain.Produto;
import org.junit.Test;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setNome("Celular");
        produto.setCodigo("A1");
        produto.setQuantidade(3);
        produto.setPreco(500L);
        produtoDao.cadastrar(produto);

    }
}
