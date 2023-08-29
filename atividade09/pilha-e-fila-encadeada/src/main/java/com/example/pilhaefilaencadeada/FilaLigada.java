package com.example.pilhaefilaencadeada;

public class FilaLigada<T> {

    private Node<T> inicio;
    private Node<T> fim;

    public FilaLigada() {
        this.inicio = new Node<T>(null);
        this.fim = inicio;
    }

    public void insert(T info) {
        Node novo = new Node(info);
        fim.setNext(novo);
        fim = novo;
    }

    public boolean isEmpty() {
        return inicio == fim;
    }

    public void exibe() {
        Node atual = inicio.getNext();
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return inicio.getNext().getInfo();
    }

    public T poll() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        inicio = inicio.getNext();
        return inicio.getInfo();
    }

}
