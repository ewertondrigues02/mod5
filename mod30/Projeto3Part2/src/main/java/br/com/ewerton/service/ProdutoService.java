package br.com.ewerton.service;

import br.com.ewerton.dao.IClienteDAO;
import br.com.ewerton.dao.IProdutoDAO;
import br.com.ewerton.domain.Cliente;
import br.com.ewerton.domain.Produto;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;
import br.com.ewerton.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    private final IProdutoDAO produtoDAO;
    private final IClienteDAO clienteDAO;

    public ProdutoService(IProdutoDAO produtoDAO, IClienteDAO clienteDAO) {
        super(produtoDAO);
        this.produtoDAO = produtoDAO;
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Produto produto, Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
        if (produto == null || cliente == null) {
            throw new IllegalArgumentException("Produto e cliente não podem ser nulos.");
        }
        boolean produtoSalvo = produtoDAO.salvar(produto);
        boolean clienteSalvo = clienteDAO.salvarCliente(cliente);
        return produtoSalvo && clienteSalvo;
    }

    @Override
    public Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException {
        if (produto == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo.");
        }
        return produtoDAO.salvar(produto);
    }

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        return clienteDAO.salvarCliente(cliente);
    }

    @Override
    public Boolean cadastrar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException {
        if (produto == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo.");
        }
        return produtoDAO.cadastrar(produto);
    }

    @Override
    public Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
        if (cliente == null) {
            throw new IllegalArgumentException("O cliente não pode ser nulo.");
        }
        return clienteDAO.salvarCliente(cliente);
    }
}
