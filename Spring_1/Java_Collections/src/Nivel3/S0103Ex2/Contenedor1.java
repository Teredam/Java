package Nivel3.S0103Ex2;

import java.util.Arrays;

public class Contenedor1 {
    private int numero[];
    private static int tamanio;
    private int suma;

    public Contenedor1() {
        this.numero = new int[tamanio];
        tamanio = 0;
    }

    public int[] getNumero() {
        return numero;
    }

    public static int getTamanio() {
        return tamanio;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public static void setTamanio(int tamanio) {
        Contenedor1.tamanio = tamanio;
    }

    public void addNumero(int num){
        if (tamanio >= numero.length){
            numero = Arrays.copyOf(numero, tamanio + 1);
        }
        numero[tamanio] = num;
        tamanio++;
    }

    public boolean verificar(int posicion) {
        boolean coinciden = false;
        int contador = 0;
        while (!coinciden && contador < numero.length) {
            if (contador == posicion) {
                coinciden = true;
            }
            contador++;
        }
        return coinciden;
    }
    public void removerNumero(int posicion){
        if(verificar(posicion)) {
            int numero2[] = new int[tamanio - 1];

            for (int i = 0, j = 0; i < numero.length; i++) {
                if (i != posicion) {
                    numero2[j] = numero[i];
                    j++;
                }
            }
            tamanio--;
            numero = numero2;
        } else {
            System.out.println("Posición no válida.");
        }
    }

    @Override
    public String toString() {
        return "Contenedor {" + Arrays.toString(numero) + '}';
    }
}
