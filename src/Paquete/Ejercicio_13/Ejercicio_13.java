package Paquete.Ejercicio_13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Date date = new Date();

        DateFormat horamilitar = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Hora formato 24 horas: "+horamilitar.format(date));

        DateFormat Horanormal = new SimpleDateFormat("hh:mm:ss");
        System.out.println("Hora formato 12 horas: "+Horanormal.format(date));

        DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd");
        System.out.println("Fecha Actual: "+dateFormat.format(date));
    }
}
