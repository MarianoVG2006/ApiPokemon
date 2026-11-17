package com.example.ApiPokemon.controller.converter;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.ApiPokemon.controller.dto.PokemonDto;
import com.example.ApiPokemon.persistance.model.Pokemon;

import lombok.AllArgsConstructor;

@Component 
@AllArgsConstructor 
public class PokemonConverter {

    final AbilitiesConverter abili;
    
    public PokemonDto convertToDto(Pokemon pokemon) {
        PokemonDto pokemonDto = new PokemonDto();
        pokemonDto.setIdPokemon(pokemon.getIdPokemon());
        pokemonDto.setName(pokemon.getName());
        pokemonDto.setType(pokemon.getType());

        if (pokemon.getAbilities() != null) {
            pokemonDto.setAbilities(
                pokemon.getAbilities().stream()
                    .map(abili::convertToDto)
                    .collect(Collectors.toSet())
            );
        }
        return pokemonDto;
    } 

    public Pokemon convertToEntity(PokemonDto pokemonDto) {
        Pokemon pokemon = new Pokemon();
        pokemon.setIdPokemon(pokemonDto.getIdPokemon());
        pokemon.setName(pokemonDto.getName());
        pokemon.setType(pokemonDto.getType());
        return pokemon;
    }
}
