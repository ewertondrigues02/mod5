package br.com.ewerton.meme.categoriameme.controller;

import br.com.ewerton.categoriameme.entities.CategoriaMeme;

import br.com.ewerton.meme.categoriameme.service.CategoriaMemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaMemeController {

    @Autowired
    private CategoriaMemeService categoriaMemeService;

    @GetMapping
    public List<CategoriaMeme> listarCategorias() {
        return categoriaMemeService.listarCategorias();
    }

    @PostMapping
    public CategoriaMeme criarCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return categoriaMemeService.salvarCategoria(categoriaMeme);
    }

    @GetMapping("/{id}")
    public Optional<CategoriaMeme> buscarCategoriaPorId(@PathVariable Long id) {
        return categoriaMemeService.buscarCategoriaPorId(id);
    }
}
