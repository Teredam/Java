package Nivel1.S0103Ex3;

import java.util.Collection;

public class Generadora {
    private static String[] nombresPersonajes = {"Alicia", "El Sombrero", "Reina de Corazones", "La Sota de Corazones"
            , "El Conejo Blanco"};
    public static final int tamanio = nombresPersonajes.length;
    public static int contador = 0;

    public static Collection<String> rellenar(Collection c, int numero){
        for (int i = 0; i < tamanio; i++){
            c.add(siguientePersonaje());
        }
        return c;
    }
    public static String siguientePersonaje(){
        String info = "";
        if(contador < tamanio){
            info = nombresPersonajes[contador];
            contador++;
        }else if (contador == tamanio){
            contador = 0;
            info = nombresPersonajes[contador];
            contador++;
        }
        return info;
    }
}
