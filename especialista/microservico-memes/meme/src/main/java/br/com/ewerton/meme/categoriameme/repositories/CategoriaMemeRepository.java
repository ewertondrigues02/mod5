package br.com.ewerton.meme.categoriameme.repositories;

import br.com.ewerton.categoriameme.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaMemeRepository extends JpaRepository<CategoriaMeme, Long> {
}

