package br.com.ewerton.usuario.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "memeClient", url = "${memeService.url}")
interface MemeClient {

    @GetMapping("/memes")
    List<String> listarMemes();
}

