package com.example.matheuslealac1;

public class Repository {

    private Node head;

    public Repository() {
        head = new Node(' ');
    }

    public void insereNode(char value) {
        Node novo = new Node(value);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }

    public void addAtEnd(char value) {
        Node atual = head.getNext();
        while (atual != null) {
             if (atual != null){
                atual = atual.getNext();
            }
        }
        if (atual == null) {
            Node novo = new Node(value);
            novo.setNext(head.getNext());
            head.setNext(novo);
        }
    }

    public void addAfterSpace(char value) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == ' ') {
                Node novo = new Node(value);
                novo.setNext(atual.getNext());
                atual.setInfo(value);
            } else {
                atual = atual.getNext();
            }
        }
    }

    public void addAtIndex(int index, char value){
        Node atual = head.getNext();
        boolean inseriu = false;
        int contador = 0;

        while (atual != null) {
            if (contador == index) {
                Node novo = new Node(value);
                novo.setNext(atual.getNext());
                atual.setInfo(value); ;
                inseriu = true;
                break;
            } else {
                contador ++;
                atual = atual.getNext();
            }
        }
        if (!inseriu) {
            System.out.println("Erro ao inserir, esse caracter não existe");
        }

    }

    public void duplicateValue(char value) {
        Node atual = head.getNext();
        while (atual != null) {
            if (String.valueOf(atual.getInfo()) == String.valueOf(value)) {
                Node aux = new Node(atual.getInfo());
                Node novo = new Node(value);
                novo.setNext(atual.getNext());
                atual.setNext(null);
                aux.setNext(novo);
            } else {
                atual = atual.getNext();
            }
        }
    }

    public void show() {
        Node atual = head.getNext();
        while (atual != null) {
            System.out.print(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public void countWords() {
        Node atual = head.getNext();
        int palavras = 1;
        while (atual != null) {
            if (atual.getInfo() == ' ') {
                palavras++;
            }
            atual = atual.getNext();
        }
        System.out.println();
        System.out.println("Número de palavras " + palavras);
    }

    public void countWordsRecursivo(Node aux, int palavras) {
        if (aux == null) {
            if (aux.getInfo() == ' ') {
                palavras ++;
                System.out.println();
                System.out.println("Número de palavras recursivo " + palavras);
            }
        } else {
            if (aux.getInfo() == ' ') {
                palavras ++;
                countWordsRecursivo(aux.getNext(), palavras);
            } else {
                countWordsRecursivo(aux.getNext(), palavras);
            }

        }


    }
}
