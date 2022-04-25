package Nivel1.S0102Ex2;

public class Main {
    public static void main(String[] args) {
        ObjetoNull obj = null;

        try {
            obj.toString();
        }catch (Exception e){
            System.out.println("Excepción: " + e.getMessage());
            System.out.println("Excepción de tipo: " + e.getClass());
        }

    }

}
