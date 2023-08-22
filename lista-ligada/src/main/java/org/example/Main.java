package org.example;

public class Main {
    public static void main(String[] args) {
//        Node retornado;
//        ListaLigada lista = new ListaLigada();
//
//        lista.insereNode(10);
//        lista.insereNode(20);
//        lista.insereNode(30);
//
//        lista.exibe();
//        System.out.println("Tamanho da lista: " + lista.getTamanho());
//
//        lista.insereNode(40);
//        lista.insereNode(50);
//
//        lista.exibe();
//        System.out.println("Tamanho da lista: " + lista.getTamanho());
//
//        retornado = lista.buscaNode(40);
//        if (retornado == null) {
//            System.out.println("Valor 40 não foi encontrado");
//        }
//        else {
//            System.out.println("Encontrado node com valor " + retornado.getInfo());
//        }
//
//        retornado = lista.buscaNode(77);
//        if (retornado == null) {
//            System.out.println("Valor 77 não foi encontrado");
//        }
//        else {
//            System.out.println("Encontrado node com valor " + retornado.getInfo());
//        }
//
//        if (lista.removeNode(20)) {
//            System.out.println("Valor 20 removido com sucesso");
//        }
//        else {
//            System.out.println("Valor 20 não foi encontrado para remoção");
//        }
//
//        lista.exibe();
//        System.out.println("Tamanho da lista: " + lista.getTamanho());
//
//        if (lista.removeNode(100)) {
//            System.out.println("Valor 100 removido com sucesso");
//        }
//        else {
//            System.out.println("Valor 100 não foi encontrado para remoção");
//        }

        // ++++++++++++++  1 ++++++++++++

        ListaLigada listaLigada = new ListaLigada();
        listaLigada.insereNode(2);
        listaLigada.insereNode(4);
        listaLigada.insereNode(6);
        listaLigada.insereNode(8);
        listaLigada.insereNode(10);

        listaLigada.inserirAposPrimeiroImpar(100);

        // ++++++++++++++  2 ++++++++++++

        ListaLigada listaLigada2 = new ListaLigada();
        listaLigada2.insereNode(2);
        listaLigada2.insereNode(7);
        listaLigada2.insereNode(10);
        listaLigada2.insereNode(35);
        listaLigada2.insereNode(9);

        System.out.println(listaLigada.getElemento(2));


        // ++++++++++++++  3 ++++++++++++

        ListaLigada listaLigada3 = new ListaLigada();
        listaLigada3.insereNode(2);
        listaLigada3.insereNode(7);
        listaLigada3.insereNode(2);
        listaLigada3.insereNode(35);
        listaLigada3.insereNode(2);

        System.out.println(listaLigada3.removeOcorrencias(2));
        listaLigada3.exibe();

        // ++++++++++++++  4 ++++++++++++

        ListaLigada listaLigada4 = new ListaLigada();
        int vetor[] = { 30, 50, 6, 90, 110};

        listaLigada4.arrayToList(vetor);
        listaLigada4.exibe();

    }
}