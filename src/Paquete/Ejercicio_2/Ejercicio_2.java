package Paquete.Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero1,numero2;
        System.out.println("Ingresa el primer número: ");
        numero1= reader.nextInt();
        System.out.println("Ingresa el segundo número: " );
        numero2= reader.nextInt();

        if (numero1 > numero2) {
            System.out.println("El número 1 es mayor");
        } else if (numero1 < numero2) {
            System.out.println("El número 2 es mayor");
        } else if (numero1 == numero2) {
            System.out.println("Los números son iguales");
        }
    }
}
