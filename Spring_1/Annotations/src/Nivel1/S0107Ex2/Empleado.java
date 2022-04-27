
package Nivel1.S0107Ex2;

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

    @Deprecated
    public void aumentoPrecioHora(int nuevoPrecioHora){
        this.PrecioHora = nuevoPrecioHora;
    }
}
