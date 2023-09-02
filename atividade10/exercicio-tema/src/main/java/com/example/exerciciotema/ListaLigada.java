package com.example.exerciciotema;

public class ListaLigada<T> {

    private Node<T> head;

    public ListaLigada() {
        head = new Node<T>(null);
    }

    public void insereNode(T valor) {
        Node novo = new Node(valor);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }

    public void exibe() {
        Node atual = head.getNext();
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public Node buscaNode(T valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return atual;
            }
            atual = atual.getNext();
        }
        return null;
    }

    public Boolean removeNode(T valor) {
        Node ant = head;
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                ant.setNext(atual.getNext());
                return true;
            }
            ant = atual;
            atual = atual.getNext();
        }
        return false;
    }

    public int getTamanho() {
        Node atual = head.getNext();
        int tam = 0;
        while (atual != null) {
            tam++;
            atual = atual.getNext();
        }
        return tam;
    }

    public T buscaPorId(int id) {
        Node atual = head.getNext();
        while (atual != null) {
            Heroi h = (Heroi) atual.getInfo();
            if (h.getId() == id) {
                return (T) atual.getInfo();
            }
            atual = atual.getNext();
        }
        return null;
    }

}
