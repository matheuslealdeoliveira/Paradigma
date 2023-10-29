package com.example.arvorebinairabusca;

public class ArvoreBinariaBusca {

    private Node raiz;

    public ArvoreBinariaBusca() {
        this.raiz = null;
    }

    public Node getRaiz() {
        return raiz;
    }

    public void percorre(String metodo) {
        if (metodo.equals("pre ordem")) {
            preOrdem(raiz);
        }
        if (metodo.equals("em ordem")) {
            emOrdem(raiz);
        }
        if (metodo.equals("pos ordem")) {
            posOrdem(raiz);
        }
    }

    public void insere(int info) {
        if (raiz == null) {
            raiz = new Node(info);
        } else {
            Node noDaVez = raiz; // começa a percorrer a árvore
            while (noDaVez != null && noDaVez.getInfo() != info) {
                Node noNovo = new Node(info);
                if (info <= noDaVez.getInfo()) {
                    if (noDaVez.getEsq() == null) {
                        noDaVez.setEsq(noNovo);
                    }
                    noDaVez = noDaVez.getEsq();
                } else {
                    if (noDaVez.getDir() == null) {
                        noDaVez.setDir(noNovo);
                    }
                    noDaVez = noDaVez.getDir();
                }
            }
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

    public void buscar(int valor) {
        System.out.println(busca(raiz, valor));
    }

    private Node busca(Node noDaVez, int info) {
        if (noDaVez == null || noDaVez.getInfo() == info) {
            return noDaVez;
        }

        if (info < noDaVez.getInfo()) {
            return busca(noDaVez.getEsq(), info);
        } else {
            return busca(noDaVez.getDir(), info);
        }
    }

}
