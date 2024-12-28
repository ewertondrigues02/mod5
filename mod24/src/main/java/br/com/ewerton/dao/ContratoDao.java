package br.com.ewerton.dao;

public class ContratoDao implements IContratoDao{

    @Override
    public String salvarContratoDao() {
        return "Contrato Salvo";
    }

    @Override
    public String buscarContratoDao() {
        return "Contrato Encontrado";
    }

    @Override
    public String excluirContratoDao() {
        return "Contrato Excluido";
    }

    @Override
    public String atualizarContratoDao() {
        return "Contrato Atualizado";
    }
}
