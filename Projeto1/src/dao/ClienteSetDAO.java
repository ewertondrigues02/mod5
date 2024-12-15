package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO {

    private Set<Cliente> set;


    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }


    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public Cliente excluir(Long cpf) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            this.set.remove(clienteEncontrado);
        }
        return clienteEncontrado;
    }

    @Override
    public void alterar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            for (Cliente clienteEncontrado : this.set) {
                clienteEncontrado.setNome(cliente.getNome());
                clienteEncontrado.setNumero(cliente.getNumero());
                clienteEncontrado.setTel(cliente.getTel());
                clienteEncontrado.setEstado(cliente.getEstado());
                clienteEncontrado.setEnd(cliente.getEnd());
                clienteEncontrado.setCidade(cliente.getCidade());
                break;
            }
        }


    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente clienteCadastrado : this.set) {
            if (clienteCadastrado.getCpf().equals(cpf)) {
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}
