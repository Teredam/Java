package Nivel1.S0102Ex3;

public class ExceptionArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        try {
            array[-2] = 12;
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Error de índice del array");
        }

    }
}
