package br.com.ewerton.dao;

import br.com.ewerton.domain.Produto;

public interface IProdutoDao {

    Produto cadastrar(Produto produto);

    void excluir(Long id);
}
