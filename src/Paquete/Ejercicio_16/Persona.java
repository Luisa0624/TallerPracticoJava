package Paquete.Ejercicio_16;
import java.util.function.Predicate;

public class Persona {
    private String nombre = "";
    private int edad =0;
    private String DNI = "";
    private String sexo = "H";
    private double peso = 0;
    private double altura = 0;

    public Persona() {
        generarDNI();
        comprobarSexo();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generarDNI();
        comprobarSexo();
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generarDNI();
        comprobarSexo();
    }

    public int calcularIMC() {
        int imc = 0;
        double pesoIdeal = this.peso/(this.altura*this.altura);
        if(pesoIdeal < 20) { imc = -1;}
        else if(pesoIdeal >=20 && pesoIdeal <= 25) { imc = 0; }
        else if(pesoIdeal > 25) { imc = 1; }
        return imc;
    }

    public void comprobarIMC(int imc) {

        if(imc == -1) {
            System.out.println("Tiene un peso ideal");
        }else if(imc == 0) {
            System.out.println("Esta por debajo de su peso ideal");
        }else if(imc == 1) { System.out.println("Tiene sobrepeso");
        }
    }

    public boolean MayorDeEdad() {
        boolean mayor_edad = true;
        if(this.edad >= 18) {
            mayor_edad = true;
        }else {
            mayor_edad = false;
        }
        return mayor_edad;
    }

    public void comprobarSiEsMayor (boolean mayor) {
        if(mayor == true) {
            System.out.println("Es mayor de edad");
        } else {System.out.println("Es menor de edad");
        }
    }

    public String comprobarSexo() {
        if(this.sexo.equalsIgnoreCase("")) {
            this.sexo="H";
        }
        else if(this.sexo.equalsIgnoreCase("H")) {
            this.sexo="H";
        }
        else {
            this.sexo = "M";
        }
        return this.sexo;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private void generarDNI() {

        final int divisor = 23;
        int num_DNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = num_DNI - (num_DNI / divisor * divisor);
        char letra_DNI = generaLetraDNI(res);
        DNI = Integer.toString(num_DNI) + letra_DNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}