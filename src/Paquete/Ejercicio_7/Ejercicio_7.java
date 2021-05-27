package Paquete.Ejercicio_7;
import java.util.*;

public class Ejercicio_7 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Ingrese un numero: ");
            numero = entrada.nextInt();
        } while (numero<=0);
        System.out.println("El numero es mayor o igual a 0");
        System.out.println("el numero es: " +numero);
    }
}
