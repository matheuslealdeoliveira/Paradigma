package com.example.listacircular;

public class Node {

    private String info;
    private Node next;

    public Node(String info) {
        this.info = info;
        this.next = null;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
