package com.example.listacircular;

public class Teste {

    public static void main(String[] args) {

//        ListaCircular listaCircular = new ListaCircular();
//
//        System.out.println("Inserindo A, B e C...");
//        listaCircular.insereNode("A");
//        listaCircular.insereNode("B");
//        listaCircular.insereNode("C");
//
//        System.out.println();
//        System.out.println("Exibindo depois de inserir");
//        listaCircular.exibe();
//
//        System.out.println();
//        System.out.println("Tamanho");
//        System.out.println(listaCircular.getTamanho());
//
//        System.out.println();
//        System.out.println("Removedo B");
//        listaCircular.removeNode("B");
//
//        System.out.println();
//        System.out.println("Exibindo depois de remover");
//        listaCircular.exibe();
//
//        System.out.println();
//        System.out.println("Tamanho depois de remover");
//        System.out.println(listaCircular.getTamanho());

        ListaCircular lista = new ListaCircular();
        lista.insereNode("A");
        lista.insereNode("B");
        lista.insereNode("C");
        lista.insereNode("D");
        lista.insereNode("E");

        String soldadoInicial = "A";
        int n = 3;
        lista.josephus(soldadoInicial, n);

    }

}
