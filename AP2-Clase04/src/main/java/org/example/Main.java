package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import static java.time.LocalTime.now;
import static java.time.temporal.ChronoUnit.DAYS;
//import static java.util.concurrent.TimeUnit.DAYS;

public class Main {
    public static void main(String[] args) {
        Artista shakira = new Artista("Shakira");
        Cancion tema1 = new Cancion("Donde", shakira);
        Album nuevoAlbum = new Album("PrimerAlbum", shakira, 1992);
        nuevoAlbum.agregarTema(tema1);
        mostrar(tema1);

        for(int i = 0; i < 1001; i++) {
            tema1.reproducir();
        }
        for(int i = 0; i < 10000; i++) {
            tema1.recibeLike();
        }
        for(int i = 0; i < 500; i++) {
            tema1.recibeDesLike();
        }
        mostrar(tema1);

        for(int i = 1; i < 50001; i++) {
            tema1.reproducir();
        }
        for(int i = 0; i < 4501; i++) {
            tema1.recibeDesLike();
        }
        mostrar(tema1);

        for(int i = 0; i < 10001; i++) {
            tema1.recibeLike();
        }
        for(int i = 0; i < 1000; i++) {
            tema1.reproducir();
        }
        mostrar(tema1);

        for(int i = 0; i < 5001; i++) {
            tema1.recibeDesLike();
        }
        mostrar(tema1);

        for(int i = 0; i < 1000; i++) {
            tema1.reproducir();
        }
        mostrar(tema1);

        for(int i = 0; i < 50000; i++) {
            tema1.reproducir();
        }
        mostrar(tema1);

        for(int i = 0; i < 50001; i++) {
            tema1.recibeDesLike();
        }
        mostrar(tema1);

        tema1.reproducir();
        mostrar(tema1);

        tema1.setUltimaReproduccion(LocalDateTime.now().minusSeconds(86401));
        tema1.reproducir();
        mostrar(tema1);
    }
    private static void mostrar(Cancion cancion){
        System.out.println(cancion.detalles());
        System.out.println("\tReproducciones: " + cancion.getReproducciones() + "/" + cancion.getPopularidad().verVisualizaciones());
        System.out.println("\tLikes: " + cancion.getLikes() + "/" + cancion.getPopularidad().verLikes());
        System.out.println("\tDesLikes: " + cancion.getDesLikes() + "/" + cancion.getPopularidad().verDesLikes());
    }
}