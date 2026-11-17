package com.example.ApiPokemon.service;



import java.util.List;

import com.example.ApiPokemon.persistance.model.Pokemon;

public interface PokemonService {
    
    List<Pokemon> getAllPokemons();
    Pokemon createPokemon(Pokemon pokemon);
    Pokemon getPokemonById(Long id);
    Pokemon updatePokemon(Long id, Pokemon pokemon);
    void deletePokemon(Long id);
}
