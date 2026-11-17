package com.example.ApiPokemon.service;

import java.util.List;

import com.example.ApiPokemon.persistance.model.Abilities;

public interface AbilitiesService {
    List<Abilities> getAllAbilities();
    Abilities insertarAbilities(Abilities abilities);
    Abilities getAbilitiesById(Long id);
    Abilities updateAbilities(Long id, Abilities abilities);

}
