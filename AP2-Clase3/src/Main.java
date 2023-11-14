import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> listaMinusculas = new ArrayList<>();
        listaMinusculas.add("hola");
        listaMinusculas.add("escuela");
        listaMinusculas.add("chau");
        listaMinusculas.add("automovil");
        listaMinusculas.add("auto");
        listaMinusculas.add("ferrocarril");
        listaMinusculas.add("perro");
        listaMinusculas.add("bicicleta");
        List<String> listaMayusculas = pasarAMayusculas(listaMinusculas, (palabra) -> palabra.toUpperCase());
        //-------------------------------------------
        listaMayusculas.forEach(System.out::println);
        //listaMinusculas.forEach(System.out::println);
        //-------------------------------------------
        String juntitos = concatenarSi(listaMinusculas, 4);
        System.out.println(juntitos);
    }
    static List<String> pasarAMayusculas(List<String> listaStrings, ManejoDeStrings transformar){
        return listaStrings.stream().map((unString) -> transformar.aplicarCambio(unString)).collect(Collectors.toList());
    }
    static String concatenarSi(List<String> listaStrings, int caracteresMinimos){
        List<String> resultado = new ArrayList<>();
        if(listaStrings.stream().anyMatch((palabra) -> palabra.length() > caracteresMinimos)){
            for(String palabra:listaStrings){
                if(palabra.length()>caracteresMinimos){resultado.add(palabra);}
            }
        }
        return resultado.stream().collect(Collectors.joining(", "));
    }
}
@FunctionalInterface
interface ManejoDeStrings{
    String aplicarCambio(String palabraAManejar);
}