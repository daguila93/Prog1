/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edil
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o Valor da variável A: ");
            Integer numA = sc.nextInt();

            System.out.println("Digite o Valor da variável B: ");
            Integer numB = sc.nextInt();

            inverteValores(numA, numB);

        } catch (InputMismatchException e) {
            System.out.println("Digite somente números inteiros por favor.");
        }

    }

    private static void inverteValores(Integer numA, Integer numB) {
        Integer buffer = numA;
        numA = numB;
        numB = buffer;

        System.out.println("O valor invertido de numA é: " + numA);
        System.out.println("O valor invertido de numB é: " + numB);
    }
}
