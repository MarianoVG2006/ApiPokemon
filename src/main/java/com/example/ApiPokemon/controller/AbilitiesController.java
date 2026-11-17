package com.example.ApiPokemon.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiPokemon.controller.converter.AbilitiesConverter;
import com.example.ApiPokemon.controller.dto.AbilitiesDto;
import com.example.ApiPokemon.service.AbilitiesService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("/api/v3/abilities")
@CrossOrigin 
@AllArgsConstructor 
public class AbilitiesController {
    
    AbilitiesService abilitiesService;

    AbilitiesConverter converter;

    @GetMapping
    public ResponseEntity<List<AbilitiesDto>> getallabilities(){
        return  ResponseEntity.status(HttpStatus.OK).body(abilitiesService.getAllAbilities().stream().map(converter::convertToDto).collect(Collectors.toList()));
    } 
    
    
}
