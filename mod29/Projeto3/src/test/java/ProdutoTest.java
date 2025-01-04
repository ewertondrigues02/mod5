import br.com.ewerton.dao.IProdutoDao;
import br.com.ewerton.dao.ProdutoDao;
import br.com.ewerton.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    @Test
    public void cadastrarTest() throws Exception {

        produtoDao = new ProdutoDao();
        Produto produto = new Produto();

        produto.setCodigo("9");
        produto.setNome("Arroz");
        Integer countCad = produtoDao.cadastrarProduto(produto);
        Assert.assertEquals(1, (int) countCad);

        Produto produtoBD = produtoDao.buscarProduto("9");
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());

        produtoDao.excluirProduto(produtoBD);


    }

    @Test
    public void buscarTest() throws Exception {
        produtoDao = new ProdutoDao();
        Produto produto = new Produto();

        produto.setCodigo("10");
        produto.setNome("Ewerton Rodrigues");
        Integer countCad = produtoDao.cadastrarProduto(produto);
        Assert.assertEquals(1, (int) countCad);

        Produto produtoBD = produtoDao.buscarProduto("10");
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());

        produtoDao.excluirProduto(produtoBD);


    }

    @Test
    public void excluirTest() throws Exception {
        produtoDao = new ProdutoDao();
        Produto produto = new Produto();

        produto.setCodigo("9");
        produto.setNome("Arroz");
        Integer countCad = produtoDao.cadastrarProduto(produto);
        Assert.assertEquals(1, (int) countCad);

        Produto produtoBD = produtoDao.buscarProduto("9");
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());

        produtoDao.excluirProduto(produtoBD);


    }

    @Test
    public void buscarTodosTest() throws Exception {
        produtoDao = new ProdutoDao();
        Produto produto = new Produto();

        produto.setCodigo("10");
        produto.setNome("Ewerton Rodrigues");
        Integer countCad = produtoDao.cadastrarProduto(produto);
        Assert.assertEquals(1, (int) countCad);

        produto.setCodigo("11");
        produto.setNome("Guilherme");
        Integer countCad2 = produtoDao.cadastrarProduto(produto);
        Assert.assertEquals(1, (int) countCad2);

        List<Produto> list = produtoDao.buscarTodosProdutos();
        Assert.assertNotNull(list);
        Assert.assertEquals(2, list.size());

        int countDel = 0;
        for (Produto pro : list) {
            produtoDao.excluirProduto(pro);
            countDel++;
        }
        Assert.assertEquals(list.size(), countDel);
        list = produtoDao.buscarTodosProdutos();
        Assert.assertEquals(list.size(), 0);

    }

    @Test
    public void atualizarTest() throws Exception {

        produtoDao = new ProdutoDao();
        Produto produto = new Produto();


        produto.setCodigo("9");
        produto.setNome("Arroz");
        Integer countCad = produtoDao.cadastrarProduto(produto);
        Assert.assertEquals(1, (int) countCad);

        Produto produtoBD = produtoDao.buscarProduto("9");
        Assert.assertNotNull(produtoBD);
        Assert.assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        Assert.assertEquals(produto.getNome(), produtoBD.getNome());

        produtoBD.setNome("Feijao");
        Integer countUpdate = produtoDao.atualizarProduto(produtoBD);
        Assert.assertEquals(1, (int) countUpdate);

        Produto produtoBDAtualizado = produtoDao.buscarProduto("9");
        Assert.assertNotNull(produtoBDAtualizado);
        Assert.assertEquals(produtoBD.getId(), produtoBDAtualizado.getId());
        Assert.assertEquals(produtoBD.getCodigo(), produtoBDAtualizado.getCodigo());
        Assert.assertEquals(produtoBD.getNome(), produtoBDAtualizado.getNome());

        List<Produto> list = produtoDao.buscarTodosProdutos();
        for (Produto pro : list) {
            produtoDao.excluirProduto(pro);
        }

        List<Produto> listaFinal = produtoDao.buscarTodosProdutos();
        Assert.assertTrue(listaFinal.isEmpty());
    }

}
