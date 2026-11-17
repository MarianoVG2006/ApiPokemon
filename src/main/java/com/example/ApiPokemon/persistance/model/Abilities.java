package com.example.ApiPokemon.persistance.model;

import javax.annotation.processing.Generated;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.Table;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity 
@Table(name = "abilities")
@NoArgsConstructor
@Getter 
@Setter


public class Abilities {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long idAbilities;
    @Column (name = "name")
    private String name;
    @Column (name = "description")
    private String description;
    
}
