package Nivel2.S0101Ex3;

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle   = new Bicycle();
        Tricycle tricycle = new Tricycle();

        Cycle[] type = new Cycle[]{unicycle, bicycle, tricycle};

        unicycle.wheels();
        bicycle.wheels();
        tricycle.wheels();
        System.out.println("====================");

        unicycle.ride(" en un unicycle.");
        bicycle.ride(" en un bicycle.");
        tricycle.ride(" en un tricycle.");


        for (int i = 0; i < type.length; i++){
            if (type[i] instanceof Unicycle){
                type[i].balance();
            }else if (type[i] instanceof Bicycle){
                type[i].balance();
            }
        }


    }

}
