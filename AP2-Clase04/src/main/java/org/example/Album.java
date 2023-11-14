package org.example;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Album {
    private String nombre;
    private Artista artista;
    private Set<Cancion> temas;
    private int anioLanzamiento;
    Album(String nombre, Artista artista, int anioLanzamiento){
        this.nombre = nombre;
        this.artista = artista;
        this.anioLanzamiento = anioLanzamiento;
        temas = new HashSet<>();
    }

    public void agregarTema(Cancion cancion) {
        temas.add(cancion);
        cancion.setAlbum(this);
    }
}
