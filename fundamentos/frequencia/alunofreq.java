/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencia;

import java.util.Scanner;

/**
 *
 * @author senaiden
 */
public class alunofreq {

    public static void main(String[] args) {
//        entrada do teclado
        Scanner teclado = new Scanner(System.in);
//        pedido de dados do usuario
        System.out.println("Digite seu nome");
        String name = teclado.nextLine();
        System.out.println("Digite sua primeira nota");
        float nota1 = teclado.nextFloat();
        System.out.println("Digite sua segunda nota");
        float nota2 = teclado.nextFloat();
        System.out.println("Digite a sua porcentagem de frequencia");
        int freq = teclado.nextInt();
        float media = (nota1 + nota2) / 2;

        //       condições para dizer a situação do aluno 
        if (media >= 7 && freq >= 70) {
            System.out.println("Aprovado!!");
        } else if (media >= 5 && freq >= 70) {
            System.out.println(" Recuperaçao!!");
        } else {
            System.out.println("Reprovado!!");
        }
    }

}
