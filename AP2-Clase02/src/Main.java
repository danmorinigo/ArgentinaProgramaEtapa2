import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> enMinusculas = new ArrayList<>();
        enMinusculas.add("hola");
        enMinusculas.add("chau");
        enMinusculas.add("casa");
        enMinusculas.add("departamento");
        enMinusculas.add("museo");
        System.out.println("Lista original");
        for(String contenido:enMinusculas){
            System.out.println(contenido);
        }
        System.out.println("\"pasarAMayusculas\"");
        ArrayList<String> transformadas = pasarAMayusculas(enMinusculas);
        for(String contenido:transformadas){
            System.out.println(contenido);
        }
        System.out.println("\"pasarAMayusculasV2\"");
        ArrayList<String> transformadas2 = pasarAMayusculasV2(enMinusculas, (x)->x.toUpperCase());
        for(String contenido:transformadas2){
            System.out.println(contenido);
        }
        System.out.println("Lista original");
        for(String contenido:enMinusculas){
            System.out.println(contenido);
        }
    }
    static ArrayList<String> pasarAMayusculas(ArrayList<String> listaDePalabras){
        ArrayList<String> transformadasEnMayusculas = new ArrayList<>();
        for(String palabra:listaDePalabras){
            Transformador palabraATransformar = (x) -> x.toUpperCase();
            String palabraEnMayusculas = palabraATransformar.enMayusculas(palabra);
            transformadasEnMayusculas.add(palabraEnMayusculas);
        }
        return transformadasEnMayusculas;
    }
    static ArrayList<String> pasarAMayusculasV2(ArrayList<String> listaDePalabras, Transformador transformador){
        ArrayList<String> transformadasEnMayusculas = new ArrayList<>();
        for(String palabra:listaDePalabras){
            transformadasEnMayusculas.add(transformador.enMayusculas(palabra));
        }
        return transformadasEnMayusculas;
    }
}
@FunctionalInterface
interface Transformador{
    String enMayusculas(String palabra);
}