package Paquete.Ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine();
        String fraseSinEspacios = frase.replace(" ", "");
        System.out.println(fraseSinEspacios);
    }
}
