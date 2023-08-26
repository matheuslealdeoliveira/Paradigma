<<<<<<< HEAD
package com.example.exerciciolistaencadeada;

public class ListaLigadaOrdenada extends ListaLigada {

    @Override
    public void insereNode(int valor) {
        Node novo = new Node(valor);
        Node ant = getHead();
        Node atual = ant.getNext();
        boolean inseriu = false;

        while (atual != null) {
            if (atual.getInfo() >= valor) {
                novo.setNext(atual);
                ant.setNext(novo);
                inseriu = true;
                break;
            }
            ant = atual;
            atual = atual.getNext();
        }

        if (!inseriu) {
            ant.setNext(novo);
        }
    }

    @Override
    public Node buscaNode(int valor) {
        Node atual = getHead().getNext();
        while (atual != null && atual.getInfo() <= valor) {
            if (atual.getInfo() == valor) {
                break;
            }
            atual = atual.getNext();
        }
        return atual;
    }

}
=======
package com.example.exerciciolistaencadeada;

public class ListaLigadaOrdenada extends ListaLigada {

    @Override
    public void insereNode(int valor) {
        Node novo = new Node(valor);
        Node ant = getHead();
        Node atual = ant.getNext();
        boolean inseriu = false;

        while (atual != null) {
            if (atual.getInfo() >= valor) {
                novo.setNext(atual);
                ant.setNext(novo);
                inseriu = true;
                break;
            }
            ant = atual;
            atual = atual.getNext();
        }

        if (!inseriu) {
            ant.setNext(novo);
        }
    }

    @Override
    public Node buscaNode(int valor) {
        Node atual = getHead().getNext();
        while (atual != null && atual.getInfo() <= valor) {
            if (atual.getInfo() == valor) {
                break;
            }
            atual = atual.getNext();
        }
        return atual;
    }

}
>>>>>>> 595c641dab35a4a4b029c6a0763c3a873ddc4766
