package com.example.arvorebinairabusca;

public class Main {

    public static void main(String[] args) {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.insere(6);
        arvore.insere(4);
        arvore.insere(2);
        arvore.insere(1);
        arvore.insere(3);
        arvore.insere(5);
        arvore.insere(8);
        arvore.insere(7);
        arvore.insere(9);

        System.out.println("PRE ORDEM");
        arvore.percorre("pre ordem");
        System.out.println();

        System.out.println("EM ORDEM");
        arvore.percorre("em ordem");
        System.out.println();

        System.out.println("POS ORDEM");
        arvore.percorre("pos ordem");
        System.out.println();

        System.out.println("Busca");
        arvore.buscar(90);
        System.out.println();


    }

}
