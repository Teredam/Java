package Nivel1.S0107Ex2;

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

    @Deprecated
    @Override
    @SuppressWarnings("Deprecation")
    public void aumentoPrecioHora(int nuevoPrecioHora){
        super.aumentoPrecioHora(nuevoPrecioHora);
    }

}
