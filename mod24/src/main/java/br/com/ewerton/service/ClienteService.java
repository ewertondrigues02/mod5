package br.com.ewerton.service;

import br.com.ewerton.dao.IClienteDao;

public class ClienteService {

    private IClienteDao iClienteDao;

    public ClienteService(IClienteDao iClienteDao) {
        this.iClienteDao = iClienteDao;
    }

    public String salvar() {
        iClienteDao.salvar();
        return "Sucesso";
    }
}
