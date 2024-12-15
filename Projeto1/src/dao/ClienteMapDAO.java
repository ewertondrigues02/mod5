package dao;

import domain.Cliente;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class ClienteMapDAO implements IClienteDAO {

    private Map<Long, Cliente> map;


    public ClienteMapDAO(){
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }

        map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public Cliente excluir(Long cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);

        return clienteCadastrado;
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setEstado(cliente.getEstado());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setTel(cliente.getTel());
    }

    @Override
    public Cliente consultar(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }
}
