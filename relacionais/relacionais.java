/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionais;

import java.util.Scanner;

/**
 *
 * @author senaiden
 */
public class relacionais {

    public static void main(String[] args) {

//        entrada do teclado
        Scanner teclado = new Scanner(System.in);

//        Solicitação dos numeros/declaração de variaveis
        System.out.println("Digite o primeiro número: ");
        int primeiro = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundo = teclado.nextInt();
        int menor = 0;
        int igual = 0;

//       condições para dizer qual é o maior numero 
        if (primeiro > segundo) {
            menor = segundo;
            System.out.println("O menor número é: " + menor);
        } else if (primeiro == segundo) {
            igual = segundo;
            System.out.println("Os numeros são iguais." );
        } else {
            menor = primeiro;
            System.out.println("O menor número é: " + menor);
        }

//        exibição do resultado 
        

//        fechamento do teclado
        teclado.close();
    }
}
