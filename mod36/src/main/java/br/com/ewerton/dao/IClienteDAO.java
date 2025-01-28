package br.com.ewerton.dao;

import br.com.ewerton.dao.generic.IGenericDAO;
import br.com.ewerton.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

//    Class<Cliente> getTipoClasse();

    void atualiarDados(Cliente entity, Cliente entityCadastrado);

    Boolean salvarCliente(Cliente cliente);
}
