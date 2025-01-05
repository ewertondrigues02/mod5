package br.com.ewerton.service;

import br.com.ewerton.domain.Cliente;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException;

    Cliente buscarPorCPF(Long cpf) throws  DAOException;

	void excluir(Long cpf) throws DAOException;

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException;

}
