package com.example.ApiPokemon.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.ApiPokemon.persistance.model.Trainers;
import com.example.ApiPokemon.persistance.repository.TrainersRepository;
import com.example.ApiPokemon.service.TrainersService;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class TrainersServiceImpl implements TrainersService {

        TrainersRepository trainersRepository;

        @Override 
        public List<Trainers> getAllTrainers() {
            return trainersRepository.findAll();
        }

        @Override
        public Trainers getTrainerById(Long id) {
            return trainersRepository.findById(id).orElseThrow(() -> new RuntimeException("Entrenador " + id + " no encontrado"));
        }

        @Override 
        public Trainers createTrainer(Trainers trainer) {
            return trainersRepository.save(trainer);
        }

        @Override
        public void deleteTrainer(Long id) {
            trainersRepository.deleteById(id);
        }

        @Override
        public Trainers updateTrainer(Long id, Trainers trainer) {
            return trainersRepository.findById(id).map(t -> {
                t.setName(trainer.getName());
                t.setHometown(trainer.getHometown());
                t.setPokemons(trainer.getPokemons());
                return trainersRepository.save(t);
            }).orElseThrow(() -> new RuntimeException("Entrenador " + id + " no encontrado"));
        }

        @Override
        public Trainers getTrainerByName(String name) {
            return trainersRepository.findByName(name).orElseThrow(() -> new RuntimeException("Entrenador " + name + " no encontrado"));
        }
    
}
