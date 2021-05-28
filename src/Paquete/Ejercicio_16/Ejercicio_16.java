package Paquete.Ejercicio_16;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        Scanner entrada_1 = new Scanner(System.in);
        Scanner entrada_2 = new Scanner(System.in);
        System.out.println("Ingresar datos persona 1");
        System.out.println("Escribe el nombre: ");
        String nombre_1 = entrada_1.nextLine();
        System.out.println("Escribe la edad: ");
        int edad_1 = entrada_1.nextInt();
        System.out.println("Ingrese el genero (H hombre, M mujer)");
        String sexo_1 = entrada_1.next();
        System.out.println("Ingrese el peso en Kg: ");
        double peso_1 = entrada_1.nextDouble();
        System.out.println("Ingrese la altura en metros: ");
        double altura_1 = entrada_1.nextDouble();

        System.out.println("Ingresar datos persona 2");
        System.out.println("Escribe el nombre: ");
        String nombre_2 = entrada_2.nextLine();
        System.out.println("Escribe la edad: ");
        int edad_2 = entrada_2.nextInt();
        System.out.println("Ingrese el genero (H hombre, M mujer)");
        String sexo_2 = entrada_2.next();

        Persona persona1 = new Persona(nombre_1,edad_1,sexo_1.toLowerCase(),peso_1,altura_1);
        Persona persona2 = new Persona(nombre_2,edad_2,sexo_2.toLowerCase());
        Persona persona3 = new Persona();

        persona3.setNombre("Luisa Maria ");
        persona3.setEdad(28);
        persona3.setSexo("M");
        persona3.setPeso(75);
        persona3.setAltura(157);

        System.out.println("La persona uno: ");
        persona1.comprobarIMC(persona1.calcularIMC());
        persona1.comprobarSiEsMayor(persona1.MayorDeEdad());
        System.out.println(persona1.toString() + "\n");

        System.out.println("La persona dos: ");
        persona2.comprobarIMC(persona2.calcularIMC());
        persona2.comprobarSiEsMayor(persona2.MayorDeEdad());
        System.out.println(persona2.toString() + "\n");

        System.out.println("La persona tres: ");
        persona3.comprobarIMC(persona3.calcularIMC());
        persona3.comprobarSiEsMayor(persona3.MayorDeEdad());
        System.out.println(persona3.toString());

    }
}