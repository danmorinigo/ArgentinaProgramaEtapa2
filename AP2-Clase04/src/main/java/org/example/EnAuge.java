package org.example;

public class EnAuge implements Popularidad{
    private int reproducciones = 0;
    private int likes = 0;
    private int desLikes = 0;
    @Override
    public String detallesDelTema(Cancion cancion) {
        return Icono.ROCKET.imagen()+
                "-"+
                cancion.getArtista().getNombre()+
                "-"+
                cancion.getNombre()+
                "("+cancion.getAlbum().getNombre()+"-"+
                cancion.getAlbum().getAnioLanzamiento()+")";
    }

    @Override
    public void sumarUnaReproduccion(Cancion cancion) {
        reproducciones++;
        this.actualizarPopularidad(cancion);
    }

    @Override
    public void actualizarPopularidad(Cancion cancion) {
        if(this.desLikes > 5000){
            cancion.pasaANormal();
        }
        else if ((reproducciones > 50000) && ( cancion.getLikes() > 20000)) {
            cancion.pasaAEnTendencia();
        }
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
        this.actualizarPopularidad(cancion);
    }
    public int verDesLikes(){
        return desLikes;
    }
    public void sumarDesLike(Cancion cancion){
        desLikes++;
        this.actualizarPopularidad(cancion);
    }
}
