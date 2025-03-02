package br.com.ewerton.meme.meme.repositories;

import br.com.ewerton.meme.meme.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemeRepository extends JpaRepository<Meme, Long> {
}

