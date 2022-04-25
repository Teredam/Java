package Nivel1.S0103Ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> mesesDelAno = new ArrayList<>();

        mesesDelAno.add(new Month("enero"));
        mesesDelAno.add(new Month("febrero"));
        mesesDelAno.add(new Month("marzo"));
        mesesDelAno.add(new Month("abril"));
        mesesDelAno.add(new Month("mayo"));
        mesesDelAno.add(new Month("junio"));
        mesesDelAno.add(new Month("julio"));
        mesesDelAno.add(new Month("septiembre"));
        mesesDelAno.add(new Month("octubre"));
        mesesDelAno.add(new Month("noviembre"));
        mesesDelAno.add(new Month("diciembre"));

        for (int i = 0; i < mesesDelAno.size(); i++){
            System.out.print(mesesDelAno.get(i).getName() + ", ");
        }
        System.out.println(" ");
        mesesDelAno.add(7, new Month("agosto"));
        mesesDelAno.add(new Month("agosto"));
        mesesDelAno.add(new Month("julio"));

        System.out.println("==============");
        for (int i = 0; i < mesesDelAno.size(); i++) {
            System.out.print(mesesDelAno.get(i).getName() + ", ");
        }

        Set<Month> listaMeses = new HashSet<>(mesesDelAno);
        System.out.println(" ");
        System.out.print("==============");
        System.out.println(" ");

        for (Month lista : listaMeses) {
            System.out.print(lista.getName() + ", ");

            
        }
    }

}
