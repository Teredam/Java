package Nivel1.S0101Ex8;

public class Frog extends Amphibian {
    public void saltar(){
        System.out.println("Saltando");
    }

    @Override
    public void mover(){
        System.out.println("El sapo moviendose");
    }

    @Override
    public void respirar(){
        System.out.println("El sapo Respirando");
    }

    @Override
    public void comer(){
        System.out.println("El sapo comiendo");
    }
}
