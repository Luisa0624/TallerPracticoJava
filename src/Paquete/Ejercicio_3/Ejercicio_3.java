package Paquete.Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    private static final double PI =3.1416 ;

    public static void main(String[] args) {
        String radio;
        Double area;
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce el radio de un Círculo: ");
            radio = num.next();
            double doble = Double.parseDouble(radio);
            area = Math.pow(doble,2)*PI;
            System.out.println("El área del Círculo es: " + area);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    }

