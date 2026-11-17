package com.example.ApiPokemon.persistance.model;

import java.util.List;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity 
@Table(name = "trainers")
@NoArgsConstructor
@Getter 
@Setter
public class Trainers {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long idTrainer;
    @Column (name = "name")
    private String name;
    @Column (name = "hometown")
    private String hometown;

    @OneToMany (mappedBy = "trainers" , fetch = FetchType.LAZY)
    private List<Pokemon> pokemons;
    

    

}
