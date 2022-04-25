package Nivel1.S0101Ex3;

public class Vehiculo {
    static{
        System.out.println("==========");
        System.out.println("BIENVENIDO");
        System.out.println("==========");
    }
    //Constructor
    public Vehiculo() {

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
