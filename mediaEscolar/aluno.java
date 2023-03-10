/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaEscolar;

import java.util.Scanner;

/**
 *
 * @author senaiden
 */
public class aluno {

    public static void main(String[] args) {
        //        entrada do teclado
        Scanner teclado = new Scanner(System.in);
        //        Solicitação dos numeros/declaração de variaveis
        System.out.println("Digite seu nome: ");
        String name = teclado.nextLine();
        System.out.println("Digite o sua primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite o sua segunda nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) / 2;

        //       condições para dizer qual é o maior numero 
        if (media  >= 7) {
            System.out.println("Aprovado!!");
        } else if (media >= 5)   {
            System.out.println(" Recuperaçao!!");
        }
        else {
            System.out.println("Reprovado!!");
        }
    }
}
