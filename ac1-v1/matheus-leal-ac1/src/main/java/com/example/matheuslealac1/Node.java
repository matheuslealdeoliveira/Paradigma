package com.example.matheuslealac1;

public class Node {

    private char info;
    private Node next;

    // Construtor
    public Node(char info) {
        this.info = info;
        next = null;
    }

    // Métodos
    public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
