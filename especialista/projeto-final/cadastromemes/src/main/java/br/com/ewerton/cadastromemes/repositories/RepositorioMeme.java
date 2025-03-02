package br.com.ewerton.cadastromemes.repositories;

import br.com.ewerton.cadastromemes.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {
}
