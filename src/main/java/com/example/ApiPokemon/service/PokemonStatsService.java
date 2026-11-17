package com.example.ApiPokemon.service;

import java.util.List;

import com.example.ApiPokemon.persistance.model.PokemonStats;

public interface PokemonStatsService {
    List<PokemonStats> getAllPokemonStats();
    PokemonStats getPokemonStatsById(Long id);
    PokemonStats createPokemonStats(PokemonStats pokemonStats);
    PokemonStats updatePokemonStats(Long id, PokemonStats pokemonStats);
    
}
