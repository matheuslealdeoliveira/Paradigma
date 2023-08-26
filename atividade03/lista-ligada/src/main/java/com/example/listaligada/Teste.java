package com.example.listaligada;

public class Teste {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.insereNode(10);
        lista.insereNode(20);
        lista.exibe();

        System.out.println();
        System.out.println("Busca 10");
        System.out.println(lista.buscaNode(10));

        lista.removeNode(10);
        System.out.println();
        System.out.println("Exibe pós remove");
        lista.exibe();
    }

}
