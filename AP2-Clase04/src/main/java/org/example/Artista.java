package org.example;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Artista {
    private String nombre;
    private Set<Album> albumes;
    Artista(String nombre){
        this.nombre = nombre;
        albumes = new HashSet<>();
    }
}
