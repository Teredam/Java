package Nivel1.S0101Ex8;

public class Main {
    public static void main(String[] args) {
        Frog frog           = new Frog();
        Amphibian amphibian = (Amphibian) frog;

        amphibian.mover();
        amphibian.respirar();
        amphibian.comer();
        System.out.println("===================");

        Amphibian amphibian1 = new Amphibian();
        amphibian1.mover();
        amphibian1.respirar();
        amphibian1.comer();
        System.out.println("===================");

        //Amphibian.saltar(); ERROR
        System.out.println("No puede ser llamado el método saltar porque no es hereditario");
        System.out.println("===================");

        Frog frog1         = (Frog) amphibian;

        frog1.mover();
        frog1.respirar();
        frog1.comer();

        frog1.saltar();
        System.out.println("===================");

        Frog frog2 = new Frog();

        frog2.mover();
        frog2.respirar();
        frog2.comer();
        frog2.saltar();
    }
}
