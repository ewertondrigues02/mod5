package br.com.ewerton.animalservice.controllers;

import br.com.ewerton.animalservice.entidade.Animal;
import br.com.ewerton.animalservice.repositorios.AnimalGatoRepositorio;
import br.com.ewerton.animalservice.repositorios.AnimalRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepositorio animalRepositorio;
    private AnimalGatoRepositorio animalGatoRepositorio;

    public AnimalController(AnimalRepositorio animalRepositorio) {
        this.animalRepositorio = animalRepositorio;
    }

    @GetMapping
    private List<Animal> findALl() {
        return animalRepositorio.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return animalRepositorio.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted() {
        return animalRepositorio.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdopted() {
        return animalRepositorio.findAdopted();
    }


}
