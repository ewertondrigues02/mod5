package br.com.ewerton.meme.meme.services;



import br.com.ewerton.meme.categoriameme.UsuarioClient;
import br.com.ewerton.meme.categoriameme.dtos.UsuarioDTO;
import br.com.ewerton.meme.categoriameme.service.CategoriaMemeClient;
import br.com.ewerton.meme.meme.dto.CategoriaMemeDTO;
import br.com.ewerton.meme.meme.entities.Meme;
import br.com.ewerton.meme.meme.repositories.MemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemeService {

    @Autowired
    private MemeRepository memeRepository;

    @Autowired
    private UsuarioClient usuarioClient;

    @Autowired
    private CategoriaMemeClient categoriaMemeClient;

    public List<Meme> listarMemes() {
        return memeRepository.findAll();
    }

    public Meme salvarMeme(Meme meme) {

        UsuarioDTO usuario = usuarioClient.buscarUsuario(meme.getUsuarioId());
        if (usuario == null) {
            throw new RuntimeException("Usuário não encontrado!");
        }

        CategoriaMemeDTO categoria = categoriaMemeClient.buscarCategoria(meme.getCategoriaMemeId());
        if (categoria == null) {
            throw new RuntimeException("Categoria não encontrada!");
        }

        return memeRepository.save(meme);
    }

    public Optional<Meme> buscarMemePorId(Long id) {
        return memeRepository.findById(id);
    }
}

