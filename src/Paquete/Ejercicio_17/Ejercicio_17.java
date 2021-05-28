package Paquete.Ejercicio_17;

public class Ejercicio_17 {
    public static void main(String[] args) {
        Electrodomestico listaElectrodomesticos[] =new Electrodomestico[10];
        listaElectrodomesticos[0]=new Electrodomestico(150, "Gris", 'B', 35);
        listaElectrodomesticos[1]=new Lavadora(530, 75);
        listaElectrodomesticos[2]=new Television(450, "Rojo", 'E', 20, 31, true);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(120, "Blanco", 'A', 20);
        listaElectrodomesticos[5]=new Lavadora(485, "Blanco", 'C', 88, 50);
        listaElectrodomesticos[6]=new Television(200, 40);
        listaElectrodomesticos[7]=new Lavadora(680, "Blanca", 'D', 84, 15);
        listaElectrodomesticos[8]=new Television(450, "Rojo", 'A', 40, 40, true);
        listaElectrodomesticos[9]=new Electrodomestico(50, 20);

        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){

            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
        System.out.println("La suma del precio de los electrodomesticos es de: €"+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de: €"+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de: €"+sumaTelevisiones);

    }
}
