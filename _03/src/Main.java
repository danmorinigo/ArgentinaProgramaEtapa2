import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> listado = new ArrayList<>();
        listado.add(5);
        listado.add(-5);
        listado.add(-50);
        listado.add(554);
        listado.add(325);
        listado.add(-65);
        listado.stream().forEach((numero)->System.out.println(numero));
        System.out.println("null");
        listado.forEach(System.out::println); //Lo mismo de arriba pero escrito de forma distinta.
        boolean coincideUno = listado.stream().anyMatch((numero) -> numero < 75);
        System.out.println(coincideUno);
        boolean coincidenTodos = listado.stream().allMatch((numero) -> numero < 75);
        System.out.println(coincidenTodos);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Daniel"));
        personas.add(new Persona("Celeste"));
        personas.add(new Persona("Blanca"));
        personas.add(new Persona("Victor"));
        for(Persona persona:personas){
            System.out.println(persona.getNombre());
        }
        personas.forEach((persona)->System.out.println(persona.getNombre()));
        List<String> nombres = new ArrayList<>();
        List<String> nombres2 = new ArrayList<>();
        nombres = personas.stream().map((persona) -> persona.getNombre()).collect(Collectors.toList());
        nombres2 = personas.stream().map(Persona::getNombre).collect(Collectors.toList());
        nombres.forEach(System.out::println);
        nombres2.forEach(System.out::println);

        List<String> nombresNuevasPersonas = new ArrayList<>();
        nombresNuevasPersonas.add("Pedro");
        nombresNuevasPersonas.add("Javier");
        nombresNuevasPersonas.add("Mili");
        List<Persona> nuevasPersonas;
        nuevasPersonas = nombresNuevasPersonas.stream().map((nombre) -> new Persona(nombre)).collect(Collectors.toList());
        nuevasPersonas.forEach((personaNueva)->System.out.println(personaNueva.getNombre()));

        List<Integer> originales = new ArrayList<>();
        originales.add(2);
        originales.add(3);
        originales.add(9);
        List<Integer> xDos = new ArrayList<>();
        xDos = originales.stream().map((original)->original * 2).collect(Collectors.toList());
        xDos.forEach(System.out::println);

        List<String> numeroString = new ArrayList<>();
        numeroString.add("2");
        numeroString.add("4");
        numeroString.add("11");
        List<Integer> numInteger = numeroString.stream().mapToInt((numero)->Integer.parseInt(numero) * 20).boxed().collect(Collectors.toList());
        numInteger.forEach((num)->System.out.println(num + " " + num.getClass().getSimpleName()));

        Persona menor = Collections.min(nuevasPersonas);
        System.out.println(menor.getNombre());
        Persona mayor = Collections.max(nuevasPersonas);
        System.out.println(mayor.getNombre());

        int sumados = numInteger.stream().mapToInt(Integer::valueOf).sum();

        System.out.println(sumados);

        String nombresJuntos = nuevasPersonas.stream().map((persona) -> persona.getNombre()).collect(Collectors.joining("--"));
        System.out.println(nombresJuntos);
    }
}
class Persona implements Comparable{
    private String nombre;
    Persona(String nombre){
        this.nombre=nombre;
    }
    String getNombre(){
        return this.nombre;
    }
    void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Object sujeto) {
        return this.nombre.compareTo(((Persona) sujeto).getNombre());
    }
}