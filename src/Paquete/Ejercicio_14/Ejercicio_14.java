package Paquete.Ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero1;
        System.out.println("Ingresa un número: ");
        numero1= reader.nextInt();

        for (int i =numero1; numero1<= 1000; numero1 = numero1 +2){
            System.out.println(numero1);

        }

    }
}
