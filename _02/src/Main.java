// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Suma lambdaSuma = (a,b) -> a + b;
        int valorA = 5, valorB = 10, resultado;
        String valorC = "16";
        resultado = lambdaSuma.sumar(Integer.parseInt(valorC),valorB);
        System.out.println("El resultado es " + resultado);
        Operacion queHace = (x,z)->x-z;
        int resultado2 = calculamos(7,8,queHace);
        System.out.println(resultado2);
    }
    static int calculamos(int n1, int n2, Operacion operacion){
        return operacion.aplicar(n1, n2);
    }
}

@FunctionalInterface
interface Suma{
    float calculo = 5.5F;
    int sumar(int numero1, int numero2);

}
@FunctionalInterface
interface Operacion{
    int aplicar(int a, int b);
}
