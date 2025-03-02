package br.com.ewerton.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private MemeClient memeClient;

    public List<String> obterMemesDoOutroServico() {
        return memeClient.listarMemes();
    }
}
