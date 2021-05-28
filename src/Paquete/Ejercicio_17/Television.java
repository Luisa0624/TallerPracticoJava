package Paquete.Ejercicio_17;

public class Television extends Electrodomestico {
    private int resolucion = 20;
    private boolean TDT = false;

    public Television() {
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean TDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public double precioFinal() {
        double precioTV = super.precioFinal();
        if (resolucion>40){
            precioTV+=precioBase*0.3;
        }
        if (TDT){
            precioTV+=50;
        }

        return precioTV;
    }
}
