package com.example.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada {

    private Node head;
    private Node tail;

    public ListaDuplamenteEncadeada() {
        head = new Node(null);
        head.setNext(head);
        tail = new Node(null);
        tail.setPrev(tail);
    }

    public void insereNodeInicio(int info) {
        Node novo = new Node(info);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }

    public void insereNodeFinal(Integer info) {
        Node novo = new Node(info);
        novo.setPrev(tail.getPrev());
        tail.setPrev(novo);
    }

    public void exibeDoInicio() {
        Node atual = head.getNext();
        while (atual != head) {
            System.out.print(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public void exibeDoFinal() {
        Node atual = tail.getPrev();
        while (atual != tail) {
            System.out.print(atual.getInfo());
            atual = atual.getPrev();
        }
    }

    public boolean removeNode(Integer valor) {
        Node ant = getHead();
        Node atual = head.getNext();
        while (atual != head) {
            if (atual.getInfo() == valor) {
                ant.setNext(atual.getNext());
                return true;
            } else {
                ant = atual;
                atual = atual.getNext();
            }
        }
        return false;
    }

    public int getTamanho() {
        Node atual = head.getNext();
        int tamanho = 0;
        while (atual != head) {
            tamanho ++;
            atual = atual.getNext();
        }
        return tamanho;
    }

    public Integer removeNodeInicio() {
        Node remover = head.getNext();
        Integer valorRemover = remover.getInfo();
        removeNode(valorRemover);
        return valorRemover;
    }

    public Integer removeNodeFinal() {
        Node remover = tail.getPrev();
        Integer valorRemover = remover.getInfo();
        removeNode(valorRemover);
        return valorRemover;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}


