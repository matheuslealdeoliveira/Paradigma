package com.example.exerciciolistaencadeada;

public class ListaLigada {

    private Node head;

    public ListaLigada() {
        head = new Node(0);
    }

    public Node getHead() {
        return head;
    }

    public void insereNode(int valor) {
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

    public Node buscaNode(int valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return atual;
            } else {
                atual = atual.getNext();
            }
        }
        return null;
    }

    public boolean removeNode(int valor) {
        Node ant = getHead();
        Node atual = head.getNext();
        while (atual != null) {
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
        while (atual != null) {
            tamanho = tamanho + 1;
            atual = atual.getNext();
        }
        return tamanho;
    }

    public void concatena(ListaLigada lista2) {
        Node ant = getHead();
        while (ant.getNext() != null) {
            ant = ant.getNext();
        }

        Node firstNodeLista2 = lista2.getHead().getNext();
        ant.setNext(firstNodeLista2);
    }

    public boolean compara(ListaLigada outraLista) {
        Node atualLista1 = getHead().getNext();
        Node atualLista2 = outraLista.getHead().getNext();

        while (atualLista1 != null && atualLista2 != null) {
            if (atualLista1.getInfo() != atualLista2.getInfo()) {
                return false;
            }
            atualLista1 = atualLista1.getNext();
            atualLista2 = atualLista2.getNext();
        }

        if (atualLista1 != null || atualLista2 != null) {
            return false;
        }

        return true;
    }

    public void inverte(int valor) {
        Node novo = new Node(valor);
        Node ant = getHead();
        Node atual = new Node(valor);
        boolean inseriu = false;

        while (atual != null) {
            if (valor < atual.getInfo()) {
                ant.setNext(novo);
                novo.setNext(atual);
                inseriu = true;
                break;
            }
            ant = atual;
            atual = atual.getNext();
        }
        if (!inseriu) {
            ant.setNext(novo);
        }
        insereNode(valor);
    }

    public void exibeRecursivo(Node atual) {
        if (atual == null) {
            System.out.println();
        } else {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
            exibeRecursivo(atual);
        }
    }

    public Node buscaNodeRecursivo(Node atual, int valor) {
        if (atual == null) {
            return null;
        } else {
            if (atual.getInfo() == valor) {
                return atual;
            } else {
                atual = atual.getNext();
                buscaNodeRecursivo(atual, valor);
            }
        }
        return atual;
    }

//    removeRecursivo

    public void getTamanhoRecursivo(Node atual, int tamanho) {
        if (atual == null) {
            System.out.println(tamanho);
        } else {
            tamanho = tamanho + 1;
            atual = atual.getNext();
            getTamanhoRecursivo(atual, tamanho);
        }
    }

}
