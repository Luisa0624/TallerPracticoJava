package Paquete.Ejercicio_18;

public class Ejercicio_18 {
    public static void main(String[] args) {


        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];


        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Elite", 3, "Suspenso", "Carlos Montero");
        listaSeries[2]=new Serie("The Crown", 4, "Dram Historico", "Peter Morgan");
        listaSeries[3]=new Serie("Dark", 3 ,"Ciencia Ficcion", "Baran bo Odar");
        listaSeries[4]=new Serie("Gambito de dama", 1, "Drama", "Scott Frank");

        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Just Dance", 100, "Musical", "Ubisoft");
        listaVideojuegos[2]=new Videojuego("The Last of Us", 130, "Accion", "Naughty Dog");
        listaVideojuegos[3]=new Videojuego("Call of Duty", 180, "Accion", "Infinity Ward");
        listaVideojuegos[4]=new Videojuego("grand theft auto: San Andreas ", 80, "Accion-Aventura", "Rockstar North ");

        //entregamos algunos videojuegos y series
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();


        int entregados=0;

        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();

            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay "+entregados+" articulos entregados");

        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];


        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.mayor){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.mayor){
                videojuegoMayor=listaVideojuegos[i];
            }

        }
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
    }
}
