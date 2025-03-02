package br.com.ewerton.cadastromemes.repositories;

import br.com.ewerton.cadastromemes.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
