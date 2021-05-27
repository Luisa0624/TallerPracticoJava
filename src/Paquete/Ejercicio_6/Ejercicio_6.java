package Paquete.Ejercicio_6;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_6 {
    public static List num_pares = new ArrayList();
    public static List num_impares = new ArrayList();


    public static void main(String[] args) {
        Ejercicio_6 numeros = new Ejercicio_6();
        numeros.numParImpar();
        System.out.println("Los números pares son: \n" +num_pares);
        System.out.println("Los números impares son: \n" +num_impares);
    }

    public void numParImpar(){

        for (int n = 1; n <= 100; n++){
            if (n % 2 == 0) {
                num_pares.add(n);
            } else {
                num_impares.add(n);
            }
        }
    }
}
