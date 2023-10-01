package com.example.listaduplamenteencadeada;

public class Teste {

    public static void main(String[] args) {

        Integer numeroDivisao = 12;
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        while (numeroDivisao > 0) {
            int resto = numeroDivisao % 2;
            lista.insereNodeFinal(resto);
            numeroDivisao = numeroDivisao / 2;
        }

        lista.exibeDoFinal();

    }

}
