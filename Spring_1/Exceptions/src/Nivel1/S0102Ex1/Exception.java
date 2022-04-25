package Nivel1.S0102Ex1;

public class Exception {
    public static void main(String[] args) {
        try{
            System.out.println("Conjunto de declaraciones que pueden generar una excepción");
            throw new java.lang.Exception("Exception on try");
        } catch (java.lang.Exception e) { //(Exception (tipo de Excepción) e (Objeto))
            //e.printStackTrace();
            System.out.println("Código para manejar la excepción: " + e);
        }
        finally {
            System.out.println("Proceso terminado");
        }
    }
}
