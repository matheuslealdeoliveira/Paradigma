package com.example.arvorebinaria;

public class ArvoreBin {

    private Node raiz;

    public ArvoreBin() {
        this.raiz = null;
    }

    public Node getRaiz() {
        return raiz;
    }

    public Node criaRaiz(int info) {
        Node obj = new Node(info);
        raiz = obj;
        return obj;
    }

    public Node insereDir(Node pai, int info) {
        if (getRaiz() != null) {
            if (pai.getDir() == null) {
                Node obj = new Node(info);
                pai.setDir(obj);
                return obj;
            }
        }
        return null;
    }

    public Node insereEsq(Node pai, int info) {
        if (getRaiz() != null) {
            if (pai.getEsq() == null) {
                Node obj = new Node(info);
                pai.setEsq(obj);
                return obj;
            }
        }
        return null;
    }

    public void exibeArvore(Node noDaVez) {
        if (noDaVez != null) {
            System.out.println(noDaVez.getInfo());
            if (noDaVez.getEsq() != null) {
                System.out.println("Esquerda: " + noDaVez.getEsq().getInfo());
            }
            if (noDaVez.getDir() != null) {
                System.out.println("Direita: " + noDaVez.getDir().getInfo());
            }
            exibeArvore(noDaVez.getEsq());
            exibeArvore(noDaVez.getDir());
        }
    }

    public void exibeArvoreBonita(Node noDaVez) {
        if (noDaVez != null) {
            System.out.println(noDaVez.getInfo());
        }
        exibeArvoreBonita(noDaVez);
    }

}
