package com.example.ApiPokemon.service;

import java.util.List;

import com.example.ApiPokemon.persistance.model.ApiPokemon;

public interface ApiPokemonService {

    public List<ApiPokemon> getAllPokemons();
    public ApiPokemon getPokemonById(Long id);
    public ApiPokemon createPokemon(ApiPokemon pokemon);
    public ApiPokemon updatePokemon(Long id, ApiPokemon pokemon);
    public void deletePokemon(Long id);
    
}
