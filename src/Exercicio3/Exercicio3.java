/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;

import java.util.ArrayList;

/**
 *
 * @author edil
 */
public class Exercicio3 {

    public static void main(String[] args) {
        //Variáveis e ArraysLists
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        Integer somaImpar = 0 ;
        Long multiplicacaoPar = 1l;
        
        //Iteração
        for (int i = 1; i <= 30; i++) {
            if(i % 2 != 0){
                impares.add(i);
                somaImpar += i;
            }else{
                pares.add(i);
                multiplicacaoPar *= i;
            }
            
        }System.out.println("A soma dos números ímpares de 0 a 30 é: " + somaImpar);
         System.out.println("A multiplicacao dos números pares de 0 a 30 é: " + multiplicacaoPar);
    }
}
//Primeira vez que trabalhei com ArrayList na vida.