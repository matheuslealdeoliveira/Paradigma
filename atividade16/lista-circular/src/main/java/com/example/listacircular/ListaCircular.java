package com.example.listacircular;

public class ListaCircular {

    private Node head;

    public ListaCircular() {
        head = new Node(null);
        head.setNext(head);
    }

    public void insereNode (String valor) {
        Node novo = new Node(valor);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }

    public void exibe() {
        Node atual = head.getNext();
        while (atual != head) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public boolean removeNode(String valor) {
        Node ant = getHead();
        Node atual = head.getNext();
        while (atual != head) {
            if (atual.getInfo().equals(valor)) {
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

    public void josephus(String nomeSoldado, int n) {
        Node atual = head.getNext();

        while (getTamanho() > 1) {
            for (int i = 1; i < n; i++) {
                atual = atual.getNext();
            }
            System.out.println("Soldado removido: " + atual.getInfo());
            removeNode(atual.getInfo());
            System.out.println("Soldados restantes: ");
            exibe();
            System.out.println();
        }

        System.out.print("Último soldado restante: ");
        exibe();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
