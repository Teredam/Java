package Main.Java.Nivel1.S0104Ex3;

public class ArrayException {
    private int arrayException[] = new int[8];

    public int posicionNumero(int posicion, int numero){
        arrayException[posicion] = numero;
        return arrayException[posicion];
    }
}
