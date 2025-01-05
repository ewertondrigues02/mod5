package br.com.ewerton.service;

import br.com.ewerton.dao.IClienteDAO;
import br.com.ewerton.domain.Cliente;
import br.com.ewerton.exceptions.DAOException;
import br.com.ewerton.exceptions.MaisDeUmRegistroException;
import br.com.ewerton.exceptions.TableException;
import br.com.ewerton.exceptions.TipoChaveNaoEncontradaException;
import br.com.ewerton.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        //this.clienteDAO = clienteDAO;
    }

	@Override
	public Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
		return clienteDAO.cadastrar(cliente);
	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

	@Override
	public void excluir(Long cpf) throws DAOException {
		clienteDAO.excluir(cpf);
	}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
		clienteDAO.alterar(cliente);
	}

    @Override
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
        if (cliente == null) {
            throw new IllegalArgumentException("O produto não pode ser nulo.");
        }
        return clienteDAO.salvar(cliente);
    }

}