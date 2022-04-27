/* Añade a las clases hijas algunos métodos obsoletos (deprecated), y utiliza la anotación correspondiente. Invoca desde
una clase externa los métodos obsoletos, suprimiendo mediante la correspondiente anotación los “warnings” para ser
obsoletos. */
package Nivel1.S0107Ex2;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Tere", "Rojas", 10);
        EmpleadoTeletrabajo empleadoTeletrabajo = new EmpleadoTeletrabajo("Teresa", "Rosas", 8);
        EmpleadoLocal empleadoLocal = new EmpleadoLocal("Terry", "Gutierrez", 12);

        empleadoTeletrabajo.aumentoPrecioHora(12);

    }

}
