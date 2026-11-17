package com.example.ApiPokemon.controller.converter;

import org.springframework.stereotype.Component;

import com.example.ApiPokemon.controller.dto.AbilitiesDto;
import com.example.ApiPokemon.persistance.model.Abilities;

import lombok.AllArgsConstructor;

@Component 
@AllArgsConstructor 
public class AbilitiesConverter {
    
   public AbilitiesDto convertToDto(Abilities abilities) {
        AbilitiesDto abilitiesDto = new AbilitiesDto();
        abilitiesDto.setIdAbilities(abilities.getIdAbilities());
        abilitiesDto.setName(abilities.getName());
        abilitiesDto.setDescription(abilities.getDescription());
        return abilitiesDto;
    } 

    public Abilities convertToEntity(AbilitiesDto abilitiesDto) {
        Abilities abilities = new Abilities();
        abilities.setIdAbilities(abilitiesDto.getIdAbilities());
        abilities.setName(abilitiesDto.getName());
        abilities.setDescription(abilitiesDto.getDescription());
        return abilities;
    }
}
