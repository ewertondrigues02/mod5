package br.com.ewerton.service;

import br.com.ewerton.dao.IProdutoDAO;
import br.com.ewerton.domain.Produto;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.MaisDeUmRegistroException;
import br.com.ewerton.exceptions.TableException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;
import br.com.ewerton.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    private final IProdutoDAO produtoDAO;

    public ProdutoService(IProdutoDAO produtoDAO) {
        super((Produto) produtoDAO); // Corrigido o casting desnecessário
        this.produtoDAO = produtoDAO;
    }

    @Override
    public Produto consultar(String codigo) throws MaisDeUmRegistroException, DAOException, TableException {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser nulo ou vazio.");
        }
        return produtoDAO.consultar(codigo);
    }

    @Override
    public Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException {
        if (produto == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo.");
        }
        return produtoDAO.salvar(produto);
    }

    @Override
    public Boolean cadastrar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException {
        if (produto == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo.");
        }
        return produtoDAO.cadastrar(produto);
    }

    // Novo método: Alterar
    @Override
    public void alterar(Produto produto) throws DAOException, TipoChaveNaoEncontradaException {
        if (produto == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo.");
        }
        produtoDAO.alterar(produto);
    }

    // Novo método: Excluir
    @Override
    public void excluir(String codigo) throws DAOException {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser nulo ou vazio.");
        }
        produtoDAO.excluir(codigo);
    }
}
