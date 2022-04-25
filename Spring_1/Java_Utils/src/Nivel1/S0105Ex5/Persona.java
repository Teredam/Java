package Nivel1.S0105Ex5;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int id;
    private int edad;

    public Persona() {

    }

    public Persona(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
