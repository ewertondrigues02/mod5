package br.com.ewerton.dao;

import br.com.ewerton.domain.Produto;

import java.util.List;

public interface IProdutoDao {

    public Integer cadastrarProduto(Produto produto) throws Exception;

    public Integer atualizarProduto(Produto produto) throws Exception;

    public Produto buscarProduto(String codigo) throws Exception;

    public List<Produto> buscarTodosProdutos() throws Exception;

    public Integer excluirProduto(Produto produto) throws Exception;
}
