package com.example.ApiPokemon.persistance.repository;


import org.springframework.data.jpa.repository.JpaRepository;



import com.example.ApiPokemon.persistance.model.PokemonStats;

public interface PokemonStatsRepository extends JpaRepository<PokemonStats, Long> {
    
}
