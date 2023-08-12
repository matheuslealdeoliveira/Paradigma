package com.example.pilhafila;

public class PilhaFila {

    private int[] pilhaFila;
    private int tamanho;
    private int topo;

    public PilhaFila(int capacidade) {
        pilhaFila = new int[capacidade];
        tamanho = capacidade;
        topo = -1;
    }

    public boolean isEmpty() {
        if (tamanho == pilhaFila.length && topo == -1) {
            return true;
        }
        return false;
    }

    public Boolean isFull() {
        return topo == pilhaFila.length - 1;
    }

    public int peekPilha() {
        if (isEmpty()) {
            return -1;
        } else {
            return pilhaFila[topo];
        }
    }

    public int peekFila() {
        return pilhaFila[0];
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return pilhaFila[topo--];
        }
    }

    public int poll() {
        if (isEmpty()) {
            return -1;
        } else {
            int aux = pilhaFila[0];
            for (int i = 0; i < tamanho-1; i++) {
                pilhaFila[i] = pilhaFila[i+1];
            }
            tamanho --;
            return aux;
        }
    }

    public void push(int info) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia");
        } else {
            topo++;
            pilhaFila[topo] = info;
        }
    }

    public void insert(int info) {
        if (isFull()) {
            throw new IllegalStateException("Lista cheia");
        } else  {
            tamanho --;
            pilhaFila[tamanho] = info;
        }
    }

    public void exibe() {
        System.out.println("Pilha");
        for (int i = topo; i >= 0; i--) {
            System.out.print(pilhaFila[i]);
        }
        System.out.println();

        System.out.println("Fila");
        for (int i = tamanho +1; i <= pilhaFila.length -1; i++) {
            System.out.print(pilhaFila[i]);
        }
        System.out.println();
    }

    public void exibeRecursivo1() {
        System.out.println("Pilha 1");
        if (topo <= 0) {
            System.out.println(pilhaFila[topo]);
        } else {
            System.out.println(pilhaFila[topo]);
            exibeRecursivo1();
        }
    }

    public void exibeRecursivo2() {
        System.out.println("Pilha 1");
        if (tamanho == pilhaFila.length) {
            System.out.println(pilhaFila[topo]);
        } else {
            System.out.println(pilhaFila[topo]);
            exibeRecursivo2();
        }
    }

    public void exibeRecursivo() {
        exibeRecursivo1();
        exibeRecursivo2();
    }

}
