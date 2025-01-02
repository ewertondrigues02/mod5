package br.com.ewerton.dao;

import br.com.ewerton.domain.Cliente;

public class ClienteDao implements IClienteDao {


    @Override
    public void salvarClienteDao(Cliente cliente) {

    }

    @Override
    public Cliente buscarClienteDao(Long cpf) {
        return null;
    }

    @Override
    public Cliente alterarClienteDao(Cliente cliente) {
        return cliente;
    }

    @Override
    public void excluirClienteDao(Long cpf) {
    }
}
