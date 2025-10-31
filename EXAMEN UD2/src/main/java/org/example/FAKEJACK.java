package org.example;

import java.util.Random;
import java.util.Scanner;

public class FAKEJACK {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("*** BIENVENIDO A FACKEJACK ***");
        int num_maquina = aleatorio.nextInt(16,21)+1;

        int carta_usuario = aleatorio.nextInt(1,11)+1;

        char s = 's';
        char n = 'n';
        boolean seguir = false;

        char eleccion_char = 'x';

        int cartax2 = 0;

            for (int i = 0; i<1; i++){
                System.out.println("Tu carta es: " + carta_usuario);
                System.out.println("Puntuación actual: " + carta_usuario);
                System.out.println("----------------------------------------");

                System.out.println("¿Quieres otra? (s/n):");
                String eleccion = teclado.next();
                eleccion_char = Character.toLowerCase(eleccion.charAt(0));


                switch (eleccion_char){
                    case 's':

                        int nueva_carta = aleatorio.nextInt(2,11)+1;
                        carta_usuario = carta_usuario+nueva_carta;
                        System.out.println("Tu carta es: " + nueva_carta);
                        System.out.println("Puntuación actual: " + carta_usuario);
                        System.out.println("----------------------------------------");

                    case 'n':
                        break;

                    default:
                        break;
                }

                if (carta_usuario>21){
                    System.out.println("TE HAS PASADO. LA BANCA GANA!");
                    break;
                }else if (carta_usuario>num_maquina){
                    System.out.println("HAS GANADO!");
                    System.out.println("Puntos banca: " + num_maquina);
                    System.out.println("Puntos jugador: " + carta_usuario);
                    break;
                } else if (carta_usuario<num_maquina) {
                    System.out.println("HAS PERDIDO. GANA LA BANCA!");
                    System.out.println("Puntos banca: " + num_maquina);
                    System.out.println("Puntos jugador: " + carta_usuario);
                    break;
                }else {
                    System.out.println("EMPATE!");
                    System.out.println("Puntos banca: " + num_maquina);
                    System.out.println("Puntos jugador: " + carta_usuario);
                    break;
                }


            }




    }
}
