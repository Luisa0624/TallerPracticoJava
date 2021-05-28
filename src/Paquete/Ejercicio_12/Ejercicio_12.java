package Paquete.Ejercicio_12;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la primera palabra: ");
        String palabra_1 =entrada.next();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra_2 =entrada.next();

        char[] arPalabra_1 = palabra_1.toCharArray();
        char[] arPalabra_2 = palabra_2.toCharArray();
        if(palabra_1.equals(palabra_2)){
            System.out.println("las  palabras son iguales");
        }else {
            for(int i = 0; i <= arPalabra_1.length; ++i){
                if(arPalabra_1[i] != arPalabra_2[i]){
                    System.out.println("las letras diferentes son: "+arPalabra_1[i]+ " "+ arPalabra_2[i]);
                }
            }

        }
    }
}