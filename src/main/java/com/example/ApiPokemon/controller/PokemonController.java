package com.example.ApiPokemon.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiPokemon.controller.converter.PokemonConverter;
import com.example.ApiPokemon.controller.dto.PokemonDto;
import com.example.ApiPokemon.service.PokemonService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping ("/api/v3/pokemon")
@CrossOrigin 
@AllArgsConstructor 
public class PokemonController {
    
    PokemonService pokemonService;

    PokemonConverter converter;

    @GetMapping 
    public ResponseEntity<List<PokemonDto>> getAllPokemons() {
        return ResponseEntity.status(HttpStatus.OK).body(pokemonService.getAllPokemons().stream().map(converter::convertToDto).collect(Collectors.toList()));
    }
    
    @GetMapping("{id}")
    public ResponseEntity <List<PokemonDto>> getAllPokemons(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(List.of(converter.convertToDto(pokemonService.getPokemonById(id))));
    }
}
