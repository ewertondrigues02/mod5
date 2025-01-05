package dao;

import domain.Acessorio;


public interface IAcessorioDao {

    Acessorio cadastrar(Acessorio acessorio);

    void excluir(Long id);
}
