package br.com.ewerton.service.generic;

import br.com.ewerton.dao.IClienteDAO;
import br.com.ewerton.dao.IProdutoDAO;
import br.com.ewerton.dao.Persistente;
import br.com.ewerton.dao.generic.IGenericDAO;
import br.com.ewerton.domain.Cliente;
import br.com.ewerton.domain.Produto;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.MaisDeUmRegistroException;
import br.com.ewerton.exceptions.TableException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public abstract class GenericService<T extends Persistente, E extends Serializable> implements IGenericService<T, E> {

    protected IGenericDAO<T, E> dao;

    public GenericService(T dao) {
        this.dao = (IGenericDAO<T, E>) dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) throws DAOException {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws DAOException, MaisDeUmRegistroException, TableException {
        try {
            return this.dao.consultar(valor);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            //TODO levantar um erro genérico
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }

    public abstract Boolean salvar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

}
