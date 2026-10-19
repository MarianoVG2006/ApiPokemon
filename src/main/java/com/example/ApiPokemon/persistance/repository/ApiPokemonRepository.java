package com.example.ApiPokemon.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ApiPokemon.persistance.model.ApiPokemon;

public interface ApiPokemonRepository extends JpaRepository<ApiPokemon, Long> {
    
}
