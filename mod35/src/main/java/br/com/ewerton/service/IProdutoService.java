package br.com.ewerton.service;

import br.com.ewerton.domain.Produto;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;

public interface IProdutoService {


    Produto consultar(String codigo);

    Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException;

    Boolean cadastrar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException;
}
