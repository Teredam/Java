package Nivel1.S0107Ex1;

public class EmpleadoTeletrabajo extends Empleado {
    private int porcentajeRendimiento;

    public EmpleadoTeletrabajo(String nombre, String apellido, int precioHora) {
        super(nombre, apellido, precioHora);
        this.porcentajeRendimiento = porcentajeRendimiento;
    }

    @Override
    public void datosEmpleado() {
        System.out.println("Clase Hija");
    }

}
