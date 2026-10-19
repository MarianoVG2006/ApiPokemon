package com.example.ApiPokemon.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
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

import com.example.ApiPokemon.persistance.model.ApiPokemon;
import com.example.ApiPokemon.service.ApiPokemonService;

import lombok.AllArgsConstructor;

@RestController 
@RequestMapping ("/api/v1/pokemon")
@CrossOrigin 
@AllArgsConstructor 
public class ApiPokemonController {

    ApiPokemonService apiPokemonService;

    @GetMapping
    public ResponseEntity<List<ApiPokemon>> getAllPokemons() {
        return ResponseEntity.ok(apiPokemonService.getAllPokemons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiPokemon> getPokemonById(@PathVariable Long id){
        return ResponseEntity.ok(apiPokemonService.getPokemonById(id));
    }

    @PostMapping 
    public ResponseEntity<ApiPokemon> createPokemon(@RequestBody ApiPokemon pokemon) {
        return ResponseEntity.ok(apiPokemonService.createPokemon(pokemon));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiPokemon> updatePokemon(@PathVariable Long id, @RequestBody ApiPokemon pokemon) {
        return ResponseEntity.ok(apiPokemonService.updatePokemon(id, pokemon));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePokemon(@PathVariable Long id) {
        apiPokemonService.deletePokemon(id);
        return ResponseEntity.noContent().build();
        
    }
    
}
