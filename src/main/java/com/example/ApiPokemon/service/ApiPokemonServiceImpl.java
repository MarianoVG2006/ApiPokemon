package com.example.ApiPokemon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ApiPokemon.persistance.model.ApiPokemon;
import com.example.ApiPokemon.persistance.repository.ApiPokemonRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class ApiPokemonServiceImpl implements ApiPokemonService {

    ApiPokemonRepository apiPokemonRepository;

    @Override 
    public List<ApiPokemon> getAllPokemons() {
        return apiPokemonRepository.findAll();
    }

    @Override 
    public ApiPokemon getPokemonById(Long id) {
        return apiPokemonRepository.findById(id).orElse(null);
    }

    @Override 
    public ApiPokemon createPokemon(ApiPokemon pokemon) {
        return apiPokemonRepository.save(pokemon);
    }

    @Override 
    public ApiPokemon updatePokemon(Long id, ApiPokemon pokemon) {
        ApiPokemon existingPokemon = apiPokemonRepository.findById(id).orElse(null);
        if (existingPokemon != null) {
            existingPokemon.setName(pokemon.getName());
            existingPokemon.setImagenUrlImg(pokemon.getImagenUrlImg());
            existingPokemon.setType(pokemon.getType());
            return apiPokemonRepository.save(existingPokemon);
        }
        return null;
    }

    @Override 
    public void deletePokemon(Long id) {
        ApiPokemon existingPokemon = apiPokemonRepository.findById(id).orElse(null);
        apiPokemonRepository.delete(existingPokemon);
    }

    
}
