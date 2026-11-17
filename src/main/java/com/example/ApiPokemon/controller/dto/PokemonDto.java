package com.example.ApiPokemon.controller.dto;

import java.util.Set;

import lombok.Data;

@Data 
public class PokemonDto {

    private Long idPokemon;
    private String name;
    private String type;
    private Set<AbilitiesDto> abilities;
}
