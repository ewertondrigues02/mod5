package br.com.ewerton.usuario.repositories;


import br.com.ewerton.usuario.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
