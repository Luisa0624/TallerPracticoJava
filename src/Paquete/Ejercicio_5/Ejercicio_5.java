package Paquete.Ejercicio_5;

import java.util.*;
import java.util.List;

public class Ejercicio_5 {

    public static List num_pares = new ArrayList();
    public static List num_impares = new ArrayList();


    public static void main(String[] args) {
        Ejercicio_5 numeros = new Ejercicio_5();
        numeros.numParImpar();
        System.out.println("Los números pares son: \n" +num_pares);
        System.out.println("Los números impares son: \n" +num_impares);
    }

    public void numParImpar(){
        int n = 1;
        while (n <= 100){
            if (n % 2 == 0) {
                num_pares.add(n);
            } else {
                num_impares.add(n);
            }
            n++;
        }
    }


}
