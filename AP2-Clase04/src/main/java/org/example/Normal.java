package org.example;

public class Normal implements Popularidad{
    private int reproducciones = 0;
    private int likes = 0;
    private int desLikes = 0;
    @Override
    public String detallesDelTema(Cancion cancion) {
        return Icono.MUSICAL_NOTE.imagen()+"-"+cancion.getArtista().getNombre()+"-"+cancion.getNombre();
    }

    @Override
    public void sumarUnaReproduccion(Cancion cancion) {
        reproducciones++;
        this.actualizarPopularidad(cancion);
    }

    @Override
    public void actualizarPopularidad(Cancion cancion) {
        if(reproducciones > 1000) {
            cancion.pasaAEnAuge();
        }
    }

    @Override
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
