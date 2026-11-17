package com.example.ApiPokemon.service;

import java.util.List;

import com.example.ApiPokemon.persistance.model.Trainers;

public interface TrainersService {
    List<Trainers> getAllTrainers();
    Trainers getTrainerById(Long id);
    Trainers createTrainer(Trainers trainer);
    void deleteTrainer(Long id);
    Trainers updateTrainer(Long id, Trainers trainer);
    Trainers getTrainerByName(String name);
}
