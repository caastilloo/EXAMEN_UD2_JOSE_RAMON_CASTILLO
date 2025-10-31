package org.example;

import java.util.Scanner;

public class VOCALES {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una frase:");
        String mensaje = teclado.nextLine();
        String mensaje_mayus = mensaje.toLowerCase();


        int tamnyo = mensaje.length();
        char a = 'a';
        int contador_a = 0;

        char e = 'e';
        int contador_e = 0;

        char ii = 'i';
        int conador_i = 0;

        char o = 'o';
        int contador_o = 0;

        char u = 'u';
        int contador_u = 0;

        int contador_acentos = 0;

        for (int i = 0; i<tamnyo; i++){
            char letra = mensaje_mayus.charAt(i);

            switch (letra){
                case 'a':
                    contador_a++;
                    break;
                case 'e':
                    contador_e++;
                    break;
                case 'i':
                    conador_i++;
                    break;
                case 'o':
                    contador_o++;
                    break;
                case 'u':
                    contador_u++;
                    break;
                default:
                    break;
            }

        }

        int suma = contador_a + contador_e + conador_i + contador_o + contador_u;

        System.out.println("-----------------------");
        System.out.println("Cantidad total de vocales (no acentuadas): " + suma);

        System.out.println("A:" + contador_a);
        System.out.println("E:" + contador_e);
        System.out.println("I:" + conador_i);
        System.out.println("O:" + contador_o);
        System.out.println("U:" + contador_u);





    }
}
