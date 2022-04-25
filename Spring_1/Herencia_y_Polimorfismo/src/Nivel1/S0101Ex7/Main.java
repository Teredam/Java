package Nivel1.S0101Ex7;

public class Main {
    public static void main(String[] args) {
        Frog frog           = new Frog();
        Amphibian amphibian = (Amphibian) frog;

        amphibian.mover();
        amphibian.respirar();
        amphibian.comer();
        System.out.println("===================");

        //Amphibian.saltar(); Error
        System.out.println("No puede ser llamado el método saltar porque no es hereditario");
        System.out.println("===================");

        Frog frog1         = (Frog) amphibian;

        frog1.mover();
        frog1.respirar();
        frog1.comer();

        System.out.println("===================");

        frog1.saltar();


    }
}
