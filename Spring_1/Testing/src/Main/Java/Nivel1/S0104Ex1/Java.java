package Main.Java.Nivel1.S0104Ex1;

import java.util.Arrays;
import java.util.List;

public class Java {
    private List<String> mesesDelAnio;

    public Java(){
        mesesDelAnio = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto",
                "Septiembre", "Octubre", "Noviembre", "Diciembre");
    }

    public int getTamanio(){
        return mesesDelAnio.size();
    }

    public String getMes(int posicion){
        return mesesDelAnio.get(posicion);
    }

    public List<String> getMesesDelAnio(){
        return mesesDelAnio;
    }

}
