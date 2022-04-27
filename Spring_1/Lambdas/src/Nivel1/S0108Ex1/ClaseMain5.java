package Nivel1.S0108Ex1;

public class ClaseMain5 implements InterfaceMain5{

    @Override
    public double getPiValue() {
        InterfaceMain5 interfaceMain5 = () -> 3.1415;
        return interfaceMain5.getPiValue();
    }
}
