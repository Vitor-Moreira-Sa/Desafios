/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiosestruturadedados.Desafio4;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        OperacoesImplementadas objetos = new OperacoesImplementadas();
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção");
            System.out.println("1) para adicionar");
            System.out.println("2) para remover");
            System.out.println("3) para mostrar o topo");
            System.out.println("4) para sair");

            int escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    String novoElemento = leitor.nextLine();
                    objetos.inserirInicio(novoElemento);
                    System.out.println("Elemento \"" + novoElemento + "\" adicionado.");
                    break;
                case 2:
                    String elementoRemovido = objetos.removerInicio();
                    if (elementoRemovido != null) {
                        System.out.println("Elemento \"" + elementoRemovido + "\" removido.");
                    } else {
                        System.out.println("Pilha vazia");
                    }
                    break;
                case 3:
                    String mostraTopo = objetos.mostrarTopo();
                    if (mostraTopo != null) {
                        System.out.println("Elemento \"" + mostraTopo + "\" está no topo.");
                    } else {
                        System.out.println("Pilha vazia.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando programa.");
                    leitor.close();
                    return;
            }
        }
    }
}
