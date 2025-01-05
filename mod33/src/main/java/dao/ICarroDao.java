package dao;

import domain.Carro;

public interface ICarroDao {

    Carro cadastrar(Carro carro);

    void excluir(Long id);
}
