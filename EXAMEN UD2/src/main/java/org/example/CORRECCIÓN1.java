package org.example;

import java.util.Random;
import java.util.Scanner;

public class CORRECCIÓN1 {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int numero_banco = 0;

        System.out.println("*** BIENVENIDO AL FAKEJACK ***");

        // FORMULA - int numero_banco = aleatorio.nextInt(max - min + 1) + min;

        // OPCIÓN 1
        numero_banco = aleatorio.nextInt(21-17+1)+17;

        // OPCIÓN 2
        numero_banco = aleatorio.nextInt(5)+17;

        System.out.println(numero_banco);

        int numero_jugador = 0;
        int puntuacion = 0;
        String opcion = teclado.next();

        do {
            numero_jugador = aleatorio.nextInt(11-2+1)+2;
            puntuacion+=numero_jugador;

            System.out.println("Tu carta es: " + numero_jugador);
            System.out.println("Puntuación actual: " + puntuacion);

            System.out.println("---------------------------------------");

            if (puntuacion>21){
                System.out.println("TE HAS PASADO. LA BANCA GANA!");
                break;
            }

            System.out.println("¿Quieres otra? (S/N)");

            opcion = teclado.next();

            if (opcion.toLowerCase().equals('n')){
                break;
            }

        }while(true);

        if (opcion.toLowerCase().equals('n')){

            if (puntuacion > numero_banco){
                System.out.println("HAS GANADO!");
            } else if (puntuacion < numero_banco) {
                System.out.println("HAS PERDIDO! GANA LA BANCA");
            }else {
                System.out.println("EMPATE!");
            }

            System.out.println("PUNTOS JUGADOR: " + puntuacion);
            System.out.println("PUNTOS BANCA: " + numero_banco);


        }

    }
}
