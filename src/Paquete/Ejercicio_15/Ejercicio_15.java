package Paquete.Ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {

        System.out.println("GESTION DE CINEMATOGRAFICA");

        Scanner entrada = new Scanner(System.in);
        int opcion=1;

        Ejercicio_15 respuesta = new Ejercicio_15();
        respuesta.opciones();

        while(opcion!=8) {
            System.out.println("Ingrese una opcion: ");
            opcion=entrada.nextInt();

            switch (opcion) {
                case 1 : respuesta.opciones(); break;
                case 2 : respuesta.opciones(); break;
                case 3 : respuesta.opciones(); break;
                case 4 : respuesta.opciones(); break;
                case 5 : respuesta.opciones(); break;
                case 6 : respuesta.opciones(); break;
                case 7 : respuesta.opciones(); break;
                case 8 : break;
                default: System.out.println("OPCION INCORRECTO");
            }
        }

    }
    private static void opciones(){

        System.out.println("1-NUEVO ACTOR");
        System.out.println("2-BUSCAR ACTOR");
        System.out.println("3-ELIMINAR ACTOR");
        System.out.println("4-MODIFICAR ACTOR");
        System.out.println("5-VER TODOS LOS ACTORES");
        System.out.println("6-VER PELICULAS DE LOS ACTORES");
        System.out.println("7-VER CATEGORIA DE LAS PELICAS DE LOS ACTORES");
        System.out.println("8-SALIR");
    }
}
