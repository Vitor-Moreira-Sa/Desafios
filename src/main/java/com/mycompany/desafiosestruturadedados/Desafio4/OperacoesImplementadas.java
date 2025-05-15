/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafiosestruturadedados.Desafio4;

/**
 *
 * @author vm040
 */
public class OperacoesImplementadas implements Operacoes {

    private No frente;
    private int quantidade;

    public OperacoesImplementadas() {
        this.frente = null;
        this.quantidade = 0;
    }

    public void inserirInicio(String elemento) {
        No novoNo = new No(elemento);
        if (estaVazia()) {
            frente = novoNo;
        } else {
            novoNo.proximo = frente;
            frente.anterior = novoNo;
            frente = novoNo;
        }
        quantidade++;
    }

    public String removerInicio() {
        if (estaVazia()) {
            return null;
        }
        String remover = frente.elemento;
        frente = frente.proximo;
        if (frente != null) {
            frente.anterior = null;
        }

        quantidade--;
        return remover;
    }

    public String mostrarTopo() {
        if (estaVazia()) {
            return null;
        } else {
            return frente.elemento;
        }
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }
}
