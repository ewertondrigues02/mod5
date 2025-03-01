package br.com.ewerton.animalservice.repositorios;

import br.com.ewerton.animalservice.entidade.AnimalGato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalGatoRepositorio extends JpaRepository<AnimalGato, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada DESC")
    List<AnimalGato> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL")
    List<AnimalGato> findAdopted();
}
