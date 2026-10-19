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
@Table(name = "pokemon")
@Data 
@NoArgsConstructor 

public class ApiPokemon {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name = "id")
Long id;

@Column(name = "name")
String name;

@Column (name = "imagen_url")
String imagenUrlImg;

@Column (name = "type")
String type;


}
