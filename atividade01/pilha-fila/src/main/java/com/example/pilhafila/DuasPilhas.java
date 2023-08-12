package com.example.pilhafila;

public class DuasPilhas {
    private int[] pilha;
    private int topo1;
    private int topo2;

    public DuasPilhas(int capacidade) {
        this.pilha = new int[capacidade];
        topo1 = -1;
        topo2 = capacidade;
    }

    public Boolean isEmpty(int qualPilha) {
        if (qualPilha == 1) {
            return topo1 == -1;
        } else {
            return topo2 == pilha.length;
        }
    }

    public Boolean isFull() {
        return topo1 == topo2 -1;
    }

    public void push(int info, int qualPilha) {
        if (isFull()) {
            throw new IllegalStateException("Pilha cheia");
        } else {
            if (qualPilha == 1) {
                topo1++;
                pilha[topo1] = info;
            } else {
                topo2--;
                pilha[topo2] = info;
            }
        }
    }

    public int pop(int qualPilha) {
        if (isEmpty(qualPilha)) {
            return -1;
        } else {
            if (qualPilha == 1) {
                return pilha[topo1--];
            } else {
                return pilha[topo2++];
            }
        }
    }

    public int peek(int qualPilha) {
        if (isEmpty(qualPilha)) {
            return -1;
        } else {
            if (qualPilha == 1) {
                return pilha[topo1];
            } else {
                return pilha[topo2];
            }
        }
    }

    public void exibe() {
        System.out.println("Pilha 1");
        for (int i = topo1; i >= 0; i--) {
            System.out.print(pilha[i]);
        }
        System.out.println();

        System.out.println("Pilha 2");
        for (int i = topo2; i <= pilha.length -1; i++) {
            System.out.print(pilha[i]);
        }
        System.out.println();
    }

    public void exibeRecursivo1() {
        System.out.println("Pilha 1");
        if (topo1 <= 0) {
            System.out.println(pilha[topo1]);
        } else {
            System.out.println(pilha[topo1]);
            exibeRecursivo1();
        }
    }

    public void exibeRecursivo2() {
        System.out.println("Pilha 1");
        if (topo2 == pilha.length) {
            System.out.println(pilha[topo2]);
        } else {
            System.out.println(pilha[topo2]);
            exibeRecursivo2();
        }
    }

    public void exibeRecursivo() {
        exibeRecursivo1();
        exibeRecursivo2();
    }

}
