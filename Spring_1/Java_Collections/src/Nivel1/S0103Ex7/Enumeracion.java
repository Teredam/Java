package Nivel1.S0103Ex7;

public class Enumeracion implements Comparable<Enumeracion>{
    private int contarNumeros;
    String numerosEnLetras;

    public Enumeracion(int contarNumeros, String numerosEnLetras) {
        this.contarNumeros = contarNumeros;
        this.numerosEnLetras = numerosEnLetras;
    }

    public int getContarNumeros() {
        return contarNumeros;
    }

    public void setContarNumeros(int contarNumeros) {
        this.contarNumeros = contarNumeros;
    }

    public void setNumerosEnLetras(String numerosEnLetras) {
        this.numerosEnLetras = numerosEnLetras;
    }

    public String getNumerosEnLetras() {
        return numerosEnLetras;
    }

    @Override
    public String toString() {
        return
                "Contar en números y letras = " + contarNumeros +
                " - " + numerosEnLetras + ".";
    }

    @Override
    public int compareTo(Enumeracion o) {
        return this.getContarNumeros() - o.getContarNumeros();
    }
}
