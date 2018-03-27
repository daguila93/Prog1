/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio7;

/**
 *
 * @author edil
 */
public class Agenda {

    Contato[] contatos = new Contato[5];

    protected void adicionarNovoContato(Contato contato) {
        for (int i = 0; i < 5; i++) {
            if (contatos[i] == null) {
                contatos[i] = contato;
                break;
            } else {
                continue;
            }
        }

    }

    protected Contato buscarContatoPeloNome(String nome) {
        
            for (Contato contato : contatos) {
                if (contato.getNome().equals(nome)) {
                    return contato;
                } else {
                    System.out.println("Não foi possível encontrar esse registro.");
                    System.exit(0);
                }
            }
        

        return null;
    }

    protected void excluirContatoPeloNome(Boolean resposta, String nome) {
        try {
            if (resposta) {
                for (int i = 0; i < contatos.length; i++) {
                    contatos[i] = null;
                    System.out.println("Contato apagado com sucesso!");
                    break;
                }
            } else{
                System.out.println("Ok, você não quer exluí-lo pois não digitou 's'\n Fim do Programa.");
            }
        } catch (Exception e) {
            System.out.println("Deu ruim: " + e.getMessage());
        }

    }

}