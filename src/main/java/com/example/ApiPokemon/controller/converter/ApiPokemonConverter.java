package com.example.ApiPokemon.controller.converter;

import org.springframework.stereotype.Component;

import com.example.ApiPokemon.controller.dto.ApiPokemonDto;
import com.example.ApiPokemon.persistance.model.ApiPokemon;

@Component 
public class ApiPokemonConverter {
    
    public ApiPokemonDto convertToDto(ApiPokemon apiPokemon) {
        ApiPokemonDto Pokemondto = new ApiPokemonDto();
        Pokemondto.setId(apiPokemon.getId());
        Pokemondto.setName(apiPokemon.getName());
        Pokemondto.setType(apiPokemon.getType());
        return Pokemondto;
    }

    public ApiPokemon convertToEntity(ApiPokemonDto apiPokemonDto) {
        ApiPokemon apipokemon = new ApiPokemon();
        apipokemon.setName(apiPokemonDto.getName());
        apipokemon.setType(apiPokemonDto.getType());
        return apipokemon;
    }
}
