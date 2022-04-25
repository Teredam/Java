package Nivel1.S0105Ex5;

public class Alumno extends Persona{
    private Fecha fechaMatricula;

    public Alumno() {
    }

    public Alumno(String nombre, int id, int edad, Fecha fechaMatricula) {
        super(nombre, id, edad);
        this.fechaMatricula = new Fecha();
        setFechaMatricula(fechaMatricula);
    }

    public Fecha getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Fecha fechaMatricula) {
        this.fechaMatricula.setDia(fechaMatricula.getDia());
        this.fechaMatricula.setMes(fechaMatricula.getMes());
        this.fechaMatricula.setAnio(fechaMatricula.getAnio());
    }
}
