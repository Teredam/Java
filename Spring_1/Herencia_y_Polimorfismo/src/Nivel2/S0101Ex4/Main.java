package Nivel2.S0101Ex4;

public class Main {
    public static void main(String[] args) {
        Raton raton     = new Raton();
        Hamster hamster = new Hamster();
        Jerbu jerbu     = new Jerbu();

        Roedor[] especie = new Roedor[]{raton, hamster, jerbu};

        for (int i = 0; i < especie.length; i++){
            if (especie[i] instanceof Raton){
                raton.olor(" ");
                raton.mordisquear(" ");
                raton.correr(" ");
            }else if (especie[i] instanceof Hamster){
                hamster.olor(" ");
                hamster.mordisquear(" ");
                hamster.correr(" ");
            }else if (especie[i] instanceof Jerbu){
                jerbu.olor(" ");
                jerbu.mordisquear(" ");
                jerbu.correr("");
            }
        }
    }
}
