package com.example.pilhafila;

public class FilaPilha {
    private int[] filaPilha;
    private int tamanho;
    private int topo;

    public FilaPilha(int capacidade) {
        this.filaPilha = new int[capacidade];
        this.tamanho = filaPilha.length;
        this.topo = -1;
    }

    public boolean isEmpty() {
        if (tamanho == filaPilha.length && topo == -1) {
            return true;
        }
        return false;
    }

    public Boolean isFull() {
        return topo == filaPilha.length - 1;
    }

    public int peekPilha() {
        if (isEmpty()) {
            return -1;
        } else {
            return filaPilha[topo];
        }
    }

    public int peekFila() {
        return filaPilha[0];
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            return filaPilha[topo--];
        }
    }

    public int poll() {
        if (isEmpty()) {
            return -1;
        } else {
            int aux = filaPilha[0];
            for (int i = 0; i < tamanho-1; i++) {
                filaPilha[i] = filaPilha[i+1];
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
            filaPilha[topo] = info;
        }
    }

    public void insert(int info) {
        if (isFull()) {
            throw new IllegalStateException("Lista cheia");
        } else  {
            tamanho --;
            filaPilha[tamanho] = info;
        }
    }

    public void exibe() {
        System.out.println("Pilha");
        for (int i = topo; i >= 0; i--) {
            System.out.print(filaPilha[i]);
        }
        System.out.println();

        System.out.println("Fila");
        for (int i = tamanho +1; i <= filaPilha.length -1; i++) {
            System.out.print(filaPilha[i]);
        }
        System.out.println();
    }

    public void exibeRecursivo1() {
        System.out.println("Pilha 1");
        if (topo <= 0) {
            System.out.println(filaPilha[topo]);
        } else {
            System.out.println(filaPilha[topo]);
            exibeRecursivo1();
        }
    }

    public void exibeRecursivo2() {
        System.out.println("Pilha 1");
        if (tamanho == filaPilha.length) {
            System.out.println(filaPilha[topo]);
        } else {
            System.out.println(filaPilha[topo]);
            exibeRecursivo2();
        }
    }

    public void exibeRecursivo() {
        exibeRecursivo1();
        exibeRecursivo2();
    }

}
