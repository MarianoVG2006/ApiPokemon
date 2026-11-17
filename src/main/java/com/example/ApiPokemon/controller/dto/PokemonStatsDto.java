package com.example.ApiPokemon.controller.dto;



import lombok.Data;

@Data 
public class PokemonStatsDto {
    private Long id;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private double height;
    private double weight;
    


}
