package Paquete.Ejercicio_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        frase = entrada.nextLine();

        System.out.println("La frase tiene "+frase.length()+" caracteres");

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 0);
        hashMap.put("e", 0);
        hashMap.put("i", 0);
        hashMap.put("o", 0);
        hashMap.put("u", 0);

        for (int x = 0; x < frase.length(); x++) {
            char vocales = frase.charAt(x);
            if (esVocal(vocales)) {
                // La clave es la vocal en sí, pero en minúscula
                String clave = String.valueOf(vocales).toLowerCase();
                // Aumentamos el conteo en esa clave
                hashMap.put(clave, hashMap.get(clave) + 1);
            }
        }
        System.out.printf("Veces que se repiten las vocales: \n");
        //Imprimir resultados
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("Vocal %s.  %d veces\n", entry.getKey(), entry.getValue());
        }
    }

    private static boolean esVocal(char vocales) {
        return "aeiou".contains(String.valueOf(vocales).toLowerCase());
    }
}
