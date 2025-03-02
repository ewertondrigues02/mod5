package br.com.ewerton.meme.categoriameme.service;


import br.com.ewerton.meme.meme.dto.CategoriaMemeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "categoriaMemeClient", url = "${categoriaMemeService.url}")
public interface CategoriaMemeClient {

    @GetMapping("/categoria/{id}")
    CategoriaMemeDTO buscarCategoria(@PathVariable("id") Long id);
}

