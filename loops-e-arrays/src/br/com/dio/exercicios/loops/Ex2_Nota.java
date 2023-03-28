package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota = 0;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            switch (nota) {
                case null:System.out.println("Valor invalido!");
                    break;
                default:nota = scan.nextInt();
                    break;
            }
            
        }
    }
}