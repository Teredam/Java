package Main.Java.Nivel1.S0104Ex2;

public class CalculoDNI {
    private int numeroDNI;
    private char letraDNI;
    private final char [] listaDeLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z',
            'S','Q','V','H','L','C','K','E'};

    public CalculoDNI() {
        numeroDNI = 0;
    }

    public CalculoDNI(int numeroDNI) {
        this.numeroDNI = numeroDNI;
    }


    public void setNumeroDNI(int nuevoNumeroDNI) {
        this.numeroDNI = nuevoNumeroDNI;
    }

    public String obtenerLetra(int numeroDNI){
        int resto;
        resto = numeroDNI % 23;
        System.out.println("Número DNI: " + numeroDNI + " - " + listaDeLetra[resto]);
        char letra = listaDeLetra[resto];
        System.out.println(letra);
        return letra + "";
    }
}
