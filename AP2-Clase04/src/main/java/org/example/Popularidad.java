package org.example;

public interface Popularidad {
    String detallesDelTema(Cancion cancion);

    void sumarUnaReproduccion(Cancion cancion);

    void actualizarPopularidad(Cancion cancion);

    int verVisualizaciones();

    void primerReproduccion();

    int verLikes();

    void sumarLike(Cancion cancion);

    int verDesLikes();
    void sumarDesLike(Cancion cancion);
}
