package org.example;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EnTendencia implements Popularidad{
    private int reproducciones = 0;
    private int likes = 0;
    private int desLikes = 0;
    @Override
    public String detallesDelTema(Cancion cancion) {
        return Icono.FIRE.imagen()+"-"+cancion.getNombre()+"-"+
                cancion.getArtista().getNombre()+"("+
                cancion.getAlbum().getNombre()+"-"+
                cancion.getAlbum().getAnioLanzamiento()+")";
    }

    @Override
    public void sumarUnaReproduccion(Cancion cancion) {
        reproducciones++;
        this.actualizarPopularidad(cancion);
    }

    @Override
    public void actualizarPopularidad(Cancion cancion) {
        if(this.pasaronMasDe24hsDesdeUltimaReproduccion(cancion)){
            cancion.pasaANormal();
        }
    }

    private boolean pasaronMasDe24hsDesdeUltimaReproduccion(Cancion cancion) {
        LocalDateTime ultimaReproduccion = cancion.getUltimaReproduccion();
        LocalDateTime ahora = LocalDateTime.now();
        int tiempoLimite = 60*60*24; // 86.400 segundos = 24hs
        if(ChronoUnit.SECONDS.between(ultimaReproduccion, ahora) > tiempoLimite){
            return true;
        }
        return false;
    }

    public int verVisualizaciones() {
        return this.reproducciones;
    }
    public void primerReproduccion(){
        reproducciones = 1;
    }
    public int verLikes(){
        return this.likes;
    }
    public void sumarLike(Cancion cancion){
        likes++;
    }
    public int verDesLikes(){
        return desLikes;
    }
    public void sumarDesLike(Cancion cancion){
        desLikes++;
    }
}
