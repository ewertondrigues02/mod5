package br.com.ewerton.animalservice.controllers;

import br.com.ewerton.animalservice.entidade.Animal;
import br.com.ewerton.animalservice.entidade.AnimalGato;
import br.com.ewerton.animalservice.repositorios.AnimalGatoRepositorio;
import br.com.ewerton.animalservice.repositorios.AnimalRepositorio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/animais-gatos")
public class AnimalGatoController {

    private AnimalRepositorio animalRepositorio;
    private AnimalGatoRepositorio animalGatoRepositorio;

    public AnimalGatoController(AnimalRepositorio animalRepositorio, AnimalGatoRepositorio animalGatoRepositorio) {
        this.animalRepositorio = animalRepositorio;
        this.animalGatoRepositorio = animalGatoRepositorio;
    }

    @GetMapping
    private List<AnimalGato> findALl() {
        return animalGatoRepositorio.findAll();
    }

    @PostMapping
    private AnimalGato create(@RequestBody AnimalGato animalGato) {
        return animalGatoRepositorio.save(animalGato);
    }

    @GetMapping("/not-adopted")
    private List<AnimalGato> findNotAdopted() {
        return animalGatoRepositorio.findNotAdopted();
    }

    @GetMapping("/adopted")
    private List<AnimalGato> findAdopted() {
        return animalGatoRepositorio.findAdopted();
    }

    public List<Object> findAllAnimals() {
        List<Animal> animals = animalRepositorio.findAll();
        List<AnimalGato> gatos = animalGatoRepositorio.findAll();

        List<Object> todosAnimais = new ArrayList<>();
        todosAnimais.addAll(animals);
        todosAnimais.addAll(gatos);

        return todosAnimais;
    }

}
