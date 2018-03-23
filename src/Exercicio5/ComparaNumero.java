/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edil
 */
public class ComparaNumero {
    public static void main(String[] args) {
        
        try {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite o primeiro valor inteiro: ");
            Integer num1 = sc.nextInt();
            
            System.out.println("Digite o segundo valor inteiro: ");
            Integer num2 = sc.nextInt();
            
            comparaNumero(num1, num2);
        } catch (InputMismatchException e) {
            System.out.println("Digite somente números inteiros!");
        }
        
    }
    
    private static void comparaNumero(Integer num1, Integer num2){
        if (num1 == num2) {
            System.out.println("São iguais!");
        }else{
            System.out.println("São diferentes!");
            
            if (num1 > num2) {
                System.out.println(num1 + " é maior que " + num2);
            }else{
                System.out.println(num2 + " é maior que " + num1);
            }
        }
    }
}
