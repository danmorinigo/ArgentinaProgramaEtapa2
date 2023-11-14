public class Main {
    public static void main(String[] args) {
        int a = 9;
        if(a==5){
            System.out.println("Cinco");
        }else if(a == 6){
            System.out.println("Seis");
        }else if(a == 8){
            System.out.println("Ocho");
        }else{
            System.out.println("Ninguna");
        }
        Hijo1 clase = new Hijo1();
        clase.imprimirHolaMundo();
        clase.imprimirHolaMundo();
        Hijo2 clase2 = new Hijo2();
        clase2.cambioLoQueDicePadre("Hola amigos");
        clase2.imprimirHolaMundo();
        Hijo3 clase3 = new Hijo3();
        clase3.imprimirHolaMundo();
        clase3.cambioLoQueDicePadre("Hola amigos!!!!");
        clase2.imprimirHolaMundo();
        Empleado empleado = new Empleado();
        empleado.getValor();
        Dia jueves = Dia.JUEVES;
        Dia cadena = Dia.String;
        System.out.println(jueves);
        System.out.println(jueves.getClass());
        System.out.println(cadena);
        System.out.println(cadena.getClass());
        Empleado2 empleado2 = new Empleado2();
        empleado2.getValor();
        empleado2.dobleValor();
    }
}
abstract class Padre {
    static private String loQueImprime = "Hola Mundo";
    void imprimirHolaMundo(){
        System.out.println(loQueImprime);
    }
    void cambioLoQueDicePadre(String frase){
        loQueImprime = frase;
    }
}
class Hijo1 extends Padre{
    private String loQueImprime = "Bay Mundo";
    void imprimirHolaMundo(){
        System.out.println(loQueImprime);
    }
}
class Hijo2 extends Padre{
}
class Hijo3 extends Padre{
}
interface Contrato{
    float valor = 2.56F;
    void getValor();
}
interface Contrato2 extends Contrato{
    void dobleValor();
}

class Empleado implements Contrato{

    @Override
    public void getValor() {
        System.out.println(valor);
    }
    public void setValor() {
        //valor=5;
    }
}
enum Dia{
    String, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
class Empleado2 implements Contrato2{

    @Override
    public void getValor() {
        System.out.println(valor);
    }

    @Override
    public void dobleValor() {
        System.out.println(valor * 2);
    }
}