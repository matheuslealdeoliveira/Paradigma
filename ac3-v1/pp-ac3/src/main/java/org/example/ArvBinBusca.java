package org.example;

public class ArvBinBusca {

    private Node raiz;

    public ArvBinBusca() {
        this.raiz = null;
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

    public void inserir(Aluno info) {
        if (raiz == null) {
            raiz = new Node(info);
        } else {
            Node noDaVez = raiz; // começa a percorrer a árvore
            while (noDaVez != null && noDaVez.getInfo().getPontuacao() != info.getPontuacao()) {
                Node noNovo = new Node(info);
                if (info.getPontuacao() <= noDaVez.getInfo().getPontuacao()) {
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

}
