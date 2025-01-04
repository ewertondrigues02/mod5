package br.com.ewerton.dao;

import br.com.ewerton.connection.ConnectionFactory;
import br.com.ewerton.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao implements IProdutoDao{

    private Produto produto;


    @Override
    public Integer cadastrarProduto(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            adicionarParamentrosInsert(stm, produto);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Integer atualizarProduto(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            adicionarParamentrosUpdate(stm, produto);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Produto buscarProduto(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produto = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            adicionarParamentrosSelect(stm, codigo);
            rs = stm.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                String cd = rs.getString("CODIGO");
                produto.setId(id);
                produto.setNome(nome);
                produto.setCodigo(cd);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodosProdutos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produto> list = new ArrayList<>();
        Produto produto = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                produto = new Produto();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                String cd = rs.getString("CODIGO");
                produto.setId(id);
                produto.setNome(nome);
                produto.setCodigo(cd);
                list.add(produto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }

    private String getSqlInsert() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO TB_PRODUTO (ID, CODIGO, NOME)");
        sb.append("VALUES (nextval('SQ_PRODUTO'),?,?)");
        return sb.toString();
    }

    private void adicionarParamentrosInsert(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getCodigo());
        stm.setString(2, produto.getNome());
    }

    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_PRODUTO ");
        sb.append("SET CODIGO = ?, NOME = ? ");
        sb.append("WHERE ID = ?");
        return sb.toString();
    }

    private void adicionarParamentrosUpdate(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getCodigo());  // Primeiro, o código
        stm.setString(2, produto.getNome());    // Depois, o nome
        stm.setLong(3, produto.getId());        // Por fim, o ID
    }

    private String getSqlSelect() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_PRODUTO ");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }

    private void adicionarParamentrosSelect(PreparedStatement stm, String codigo) throws SQLException {
        stm.setString(1, codigo);
    }

    private String getSqlDelete() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_PRODUTO ");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }

    private void adicionarParamentrosDelete(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getCodigo());
    }

    private String getSqlSelectAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_CLIENTE");
        return sb.toString();
    }

    @Override
    public  Integer excluirProduto(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            adicionarParamentrosDelete(stm, produto);
            return stm.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }


    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
