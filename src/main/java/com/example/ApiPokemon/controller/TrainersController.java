package com.example.ApiPokemon.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiPokemon.controller.converter.TrainersConverter;
import com.example.ApiPokemon.controller.dto.TrainersDto;
import com.example.ApiPokemon.service.TrainersService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("/api/v3/trainers")
@CrossOrigin 
@AllArgsConstructor 
public class TrainersController {
    TrainersService trainersService;

    TrainersConverter converter;

    @GetMapping
    public ResponseEntity<List<TrainersDto>> getAllTrainers() {
        return ResponseEntity.status(HttpStatus.OK).body((trainersService.getAllTrainers().stream().map(converter::convertToDto).collect(Collectors.toList())));

    }

    
    
}
