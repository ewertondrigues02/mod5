package br.com.ewerton.service;

import br.com.ewerton.domain.Cliente;

public interface IClienteService {

    void salvarCliente(Cliente cliente);

    Cliente buscarCliente(Long cpf);

    Cliente alterarCliente(Cliente cliente);

    void excluirCliente(Long cpf);

}
