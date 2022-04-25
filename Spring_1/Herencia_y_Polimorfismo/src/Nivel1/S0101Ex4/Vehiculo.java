package Nivel1.S0101Ex4;

public class Vehiculo {
    private final int velocidaMax;
    private static int recorrido;
    private static final int ruedas = 4;

    //Constructor
    public Vehiculo(final int velocidadMax, int recorrido){
        this.velocidaMax = velocidadMax;
        this.recorrido = recorrido;
        System.out.println("Este vehiculo tiene una velocidad máxima de " + velocidaMax + ", tiene un recorrido de " +
                recorrido + " km y tiene " + ruedas + " ruedas.");
    }

    //Método main
    public static void main(String[] args) {

        Vehiculo volvo = new Vehiculo(180,340);
        volvo.iniciar();
        volvo.acelerar();
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
