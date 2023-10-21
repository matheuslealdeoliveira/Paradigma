package org.example;

public class Node {

    // Atributos
    private Paciente info;
    private Node prev;
    private Node next;

    // Construtor

    public Node(Paciente info) {
        this.info = info;
        prev = null;
        next = null;
    }

    // Getters e Setters

    public Paciente getInfo() {
        return info;
    }

    public void setInfo(Paciente info) {
        this.info = info;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
