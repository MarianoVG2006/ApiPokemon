package com.example.ApiPokemon.service.impl;

import java.util.List;
import com.example.ApiPokemon.service.AbilitiesService;


import org.springframework.stereotype.Service;

import com.example.ApiPokemon.persistance.model.Abilities;
import com.example.ApiPokemon.persistance.repository.AbilitiesRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class AbilitiesServiceImpl implements AbilitiesService {
    
    private final AbilitiesRepository abilities;
    @Override 
    public List<Abilities> getAllAbilities() {
        return abilities.findAll();
    }
    @Override 
    public Abilities insertarAbilities(Abilities abilities) {
        return this.abilities.save(abilities);
    }
    @Override 
    public Abilities getAbilitiesById(Long id) {
        return abilities.findById(id).orElseThrow(() -> new RuntimeException("Abilities " + id + " no encontrado"));
    }

    @Override 
    public Abilities updateAbilities(Long id, Abilities abilities) {
        return this.abilities.findById(id).map(a -> {
            
            return this.abilities.save(a);
        }).orElseThrow(() -> new RuntimeException("Abilities " + id + " no encontrado"));
    }

   

}
