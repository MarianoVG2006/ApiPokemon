package com.example.ApiPokemon.controller.converter;

import org.springframework.stereotype.Component;

import com.example.ApiPokemon.controller.dto.PokemonStatsDto;
import com.example.ApiPokemon.persistance.model.PokemonStats;

import lombok.AllArgsConstructor;

@Component 
@AllArgsConstructor 
public class PokemonStatsConverte {

    public PokemonStatsDto convertToDto(PokemonStats pokemonStats) {
        PokemonStatsDto pokemonStatsDto = new PokemonStatsDto();
        pokemonStatsDto.setId(pokemonStats.getIdPokemonStats());
        pokemonStatsDto.setHp(pokemonStats.getHp());
        pokemonStatsDto.setAttack(pokemonStats.getAttack());
        pokemonStatsDto.setDefense(pokemonStats.getDefense());
        pokemonStatsDto.setSpeed(pokemonStats.getSpeed());
        pokemonStatsDto.setHeight(pokemonStats.getHeight());
        pokemonStatsDto.setWeight(pokemonStats.getWeight());
        return pokemonStatsDto;
    } 

    public PokemonStatsDto convertToEntity(PokemonStatsDto pokemonStatsDto) {
        PokemonStatsDto pokemonStats = new PokemonStatsDto();
        pokemonStats.setId(pokemonStatsDto.getId());
        pokemonStats.setHp(pokemonStatsDto.getHp());
        pokemonStats.setAttack(pokemonStatsDto.getAttack());
        pokemonStats.setDefense(pokemonStatsDto.getDefense());
        pokemonStats.setSpeed(pokemonStatsDto.getSpeed());
        pokemonStats.setHeight(pokemonStatsDto.getHeight());
        pokemonStats.setWeight(pokemonStatsDto.getWeight());
        return pokemonStats;
    }
}
