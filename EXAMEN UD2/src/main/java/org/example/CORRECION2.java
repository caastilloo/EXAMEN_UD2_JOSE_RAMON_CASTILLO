package org.example;

import java.util.Scanner;

public class CORRECION2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("INTRODUZCA UNA FRASE:");
        String frase = teclado.nextLine();

        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;

        for (int i = 0; i < frase.length(); i++){

            frase = frase.toLowerCase();
            switch (frase.charAt(i)){

                case 'a':
                    contadora++;
                    break;
                case 'e':
                    contadore++;
                    break;
                case 'i':
                    contadori++;
                    break;
                case 'o':
                    contadoro++;
                    break;
                case 'u':
                    contadoru++;
                    break;
            }
        }

        System.out.println("VOCALES TOTALES: " + (contadora+contadore+contadori+contadoro+contadoru));
        System.out.println("A: " + contadora);
        System.out.println("E: " + contadore);
        System.out.println("I: " + contadori);
        System.out.println("O: " + contadoro);
        System.out.println("U: " + contadoru);

    }
}
