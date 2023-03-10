/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao;

import java.util.Scanner;

/**
 *
 * @author senaiden
 */
public class votacao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//        dados do usuario
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();

//        condições
        if (idade >= 18 && idade <= 65) {
            System.out.println("Você é obrigado a votar");
        } else {
            System.out.println("Você não é obrigado a votar");
        }
        teclado.close();
    }
}
