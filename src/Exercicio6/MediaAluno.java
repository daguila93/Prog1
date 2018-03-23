/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edil
 */
public class MediaAluno {

    private static Integer notas[] = new Integer[5];

    public static void main(String[] args) {
        System.out.println("Digite até 5 notas de um Aluno");
        int j = 1;
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite " + j + "ª nota de 0 a 100: ");

            try {
                Integer nota = sc.nextInt();
                adicionarNotaNoVetor(nota, i);
                j++;
            } catch (InputMismatchException e) {
                System.out.println("Digite somente números!\n Fim do Programa.");
                System.exit(0);
            }

        }

        System.out.println("Média: " + media());
    }

    private static void adicionarNotaNoVetor(Integer nota, int i) {
        
            if (nota >= 0 && nota <= 100) {
                notas[i] = nota;
            } else {
                System.out.println("Digite somente números de 0 a 100 por favor!");
            }        

    }

    private static Integer media() {
        Integer soma = 0;

        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        Integer media = soma / 5;
        return media;
    }
}
