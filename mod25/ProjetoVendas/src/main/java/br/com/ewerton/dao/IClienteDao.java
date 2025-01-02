package br.com.ewerton.dao;

import br.com.ewerton.domain.Cliente;

public interface IClienteDao {

    void salvarClienteDao(Cliente cliente);

    Cliente buscarClienteDao(Long cpf);

    Cliente alterarClienteDao(Cliente cliente);

    void excluirClienteDao(Long cpf);

}
