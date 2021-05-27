package Paquete.Ejercicio_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio_4 {

    private static final double IVA =0.21;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        DecimalFormat formatea = new DecimalFormat("###,###.##");

        double precioTotal, precioIVA;
        double precio;

        System.out.println("Ingresa el precio del producto: ");
        precio= reader.nextInt();

        precioIVA=(precio*IVA);
        precioTotal=(precio*IVA)+precio;
        System.out.println("El precio del iva es: " + formatea.format(precioIVA));
        System.out.println("El precio final del producto con el 21% es: " +formatea.format(precioTotal));
    }
}
