/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edil
 */
public class Exercicio2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um número inteiro maior que 0: ");
            Integer num = sc.nextInt();
            
            mostrarNumeroNaOrdemDecrescente(num);

        } catch (InputMismatchException e) {
            System.out.println("Digite um número Inteiro por favor.");
        }

    }

    private static void mostrarNumeroNaOrdemDecrescente(Integer num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
