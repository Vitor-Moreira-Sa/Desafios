/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiosestruturadedados;

//importação de classes prontas
import java.util.Scanner;
import java.util.Stack;

public class Desafio2 {

    public static void main(String[] args) {
        //inicialização de um Scanner e de uma Pilha
        Scanner ler = new Scanner(System.in);
        Stack<Integer> pilhaDesordenada = new Stack<>();

        System.out.println("Quantos número deseja armazenar?");
        int num = ler.nextInt();

        //para que o usuario digite os números que serão armazenados na pilha
        for (int i = 0; i <= num; i++) {
            System.out.print("\nDigite o número: ");
            int valores = ler.nextInt();
            pilhaDesordenada.push(valores);
        }

        //criação da pilha que vai receber os números ordenados
        Stack<Integer> pilhaOrdenada = numerosOrdenados(pilhaDesordenada);
        System.out.println("\nAqui estão os valores ordenados de forma crescente: " + pilhaOrdenada);
        
    }

    //função para ordenas os números de forma crescente
    public static Stack<Integer> numerosOrdenados(Stack<Integer> pilhaDesordenada) {
        //criação de uma pilha local para manipular os valores
        Stack<Integer> numerosOrdenados = new Stack<>();

        //laço para que os números da pilha sejam armazenados numa variavél aos serem desempilhados
        while (!pilhaDesordenada.isEmpty()) {
            int posicaoTemp = pilhaDesordenada.pop();
        
            //laço para comparar o topo da pilha enquanto ela não estiver vazia com o número guardado anteriormente
            while (!numerosOrdenados.isEmpty() && numerosOrdenados.peek() > posicaoTemp){
                //se o atual topo for maior que o número guardado ele é inserido novamente em pilhaDesordenada
                pilhaDesordenada.push(numerosOrdenados.pop());
            }
            
            //se a pilha estiver vazia ou o topo for menor que o topo atual, ele é inserido como novo topo
            numerosOrdenados.push(posicaoTemp);
        
        }

        return numerosOrdenados;
    }
}
