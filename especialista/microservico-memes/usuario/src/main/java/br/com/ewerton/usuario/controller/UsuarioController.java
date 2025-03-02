package br.com.ewerton.usuario.controller;

import br.com.ewerton.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/memes")
    public List<String> obterMemesDeOutroServico() {
        return usuarioService.obterMemesDoOutroServico();
    }
}


