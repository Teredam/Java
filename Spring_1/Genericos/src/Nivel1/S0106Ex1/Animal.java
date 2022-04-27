package Nivel1.S0106Ex1;

public class Animal {
    private String tipo;
    private String clasificacion;

    public Animal(String tipo, String clasificacion) {
        this.tipo = tipo;
        this.clasificacion = clasificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo='" + tipo + '\'' + ", clasificacion='" + clasificacion + '\'' + '}';
    }
}
