package com.example.ApiPokemon.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ApiPokemon.persistance.model.Abilities;

public interface AbilitiesRepository extends JpaRepository<Abilities, Long> {
    
}
