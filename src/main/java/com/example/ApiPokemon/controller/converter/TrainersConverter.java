package com.example.ApiPokemon.controller.converter;

import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.ApiPokemon.controller.dto.TrainersDto;
import com.example.ApiPokemon.persistance.model.Trainers;

import lombok.AllArgsConstructor;

@Component 
@AllArgsConstructor 
public class TrainersConverter {

    public TrainersDto convertToDto(Trainers trainers) {
      TrainersDto trainersDto = new TrainersDto();
        trainersDto.setIdTrainer(trainers.getIdTrainer());
        trainersDto.setName(trainers.getName());
        trainersDto.setHometown(trainers.getHometown());
        return trainersDto;
    }

    public Trainers convertToEntity(TrainersDto trainersDto) {
        Trainers trainers = new Trainers();
        trainers.setIdTrainer(trainersDto.getIdTrainer());
        trainers.setName(trainersDto.getName());
        trainers.setHometown(trainersDto.getHometown());
        return trainers;
    }
    
}
