/* Para realizar este ejercicio necesitas una interfaz llamada Telefono y tres clases: Smartphone, Generica y la
Principal. La interfaz Teléfono debe tener un método llamado llamar(). La clase Smartphone debe implementar Telefono, y
además del método llamar(), también debe tener el método hacerFotos(). La clase Generica debe tener dos métodos
genéricos, el primero debe recibir un tipo de argumento limitado por la interfaz Telefono y el segundo debe recibir un
argumento limitado por la clase Smartphone. Desde estos dos métodos llama a los métodos pertinentes de Telefono y
Smartphone. En el main() de la clase Principal, pasa un objeto de la clase Smartphone a los dos métodos genéricos de la
clase Generica. */
package Nivel3.S0106Ex1;

public class Main {
    public static void main(String[] args) {
        Smartphone aplicando = new Smartphone();

        aplicando.llamar();
        aplicando.hacerFotos();

    }
}
