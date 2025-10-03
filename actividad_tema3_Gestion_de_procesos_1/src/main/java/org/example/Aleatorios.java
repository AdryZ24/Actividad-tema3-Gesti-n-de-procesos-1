package org.example;

import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        Random rand = new Random();
        int cantidad = 40;

        for (int i = 0; i < cantidad; i++) {
            int numero = rand.nextInt(101);
            System.out.print(numero + " ");
        }
        System.out.println();
        System.out.flush();
    }
}



