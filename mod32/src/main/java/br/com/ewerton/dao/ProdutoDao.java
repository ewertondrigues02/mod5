package br.com.ewerton.dao;

import br.com.ewerton.domain.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao implements IProdutoDao {

    private static final String URL = "jdbc:postgresql://localhost:5432/agendamento_consultas";
    private static final String USER = "user";
    private static final String PASSWORD = "user";

    @Override
    public Produto cadastrar(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco, quantidade, codigo) VALUES (?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setLong(2, produto.getPreco());
            preparedStatement.setInt(3, produto.getQuantidade());
            preparedStatement.setString(4, produto.getCodigo());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Falha ao cadastrar o produto.");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou executar SQL: " + e.getMessage());
        }

        return produto;
    }

    @Override
    public void excluir(Long id) {


    }
}
