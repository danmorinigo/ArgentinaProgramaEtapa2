package org.example;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Cancion {
    private String nombre;
    private Artista artista;
    private Album album;
    private int likes = 0;
    private int desLikes = 0;
    private int reproducciones = 0;
    private LocalDateTime ultimaReproduccion = null;
    private Popularidad popularidad = new Normal();
    Cancion(String nombre, Artista artista){
        this.nombre = nombre;
        this.artista = artista;
    }

    public String detalles() {
        return popularidad.detallesDelTema(this);
    }

    public void reproducir() {
        reproducciones++;
        popularidad.sumarUnaReproduccion(this);
        ultimaReproduccion = LocalDateTime.now();
    }

    protected void pasaAEnAuge() {
        this.popularidad = new EnAuge();
        popularidad.primerReproduccion();
    }

    public void pasaAEnTendencia() {
        this.popularidad = new EnTendencia();
        popularidad.primerReproduccion();
    }
    public void pasaANormal() {
        this.popularidad = new Normal();
        popularidad.primerReproduccion();
    }

    public void recibeLike() {
        likes++;
        popularidad.sumarLike(this);
    }
    public void recibeDesLike() {
        desLikes++;
        popularidad.sumarDesLike(this);
    }
}
