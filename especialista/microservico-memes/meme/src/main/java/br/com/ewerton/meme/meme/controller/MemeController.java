package br.com.ewerton.meme.meme.controller;

import br.com.ewerton.meme.meme.entities.Meme;
import br.com.ewerton.meme.meme.services.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/memes")
public class MemeController {

    @Autowired
    private MemeService memeService;

    @GetMapping
    public List<Meme> listarMemes() {
        return memeService.listarMemes();
    }

    @PostMapping
    public Meme criarMeme(@RequestBody Meme meme) {
        return memeService.salvarMeme(meme);
    }

    @GetMapping("/{id}")
    public Optional<Meme> buscarMemePorId(@PathVariable Long id) {
        return memeService.buscarMemePorId(id);
    }
}
