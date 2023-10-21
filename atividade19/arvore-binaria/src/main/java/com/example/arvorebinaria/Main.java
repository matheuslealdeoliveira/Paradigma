package com.example.arvorebinaria;

public class Main {

    public static void main(String[] args) {
        ArvoreBin arvoreBin = new ArvoreBin();

        Node pai = arvoreBin.criaRaiz(6);

        Node no1 = arvoreBin.insereEsq(pai, 4);
        Node no2 = arvoreBin.insereDir(pai, 8);

        Node no3 = arvoreBin.insereEsq(no1, 2);
        Node no4 = arvoreBin.insereDir(no1, 5);

        Node no5 = arvoreBin.insereEsq(no3, 1);
        Node no6 = arvoreBin.insereDir(no3, 3);

        Node no7 = arvoreBin.insereEsq(no2, 7);
        Node no8 = arvoreBin.insereDir(no2, 9);

        arvoreBin.exibeArvore(pai);

        System.out.println();

//        arvoreBin.exibeArvoreBonita(pai);

    }

}
