package com.example.listaduplamenteencadeada;

public class Node {

    private Integer info;
    private Node next;
    private Node prev;

    public Node(Integer info) {
        this.info = info;
        this.next = null;
        this.prev = null;
    }

    public Integer getInfo() {
        return info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
