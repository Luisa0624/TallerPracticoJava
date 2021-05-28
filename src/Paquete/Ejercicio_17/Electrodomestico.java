package Paquete.Ejercicio_17;

import java.util.ArrayList;
import java.util.List;

public class Electrodomestico {
    protected double precioBase = 100;
    protected String color = "Blanco";
    protected char consumoEnergetico = 'F';
    protected double peso = 5;


    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico() {
        if(this.consumoEnergetico >= 65 && this.consumoEnergetico <= 70) {
            System.out.println("Es correcto");
        }
        else {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor() {
        List<String> listaColor = new ArrayList<>();
        listaColor.add("Blanco");
        listaColor.add("Negro");
        listaColor.add("Azul");
        listaColor.add("Rojo");
        listaColor.add("Gris");

        if(listaColor.equals(this.color)){
            System.out.println("Es correcto");
        }
        else {
            this.color = "Blanco";
        }
    }

    public double precioFinal() {
        double aumento=0;
        aumento = getAumentoConsumoEnergetico(aumento);
        if(this.peso>=0 && this.peso<19){
            aumento+=10;
        }else if(this.peso>=20 && this.peso<49){
            aumento+=50;
        }else if(this.peso>=50 && this.peso<=79){
            aumento+=80;
        }else if(this.peso>=80){
            aumento+=100;
        }

        return this.precioBase+aumento;
    }

    private double getAumentoConsumoEnergetico(double aumento) {
        switch(consumoEnergetico){
            case 'A':
                aumento +=100;
                break;
            case 'B':
                aumento +=80;
                break;
            case 'C':
                aumento +=60;
                break;
            case 'D':
                aumento +=50;
                break;
            case 'E':
                aumento +=30;
                break;
            case 'F':
                aumento +=10;
                break;
        }
        return aumento;
    }
}
