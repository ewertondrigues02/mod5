package br.com.ewerton.service;

import br.com.ewerton.dao.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao iContratoDao;

    public ContratoService(IContratoDao iContratoDao) {
        this.iContratoDao = iContratoDao;
    }

    @Override
    public String salvarContratoService() {
        String contratoSalvo = iContratoDao.salvarContratoDao();
        return contratoSalvo;
    }

    @Override
    public String buscarContraService() {
        String contratoEncontrado = iContratoDao.buscarContratoDao();
        return contratoEncontrado;
    }

    @Override
    public String excluirContratoService() {
        String contratoExcluido = iContratoDao.excluirContratoDao();
        return contratoExcluido;
    }

    @Override
    public String atualizarContratoService() {
        String contratoAtualizado = iContratoDao.atualizarContratoDao();
        return contratoAtualizado;
    }
}
