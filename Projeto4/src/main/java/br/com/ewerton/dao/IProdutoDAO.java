package br.com.ewerton.dao;


import br.com.ewerton.dao.generic.IGenericDAO;
import br.com.ewerton.domain.Cliente;
import br.com.ewerton.domain.Produto;


public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    void atualiarDados(Produto entity, Produto entityCadastrado);

    Boolean salvar(Produto produto);
}