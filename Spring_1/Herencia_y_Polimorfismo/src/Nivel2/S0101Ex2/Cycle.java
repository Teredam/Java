package Nivel2.S0101Ex2;

public class Cycle {
    private int numbWheel;

    public Cycle(int numbWheel) {
        this.numbWheel = numbWheel;
    }

    public int wheels() {
        return numbWheel;
    }

    public void ride(String c){
        System.out.println("Estamos de paseo" + c);
        System.out.println("Number of wheel:" + wheels());
    }

}
