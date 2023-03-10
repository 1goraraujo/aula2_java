/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Scanner;

/**
 *
 * @author senaiden
 */
public class aula1 {

    public static void main(String[] args) {

//     nome do mercado
        String mercado = "Mercadinho do Sávio DEUS É AMOR";
//        variavel do produto
        int parcelas = 5;

//        entrada do teclado
        Scanner teclado = new Scanner(System.in);

// dados 
        System.out.println("Digite o valor do produto");
        float produto = teclado.nextFloat();
        float valorTotal = produto / parcelas;

//        exibição de resultados
        System.out.println(" " + mercado);
        System.out.println("O valor do produto é: " + produto);
        System.out.println("Será dividido em parcelas de: " + parcelas);
        System.out.println("O valor das parcelas será de: " + valorTotal);

    }
}
if (primeiro > segundo) {
            menor = segundo;
        } else {
            menor = primeiro;
        }   