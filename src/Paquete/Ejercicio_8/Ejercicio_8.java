package Paquete.Ejercicio_8;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia;
        System.out.println("Ingrese un dia de la semana: ");
        dia = entrada.next();


        switch(dia.toLowerCase()){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("No es un dia de la semana");
        }
    }
}
