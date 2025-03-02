package br.com.ewerton.meme.categoriameme.service;

import br.com.ewerton.meme.categoriameme.UsuarioClient;
import br.com.ewerton.meme.categoriameme.dtos.UsuarioDTO;
import br.com.ewerton.meme.categoriameme.repositories.CategoriaMemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoriaMemeService {

    @Autowired
    private CategoriaMemeRepository categoriaMemeRepository;

    @Autowired
    private UsuarioClient usuarioClient;

    public List<br.com.ewerton.categoriameme.entities.CategoriaMeme> listarCategorias() {
        return categoriaMemeRepository.findAll();
    }

    public br.com.ewerton.categoriameme.entities.CategoriaMeme salvarCategoria(br.com.ewerton.categoriameme.entities.CategoriaMeme categoriaMeme) {

        UsuarioDTO usuario = usuarioClient.buscarUsuario(categoriaMeme.getUsuarioId());
        if (usuario == null) {
            throw new RuntimeException("Usuário não encontrado!");
        }

        return categoriaMemeRepository.save(categoriaMeme);
    }

    public Optional<br.com.ewerton.categoriameme.entities.CategoriaMeme> buscarCategoriaPorId(Long id) {
        return categoriaMemeRepository.findById(id);
    }
}
