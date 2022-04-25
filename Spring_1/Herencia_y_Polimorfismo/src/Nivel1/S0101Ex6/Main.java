package Nivel1.S0101Ex6;

public class Main {
    public static void main(String[] args) {
        Frog frog           = new Frog();
        Amphibian amphibian = (Amphibian) frog;

        amphibian.mover();
        amphibian.respirar();
        amphibian.comer();

        System.out.println("===================");


        Frog frog1         = (Frog) amphibian;

        frog1.mover();
        frog1.respirar();
        frog1.comer();

    }
}
