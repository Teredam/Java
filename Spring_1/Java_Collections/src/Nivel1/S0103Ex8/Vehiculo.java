package Nivel1.S0103Ex8;

public class Vehiculo /*implements Comparable<Vehiculo>*/{
    private String marca;
    private int serial;

    public Vehiculo(String marca, int serial) {
        this.marca = marca;
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public int getSerial() {
        return serial;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return marca + '\'' + serial;
    }

    /*@Override
    public int compareTo(Vehiculo o) {
        return this.getSerial() - o.getSerial();
    }*/
}
