package br.com.ewerton.dao;

import br.com.ewerton.dao.generic.IGenericDAO;
import br.com.ewerton.domain.Venda;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    void atualiarDados(Venda entity, Venda entityCadastrado);

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
