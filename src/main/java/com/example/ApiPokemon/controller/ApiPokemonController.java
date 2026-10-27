package com.example.ApiPokemon.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiPokemon.controller.converter.ApiPokemonConverter;
import com.example.ApiPokemon.controller.dto.ApiPokemonDto;
import com.example.ApiPokemon.persistance.model.ApiPokemon;
import com.example.ApiPokemon.service.ApiPokemonService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping ("/api/v2/pokemon")
@CrossOrigin 
@AllArgsConstructor 
public class ApiPokemonController {

    ApiPokemonService apiPokemonService;

    ApiPokemonConverter converter;

    @GetMapping
    public ResponseEntity<List<ApiPokemonDto>> getAllProducts() {
        return ResponseEntity.ok(apiPokemonService.getAllPokemons().stream().map(converter::convertToDto).collect(Collectors.toList()));
    }

    @GetMapping ("/")
    public ResponseEntity<List<ApiPokemonDto>> getAllProducts2() {
        List<ApiPokemonDto> productDtos = new ArrayList<>();
        for(ApiPokemon product : apiPokemonService.getAllPokemons()) {
            ApiPokemonDto productDto = converter.convertToDto(product);
            productDtos.add(productDto);
        }
        return ResponseEntity.ok(productDtos);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ApiPokemonDto> getPokemonById(@PathVariable Long id){

        ApiPokemon pokemon = apiPokemonService.getPokemonById(id);

        return ResponseEntity.status(HttpStatus.OK).body(converter.convertToDto(pokemon));

    }

    @PostMapping 
    public ResponseEntity<ApiPokemonDto> createPokemon(@RequestBody ApiPokemonDto pokemon) {
        ApiPokemon apipokemon = converter.convertToEntity(pokemon);
        return ResponseEntity.status(HttpStatus.CREATED).body((converter.convertToDto(apiPokemonService.createPokemon(apipokemon))));
    }

    @PutMapping ("/{id}")
    public ResponseEntity<ApiPokemonDto> updateProduct(@PathVariable Long id, @RequestBody ApiPokemonDto apipokemondto) {
        ApiPokemon apipokemon = converter.convertToEntity(apipokemondto);
        return ResponseEntity.ok(converter.convertToDto(apiPokemonService.updatePokemon(id, apipokemon)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePokemon(@PathVariable Long id) {
        apiPokemonService.deletePokemon(id);
        return ResponseEntity.noContent().build();
        
    }
    
}
