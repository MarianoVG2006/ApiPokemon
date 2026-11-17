package com.example.ApiPokemon.persistance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ApiPokemon.persistance.model.Trainers;

public interface TrainersRepository extends JpaRepository<Trainers, Long> {
    Optional<Trainers> findByName(String name);
}
