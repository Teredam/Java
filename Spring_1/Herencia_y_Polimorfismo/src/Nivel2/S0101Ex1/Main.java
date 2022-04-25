package Nivel2.S0101Ex1;

import static Nivel2.S0101Ex1.Cycle.ride;

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle   = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Unicycle.ride(" en un unicycle.");
        Bicycle.ride(" en un bicycle.");
        Tricycle.ride(" en un tricycle.");

    }

}
