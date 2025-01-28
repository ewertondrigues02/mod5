package br.com.ewerton.service;

import br.com.ewerton.domain.Cliente;
import br.com.ewerton.domain.Produto;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.MaisDeUmRegistroException;
import br.com.ewerton.exceptions.TableException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;

public interface IProdutoService {


    Produto consultar(String codigo) throws MaisDeUmRegistroException, DAOException, TableException;

    Boolean salvar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException;

    Boolean cadastrar(Produto produto) throws TipoChaveNaoEncontradaException, DAOException;

    void alterar(Produto produto) throws DAOException, TipoChaveNaoEncontradaException;

    void excluir(String codigo) throws DAOException;
}
