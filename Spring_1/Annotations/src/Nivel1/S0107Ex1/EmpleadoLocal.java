package Nivel1.S0107Ex1;

public class EmpleadoLocal extends Empleado {
    private int kilometros;
    private int precioKilometro;
    private int sueldo, plus, total;
    private int horasMes;

    public EmpleadoLocal(String nombre, String apellido, int precioHora) {
        super(nombre, apellido, precioHora);
        this.kilometros = kilometros;
        this.precioKilometro = precioKilometro;
        this.horasMes = horasMes;
        this.sueldo = sueldo;
        this.plus = plus;
        this.total = total;

        sueldo = horasMes * precioHora;
    }

    public void salarioCompleto(){
        total = sueldo + (kilometros * precioKilometro);
    }
    @Override
    public void datosEmpleado() {
        System.out.println("Clase hija 2");;
    }
}
