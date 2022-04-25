package Nivel3.S0103Ex1;

import java.util.Arrays;

public class Contenedor {
    private String cadena [];
    private static int tamanio;

    public Contenedor() {
        this.cadena = new String[tamanio];
    }

    public static int getTamanio() {
        return tamanio;
    }

    public String[] getCadena() {
        return cadena;
    }

    public void setCadena(String[] cadena) {
        this.cadena = cadena;
    }

    public static void setTamanio(int tamanio) {
        Contenedor.tamanio = tamanio;
    }

    public void addCadena(String palabra){
        if (tamanio >= cadena.length){
            cadena = Arrays.copyOf(cadena, tamanio + 1);
        }
        cadena[tamanio] = palabra;
        tamanio++;
    }

    public boolean verificar(int posicion){
        boolean coinciden = false;
        int contador = 0;
        while (!coinciden && contador < cadena.length){
            if (contador == posicion){
                coinciden = true;
            }
            contador++;
        }
        return coinciden;
    }



    @Override
    public String toString() {
        return "Contenedor {" + Arrays.toString(cadena) + '}';
    }
}
