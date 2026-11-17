package com.example.ApiPokemon.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ApiPokemon.persistance.model.Pokemon;
import com.example.ApiPokemon.persistance.repository.PokemonRepository;
import com.example.ApiPokemon.service.PokemonService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class PokemonServiceImpl implements PokemonService {

    PokemonRepository pokemonRepository;

    @Override
    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    @Override 
    public Pokemon createPokemon(Pokemon pokemon) {
       return pokemonRepository.save(pokemon);
    }

    @Override
    public Pokemon getPokemonById(Long id) {
        return pokemonRepository.findById(id).orElseThrow(() -> new RuntimeException("Pokemon " + id + " no encontrado"));
    }

    @Override 
    public Pokemon updatePokemon(Long id, Pokemon pokemon) {
        return pokemonRepository.findById(id).map(p -> {
            p.setName(pokemon.getName());
            p.setType(pokemon.getType());
            p.setAbilities(pokemon.getAbilities());
            return pokemonRepository.save(p);
        }).orElseThrow(() -> new RuntimeException("Pokemon " + id + " no encontrado"));
    }

    @Override 
    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
    }
}
