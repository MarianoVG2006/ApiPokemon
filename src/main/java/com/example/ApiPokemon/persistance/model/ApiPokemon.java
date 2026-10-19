package com.example.ApiPokemon.persistance.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "api_pokemon")
@Data 
@NoArgsConstructor 

public class ApiPokemon {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name = "pokemon_id")
Long id;

@Column(name = "pokemon_name")
String name;

@Column (name = "pokemon_imagen_url_img")
String imagenUrlImg;

@Column (name = "pokemon_type")
String type;


}
