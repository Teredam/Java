package Nivel1.S0103Ex1;

import java.util.ArrayList;

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
        System.out.println("==============");
        for (int i = 0; i < mesesDelAno.size(); i++) {
            System.out.print(mesesDelAno.get(i).getName() + ", ");
        }

        /*interface Meses {
            int ENERO = 1, FEBRERO = 2, MARZO = 3, ABRIL = 4, MAYO = 5, JUNIO = 6, JULIO = 7, AGOSTO = 8, SEPTIEMBRE = 9
                    , OCTUBRE = 10, NOVIEMBRE = 11, DICIEMBRE = 12;

        }
        System.out.println(" ");
        System.out.println("==============");
        System.out.println(Meses.ABRIL);
        System.out.println("==============");

        final class Mes{
            private String nombre;

            private Mes(String nom){
                nombre = nom;
            }

            @Override
            public String toString() {
                return nombre;
            }
            public final static Mes
            ENE = new Mes("Enero"),
            FEB = new Mes("Febrero"),
            MAR = new Mes("Marzo"),
            ABR = new Mes("Abril"),
            MAY = new Mes("Mayo"),
            JUN = new Mes("Junio"),
            JUL = new Mes("Julio"),
            AGO = new Mes("Agosto"),
            SEP = new Mes("Septiembre"),
            OCT = new Mes("Octubre"),
            NOV = new Mes("Noviembre"),
            DIC = new Mes("Diciembre");

            public final static Mes[] mes = {
                    ENE, ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC
            };
        }
        Mes m = Mes.ENE;
        System.out.println(m);
        System.out.println("==============");
        m = Mes.mes[12];
        System.out.println(m);
        System.out.println(m == Mes.DIC);
        System.out.println(m.equals(Mes.DIC));*/
    }

}

