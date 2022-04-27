package Nivel1.S0108Ex1;

public class Main8 {
    public static void main(String[] args) {
        InterfaceMain8 stringAlReves = (cadena) -> {String nuevaVersion = "";

            for (int i = cadena.length() - 1; i > 0; i--){
                nuevaVersion = nuevaVersion + cadena.charAt(i);
                //nuevaVersion += cadena.charAt(i);
            }

            return nuevaVersion;
        };
        System.out.println("Soy alumna de programación Backend Java");
        System.out.println("========================================");
        System.out.println("Al revés:");
        System.out.println(stringAlReves.reverse("Soy alumna de programación Backend Java"));
    }
}
