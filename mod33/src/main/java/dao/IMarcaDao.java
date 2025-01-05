package dao;

import domain.Marca;

public interface IMarcaDao {

    Marca cadastrar(Marca marca);

    void excluir(Long id);
}
