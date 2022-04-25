package Nivel2.S0101Ex2;

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle   = new Bicycle();
        Tricycle tricycle = new Tricycle();

        unicycle.wheels();
        bicycle.wheels();
        tricycle.wheels();
        System.out.println("====================");

        unicycle.ride(" en un unicycle.");
        bicycle.ride(" en un bicycle.");
        tricycle.ride(" en un tricycle.");



    }

}
