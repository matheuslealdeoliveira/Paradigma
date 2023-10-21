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

    public void exibeArvore(Node noDaVez, int times) {
        if (noDaVez != null) {
            System.out.print(" ".repeat(times) + "|");
            System.out.println("-".repeat(times) + noDaVez.getInfo());
            times++;
            exibeArvore(noDaVez.getEsq(), times);
            exibeArvore(noDaVez.getDir(), times);
        }
    }

    public void preOrdem(Node noDaVez) {
        if (noDaVez != null) {
            System.out.print(noDaVez.getInfo() + " ");
            preOrdem(noDaVez.getEsq());
            preOrdem(noDaVez.getDir());
        }
    }

    public void emOrdem(Node noDaVez) {
        if (noDaVez != null) {
            emOrdem(noDaVez.getEsq());
            System.out.print(noDaVez.getInfo() + " ");
            emOrdem(noDaVez.getDir());
        }
    }

    public void posOrdem(Node noDaVez) {
        if (noDaVez != null) {
            posOrdem(noDaVez.getEsq());
            posOrdem(noDaVez.getDir());
            System.out.print(noDaVez.getInfo() + " ");
        }
    }

    public int profundidade(Node noDaVez) {
        if (noDaVez == null) {
            return 0;
        } else {
            int alturaEsquerda = profundidade(noDaVez.getEsq());
            int alturaDireita = profundidade(noDaVez.getDir());
            return Math.max(alturaEsquerda, alturaDireita) + 1;
        }
    }

    public int altura(Node noDaVez) {
        if (noDaVez == null) {
            return -1;
        } else {
            int alturaEsquerda = altura(noDaVez.getEsq());
            int alturaDireita = altura(noDaVez.getDir());
            return Math.max(alturaEsquerda, alturaDireita) + 1;
        }
    }

    public void getNoByValue(Node noDaVez, int valor) {
        if (noDaVez != null) {
            if (noDaVez.getInfo() == valor) {
                System.out.println(noDaVez);;
            }
            getNoByValue(noDaVez.getEsq(), valor);
            getNoByValue(noDaVez.getDir(), valor);
        }
    }

}
