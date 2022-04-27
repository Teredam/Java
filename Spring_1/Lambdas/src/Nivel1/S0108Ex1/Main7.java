package Nivel1.S0108Ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        List<String> cadenasMixtas = Arrays.asList("M1", "n0mbr3", "pu3d3", "53r", "051Ta", "y", "t3ng0", "3", "años");

        List<String> masLargaAMasCorta = cadenasMixtas.stream().sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        masLargaAMasCorta.forEach(System.out::println);
    }
}
