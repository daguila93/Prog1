/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

import java.util.Scanner;

/**
 *
 * @author edil
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        for (int i = 0; i < 5; i++) {
            //Pedindo o Nome
            System.out.println("Adicione somente 1º nome do contato de posição " + i + " do vetor: ");
            Contato contato = new Contato();
            contato.setNome(sc.next());

            //Pedindo o E-mail
            System.out.println("Digite o email: ");
            contato.setEmail(sc.next());

            agenda.adicionarNovoContato(contato);
            System.out.println("\n");
        }
        System.out.println("Busque um contato usando o nome dele(a): ");
        String nome = sc.next();
        System.out.println(agenda.buscarContatoPeloNome(nome).toString());
        
        System.out.println("Gostaria de apagar este contato? "
                          + "'s' para SIM ou qualquer outro botão para NÃO");
        boolean resposta =  sc.next().matches("s");
        agenda.excluirContatoPeloNome(resposta, nome);
    }

}
