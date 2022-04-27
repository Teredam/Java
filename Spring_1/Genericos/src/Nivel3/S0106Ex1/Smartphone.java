/* La clase Smartphone debe implementar Telefono, y además del método llamar(), también debe tener el método
hacerFotos().*/
package Nivel3.S0106Ex1;

public class Smartphone implements Telefono{
    public void hacerFotos(){
        System.out.println("Whisky - press");
    }

    @Override
    public void llamar() {
        System.out.println("Beep...Beep...Beep...");
    }
}
