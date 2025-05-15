/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.desafiosestruturadedados;

//importação das funções necessárias
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        //criação do scanner para ler a entrada que o usuário digitar
        Scanner ler = new Scanner(System.in);

        System.out.println("Digrite uma frase terminada em '.' :");
        String texto = ler.nextLine(); //lê a entrada do usuário
        List<String> palavrasInvertidas = inverterLetras(texto); //recebe o valor digitado e retorna as palavras invertidas

        for (String palavra : palavrasInvertidas) {/*declarando uma String que vai referenciar um elemento de
                                                "palavrasInvertidas", que é armazenado e processado com a String declarada*/
            System.out.println(palavra);
        }

        ler.close();
    }

    public static List<String> inverterLetras(String texto) { //recebe o texto como entrada para retornar as palavras

        List<String> palavrasInvertidas = new ArrayList<>(); //criado para armazenar palavras individualmente
        Scanner palavras = new Scanner(texto); //novo Scanner pra processar a String digitada
        palavras.useDelimiter("\\s+"); //função do Scanner para ignorar os espaços vazios ao armazenar as palavras

        while (palavras.hasNext()) { //um loop para continuar lendo enquanto houver tokens
            String palavraOriginal = palavras.next(); //lê o próximo token
            Stack<Character> pilhaLetra = new Stack<>(); //pilha para armazenar as letras
            String palavraInvertida = "";

            //vai separar as letras da palavra digitada e empilhas
            for (char letra : palavraOriginal.toCharArray())/*converte uma String em um Array de caracteres)*/ {
                pilhaLetra.push(letra);
            }

            //desempilha e concatena dentro da String
            while (!pilhaLetra.isEmpty()) {
                palavraInvertida = palavraInvertida + pilhaLetra.pop();
            }

            palavrasInvertidas.add(palavraInvertida);

            if (palavraOriginal.endsWith(".")) {
                break;
            }
        }

        palavras.close();
        return palavrasInvertidas;
    }
}
