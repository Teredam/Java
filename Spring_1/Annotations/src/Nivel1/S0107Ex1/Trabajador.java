/* Crea  una jerarquía de objetos. La clase Trabajador con los atributos nombre, apellido, precio/hora.*/
package Nivel1.S0107Ex1;

public class Trabajador {
    private String nombre;
    private String apellido;
    private int PrecioHora;

    public Trabajador(String nombre, String apellido, int precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        PrecioHora = precioHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPrecioHora() {
        return PrecioHora;
    }

    public void setPrecioHora(int precioHora) {
        PrecioHora = precioHora;
    }
}
