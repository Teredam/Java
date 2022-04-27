package Nivel1.S0108Ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        List<String> cadenasMixtas = Arrays.asList("M1", "n0mbr3", "pu3d3", "53r", "051Ta", "y", "t3ng0", "3", "años");

        List<String> masCortaAMasLarga = cadenasMixtas.stream().sorted(Comparator.comparing(String::length))
                //.collect(Collectors.toList());
                        .toList();
        masCortaAMasLarga.forEach(System.out::println);
    }
}
