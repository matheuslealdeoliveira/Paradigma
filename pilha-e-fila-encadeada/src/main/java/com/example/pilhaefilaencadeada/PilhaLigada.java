package com.example.pilhaefilaencadeada;

public class PilhaLigada<T> {

    private Node<T> topo;

    public PilhaLigada() {
        this.topo = new Node<T>(null);
    }

    public void push(T valor) {
        Node novo = new Node(valor);
        novo.setNext(topo.getNext());
        topo.setNext(novo);
    }

    public boolean isEmpty() {
        return topo.getNext() == null;
    }

    public void exibe() {
        Node aux = topo.getNext();
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return topo.getNext().getInfo();
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        T ant = topo.getInfo();
        topo = topo.getNext();
        return topo.getInfo();
    }

}
