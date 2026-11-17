package com.example.ApiPokemon.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ApiPokemon.persistance.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
    
}
