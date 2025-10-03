package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        while (sc.hasNextInt()) {
            numeros.add(sc.nextInt());
        }

        List<Integer> ordenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        for (int n : ordenados) {
            System.out.print(n + " ");
        }
        System.out.println(); // salto de línea al final
    }
}
