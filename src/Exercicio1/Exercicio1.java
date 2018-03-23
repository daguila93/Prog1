/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edil
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        try {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        Integer num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        Integer num2 = sc.nextInt();        
        
        testarDoisValores(num1, num2);
        
        } catch (InputMismatchException e) {
            System.out.println("Digite Valores Inteiros por favor.");
        }
        
    }

    static private void testarDoisValores(Integer num1, Integer num2) {

        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " é menor que " + num2);
        } else {
            System.out.println(num1 + " é igual a " + num2);
        }

    }
}