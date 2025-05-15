/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiosestruturadedados;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite quantas pilhas deseja criar: ");
        int quant = leitor.nextInt();
        List<Stack<Integer>> listaPilhas = quantidadePilhas(quant);

        System.out.println("\nPilhas criadas:");
        for (int i = 0; i < listaPilhas.size(); i++) {
            System.out.println("Pilha " + (i + 1) + ": " + listaPilhas.get(i));
        }

        leitor.close();
    }

    public static List<Stack<Integer>> quantidadePilhas(int quant) {
        Scanner leitor2 = new Scanner(System.in);
        List<Stack<Integer>> listaPilhas = new LinkedList<>();

        for (int i = 0; i < quant; i++) {
            Stack<Integer> pilhas = new Stack<>();
            System.out.print("\nQuantos elementos deseja adcionar na pilha " + (i + 1) + "? ");
            int quantidadePilhas = leitor2.nextInt();
            for (int j = 0; j < quantidadePilhas; j++) {
                System.out.print("\nDigite o elemento  que deseja adicionar na pilha " + (i + 1) + ": ");
                int valoresPilha = leitor2.nextInt();
                pilhas.push(valoresPilha);
            }
            listaPilhas.add(pilhas);
        }

        leitor2.close();
        return listaPilhas;
    }

}
