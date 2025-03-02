package br.com.ewerton.cadastromemes.repositories;

import br.com.ewerton.cadastromemes.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
