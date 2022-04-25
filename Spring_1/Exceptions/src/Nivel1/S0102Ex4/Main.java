package Nivel1.S0102Ex4;

public class Main {
    public static void main(String[] args) {
        try {
            MisExcepciones e = new MisExcepciones("Este es mi propio error");
            throw e;
        } catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Exception");
        }
    }
}
