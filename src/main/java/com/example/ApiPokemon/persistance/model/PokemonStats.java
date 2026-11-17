package com.example.ApiPokemon.persistance.model;

import javax.annotation.processing.Generated;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity 
@Table(name = "pokemon_stats")
@NoArgsConstructor
@Getter 
@Setter

public class PokemonStats {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long idPokemonStats;
    @Column (name = "hp")
    private int hp;
    @Column (name = "attack")
    private int attack;
    @Column (name = "defense")
    private int defense;
    @Column (name = "speed")
    private int speed;
    @Column (name = "height")
    private double height;
    @Column (name = "weight")
    private double weight;

   @OneToOne (fetch = FetchType.LAZY)
   @JoinColumn (name = "pokemon_id", referencedColumnName = "id", unique = true)
    Pokemon pokemon;
}
