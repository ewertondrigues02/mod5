package br.com.ewerton.meme.categoriameme;


import br.com.ewerton.meme.categoriameme.dtos.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuario-service", url = "http://localhost:8081")
public interface UsuarioClient {

    @GetMapping("/usuarios/{id}")
    UsuarioDTO buscarUsuario(@PathVariable Long id);
}
