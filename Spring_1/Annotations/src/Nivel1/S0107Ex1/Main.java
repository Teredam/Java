/* Crea  una jerarquía de objetos. La clase Trabajador con los atributos nombre, apellido, precio/hora.Crear una
jerarquía de objetos. Los objetos de las clases hijas deben sobreescribir alguna funcionalidad de la superclase
empleando @Override. Desde el main() de la clase Principal, realiza las invocaciones necesarias para demostrar el
funcionamiento de la anotación @Override. En los trabajadores presenciales, el método para calcular su sueldo recibirá por
parámetro el número de horas trabajadas al mes y el número de kilómetros recorridos. A la hora de calcular el sueldo se
multiplicará el número de horas trabajadas por el precio hora, más los kilómetros recorridos por el precio por kilómetro. */
package Nivel1.S0107Ex1;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Tere", "Rojas", 10);
        EmpleadoTeletrabajo empleadoTeletrabajo = new EmpleadoTeletrabajo("Teresa", "Rosas", 8);
        EmpleadoLocal empleadoLocal = new EmpleadoLocal("Terry", "Gutierrez", 12);

        empleado.datosEmpleado();
        empleadoTeletrabajo.datosEmpleado();
        empleadoLocal.datosEmpleado();

    }

}
