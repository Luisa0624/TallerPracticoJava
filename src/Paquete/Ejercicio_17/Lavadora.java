package Paquete.Ejercicio_17;

public class Lavadora extends Electrodomestico{
    private double carga =5;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioNevera = super.precioFinal();
        if(this.carga >= 30) {
            precioNevera += 50;
        }
        return precioNevera;
    }
}
