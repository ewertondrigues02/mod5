package br.com.ewerton.service;

import br.com.ewerton.dao.IClienteDao;
import br.com.ewerton.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDao iClienteDao;

    public ClienteService(IClienteDao iClienteDao) {
        this.iClienteDao = iClienteDao;
    }

    @Override
    public void salvarCliente(Cliente cliente) {
    }

    @Override
    public Cliente buscarCliente(Long cpf) {
        return iClienteDao.buscarClienteDao(cpf);

    }

    @Override
    public Cliente alterarCliente(Cliente cliente) {
        cliente.setNome(cliente.getNome());
        cliente.setCpf(cliente.getCpf());
        cliente.setTel(cliente.getTel());
        cliente.setEstado(cliente.getEstado());
        cliente.setEnd(cliente.getEnd());
        cliente.setNumero(cliente.getNumero());
        cliente.setCidade(cliente.getCidade());
        return iClienteDao.alterarClienteDao(cliente);
    }

    @Override
    public void excluirCliente(Long cpf) {
        iClienteDao.excluirClienteDao(cpf);
    }
}
