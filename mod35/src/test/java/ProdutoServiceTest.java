import br.com.ewerton.dao.IClienteDAO;
import br.com.ewerton.dao.IProdutoDAO;
import br.com.ewerton.domain.Produto;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;
import br.com.ewerton.service.IProdutoService;
import br.com.ewerton.service.ProdutoService;
import dao.ClienteDaoMock;
import dao.ProdutoDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        IClienteDAO cli = new ClienteDaoMock();
        produtoService = new ProdutoService(dao, cli);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Laranja Lima é azeda");
        produto.setNome("Laranja Lima");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() throws DAOException {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("Ewerton Rodrigues");
        produtoService.alterar(produto);

        Assert.assertEquals("Ewerton Rodrigues", produto.getNome());
    }
}