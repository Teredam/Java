/* Rellena un mapa LinkedHashMap con claves de tipo String y objetos del tipo que prefiera. Extraiga las parejas,
ordénelas según las claves (en orden alfabético) y vuelva a insertarlas en el mapa. Idea: Utiliza un ArrayList para
realizar la ordenación con la clase Comparator. */
package Nivel1.S0103Ex8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Vehiculo> vehiculoLinkedHashMap = new LinkedHashMap<>();
        vehiculoLinkedHashMap.put("01F", new Vehiculo("Ford", 100));
        vehiculoLinkedHashMap.put("03M", new Vehiculo("Mercedes", 300));
        vehiculoLinkedHashMap.put("02H", new Vehiculo("Honda", 200));
        vehiculoLinkedHashMap.put("08O", new Vehiculo("Opel", 800));

        System.out.println("LinkedHashMap: " + vehiculoLinkedHashMap);
        System.out.println(".............................................................");

        Set<Map.Entry<String, Vehiculo>> set = vehiculoLinkedHashMap.entrySet();
        List<Map.Entry<String, Vehiculo>> entryList = new ArrayList<Map.Entry<String, Vehiculo>>(set);
        System.out.println("ArrayList: " + entryList);
        System.out.println(".............................................................");

        Collections.sort(entryList, new Comparator<Map.Entry<String, Vehiculo>>() {
            @Override
            public int compare(Map.Entry<String, Vehiculo> o1, Map.Entry<String, Vehiculo> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        System.out.println("Orden c/claves: " + entryList);
        System.out.println(".............................................................");

        Map<String, Vehiculo> vehiculoMap = new LinkedHashMap<String, Vehiculo>();
        for(Map.Entry<String, Vehiculo> entry : entryList){
            vehiculoMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(vehiculoMap);

    }

}


