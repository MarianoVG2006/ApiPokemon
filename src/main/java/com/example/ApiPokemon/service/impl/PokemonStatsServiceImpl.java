package com.example.ApiPokemon.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ApiPokemon.persistance.model.PokemonStats;
import com.example.ApiPokemon.persistance.repository.PokemonStatsRepository;
import com.example.ApiPokemon.service.PokemonStatsService;

import lombok.AllArgsConstructor;
@Service 
@AllArgsConstructor 
public class PokemonStatsServiceImpl implements PokemonStatsService {

    PokemonStatsRepository pokemonStatsRepository;

    @Override 
    public List<PokemonStats> getAllPokemonStats() {
        return pokemonStatsRepository.findAll();
    }

    @Override
    public PokemonStats getPokemonStatsById(Long id) {
        return pokemonStatsRepository.findById(id).orElse(null);
    }

    @Override
    public PokemonStats createPokemonStats(PokemonStats pokemonStats) {
        return pokemonStatsRepository.save(pokemonStats);
    }
    @Override
    public PokemonStats updatePokemonStats(Long id, PokemonStats pokemonStats) {
        return pokemonStatsRepository.findById(id).map(existingPokemonStats -> {
            existingPokemonStats.setHp(pokemonStats.getHp());
            existingPokemonStats.setAttack(pokemonStats.getAttack());
            existingPokemonStats.setDefense(pokemonStats.getDefense());
            existingPokemonStats.setSpeed(pokemonStats.getSpeed());
            return pokemonStatsRepository.save(existingPokemonStats);
        }).orElseThrow(() -> new RuntimeException("Pokemon stats " + id + " not found"));
    }

    
}
