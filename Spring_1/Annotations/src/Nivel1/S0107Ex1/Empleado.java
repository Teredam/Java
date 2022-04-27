/* Crea  una jerarquía de objetos. La clase Trabajador con los atributos nombre, apellido, precio/hora.*/
package Nivel1.S0107Ex1;

public class Empleado {
    private String nombre;
    private String apellido;
    private int PrecioHora;

    public Empleado(String nombre, String apellido, int precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        PrecioHora = precioHora;
    }

    public void datosEmpleado(){
        System.out.println("Clase padre");
    }
}
