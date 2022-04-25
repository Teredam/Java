/* Ejecuta el ejercicio 3 del nivel anterior parametrizando todos los métodos en un archivo de configuración. Puede
utilizar un archivo Java Properties, o bien la librería Apache Commons Configuration si lo desea. Del ejercicio anterior,
parametrice lo siguiente: Directorio a leer, Nombre y directorio del archivo txt resultante */
package Nivel2.S0105Ex1;

import java.io.*;
import java.util.Enumeration;
import java.util.PrimitiveIterator;
import java.util.Properties;

public class Main {
    private static final String CONFIG_TEXT_FILE = "src\\" + "Nivel1\\S0105Ex3";
            private static final String CONFIG_XML_FILE = "src\\config\\PropSample.xml";

    public static void main(String[] args) throws IOException {

        Properties propiedades =  new Properties();
        propiedades.load(new FileReader(CONFIG_TEXT_FILE));

        propiedades.entrySet()
                .forEach(System.out::println);
        /*InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("datos.properties");
            propiedades.load(inputStream);

            System.out.println(propiedades.getProperty("directorioPrincipal"));
            System.out.println(propiedades.getProperty("nombre"));
            System.out.println(propiedades.getProperty("directorioSecundario"));

            Enumeration<Object> claves = propiedades.keys();

            while (claves.hasMoreElements()){
                Object clave = claves.nextElement();
                System.out.println(clave.toString());
                propiedades.get(clave).toString();
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

}
