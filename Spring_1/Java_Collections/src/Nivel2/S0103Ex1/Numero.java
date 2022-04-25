package Nivel2.S0103Ex1;

public class Numero implements Comparable<Numero>{
    private int numero;

    public Numero() {
        numero = (int) Math.floor(Math.random() * (100 - 0 + 1) + 0);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }

    @Override
    public int compareTo(Numero o) {
        return this.numero - o.numero;
    }
}
