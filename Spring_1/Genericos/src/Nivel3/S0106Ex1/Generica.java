/* La clase Generica debe tener dos métodos genéricos, el primero debe recibir un tipo de argumento limitado por la
interfaz Telefono y el segundo debe recibir un argumento limitado por la clase Smartphone. Desde estos dos métodos llama
a los métodos pertinentes de Telefono y Smartphone.*/
package Nivel3.S0106Ex1;

public class Generica {
    public static <String extends Telefono> void llamando(){
        llamando();
    }
    public static <String extends Smartphone> void oprimir(){
        oprimir();
    }
}
