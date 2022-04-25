/*Rellena un HashMap con parejas clave-valor. Ordene las parejas según el código hash e imprima el resultad
        (Idea: utilizar un TreeMap). Extraiga las parejas ordenadas e introdúzcalas en un mapa LinkedHashMap
        (Idea: utilizar su constructor). Demuestre que se mantiene el orden de inserción. Extraiga sólo las claves
        ordenadas e introdúzcalas primero en un HashSet y después en un LinkedHashSet. ¿Se mantiene el orden? */
package Nivel1.S0103Ex7;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Enumeracion> enumeracionHasMap = new HashMap<>();
        enumeracionHasMap.put('4', new Enumeracion(4, "cuatro"));
        enumeracionHasMap.put('0', new Enumeracion(0, "cero"));
        enumeracionHasMap.put('1', new Enumeracion(1, "uno"));
        enumeracionHasMap.put('3', new Enumeracion(3, "tres"));
        enumeracionHasMap.put('2', new Enumeracion(2, "dos"));

        System.out.println("HashMap: ");
        //foreach
        for (Map.Entry<Character, Enumeracion> recorrido: enumeracionHasMap.entrySet()){ //Guardamos los datos en recoorido c/entrySet
            Character clave = recorrido.getKey();//capturamos la clave
            Enumeracion valor = recorrido.getValue();//capturamos el valor
            System.out.println(clave + " --> " + valor ); // Mostramos c/toString
        }
        System.out.println(".............................................................");
        System.out.println("LinkedHashMap: ");
        LinkedHashMap<Character, Enumeracion> enumeracionLinkedHashMap1 = new LinkedHashMap<>(enumeracionHasMap);
        for (Character clave1 : enumeracionLinkedHashMap1.keySet()){
            System.out.println(clave1 + " --> " + enumeracionLinkedHashMap1.get(clave1));
        }
        System.out.println(".............................................................");

        /*Otra forma
        System.out.println("TreeMap: ");
        TreeMap<Character, Enumeracion> enumeracionTreeMap = new TreeMap<>(enumeracionHasMap);
        for (Character key : enumeracionTreeMap.keySet()){
            System.out.println(key + " --> " + enumeracionHasMap.get(key));
        }
        System.out.println(".............................................................");
        System.out.println("LinkedHashMap: ");
        LinkedHashMap<Character, Enumeracion> enumeracionLinkedHashMap = new LinkedHashMap<>(enumeracionTreeMap);
        for (Character key : enumeracionLinkedHashMap.keySet()){
            System.out.println(key + " --> " + enumeracionLinkedHashMap.get(key));
        }
        System.out.println(".............................................................");*/


        LinkedList<Character> listaLK = new LinkedList<>(enumeracionHasMap.keySet());
        System.out.println(listaLK);
        System.out.println(".............................................................");


        /*Con iterador
        Iterator<Character> iterator = enumeracionHasMap.keySet().iterator();//iteraccion y capturamos todas las claves c/keySet

        while (iterator.hasNext()){
            Character key = iterator.next();
            System.out.println("Clave: " + key + ", Valor: (" + enumeracionHasMap.get(key) + ")");
        }*/













    }
}
