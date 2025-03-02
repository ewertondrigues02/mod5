package br.com.ewerton.cadastromemes.controllers;

import br.com.ewerton.cadastromemes.entities.CategoriaMeme;
import br.com.ewerton.cadastromemes.entities.Meme;
import br.com.ewerton.cadastromemes.entities.Usuario;
import br.com.ewerton.cadastromemes.services.ServicoMemelandia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class ControllerMemelandia {
    @Autowired
    private ServicoMemelandia servicoMemelandia;

    @GetMapping("/usuarios")
    public List<Usuario> buscaUsuarios() {
        return servicoMemelandia.listaTodosUsuarios();
    }

    @PostMapping("/usuarios")
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return servicoMemelandia.novoUsuario(usuario);
    }

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        return servicoMemelandia.listaTodasCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return servicoMemelandia.novaCategoriaMeme(categoriaMeme);
    }

    @GetMapping("/memes")
    public List<Meme> buscaMemes() {
        return servicoMemelandia.listaTodosMemes();
    }

    @PostMapping("/memes")
    public Meme novoMeme(@RequestBody Meme meme) {
        return servicoMemelandia.novoMeme(meme);
    }
}
