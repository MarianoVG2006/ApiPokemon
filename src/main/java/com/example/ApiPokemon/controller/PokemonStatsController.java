package com.example.ApiPokemon.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiPokemon.controller.converter.PokemonStatsConverte;
import com.example.ApiPokemon.controller.dto.PokemonStatsDto;
import com.example.ApiPokemon.service.PokemonStatsService;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("/api/v3/pokemonstats")
@CrossOrigin 
@AllArgsConstructor 
public class PokemonStatsController {
    PokemonStatsService pokemonStatsService;

    PokemonStatsConverte converter;

    @GetMapping 
    public ResponseEntity <List<PokemonStatsDto>> getAllPokemonStats() {
        return ResponseEntity.status(HttpStatus.OK).body(pokemonStatsService.getAllPokemonStats().stream().map(converter::convertToDto).collect(Collectors.toList()));
    }
}
