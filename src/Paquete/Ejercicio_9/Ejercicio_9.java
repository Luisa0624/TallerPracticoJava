package Paquete.Ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String frase_reemplazo = frase.replace("a", "e");
        System.out.println(frase_reemplazo);

        Scanner entrada = new Scanner(System.in);
        String frase_nueva;
        System.out.println("Ingrese una frase: ");
        frase_nueva = entrada.nextLine();

        String frase_final;
        frase_final=frase_reemplazo.concat(" "+frase_nueva);
        System.out.println(frase_final);
    }
}
