package Nivel1.S0101Ex2;

public class Vehiculo {

    //Constructor
    public Vehiculo(){

    }

    //Método main
    public static void main(String[] args) {
        new Vehiculo().iniciar();
        new Vehiculo().acelerar();
        System.out.println(Vehiculo.parar());

    }

    //Otros Métodos
    public void iniciar(){

        System.out.println("Iniciando");
    }

    public void acelerar(){

        System.out.println("acelerando");
    }

    public static String parar(){
        String parar = "stop";
        return parar;
    }
}
