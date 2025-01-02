package br.com.ewerton.dao;

import br.com.ewerton.domain.Cliente;

public class ClienteDaoMock implements IClienteDao {

    @Override
    public void salvarClienteDao(Cliente cliente) {
    }

    @Override
    public Cliente buscarClienteDao(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public Cliente alterarClienteDao(Cliente cliente) {
        return null;
    }

    @Override
    public void excluirClienteDao(Long cpf) {
    }
}
