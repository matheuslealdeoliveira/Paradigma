package com.example.pilhafila;

public class Main {

    public static void exercicio1(){
        int[] vetor = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        DuasPilhas pilhas = new DuasPilhas(10);

        System.out.println("EMPTY");
        System.out.println(pilhas.isEmpty(1));
        System.out.println(pilhas.isEmpty(2));
        System.out.println("===============================");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                pilhas.push(vetor[i], 1);
            } else {
                pilhas.push(vetor[i], 2);
            }
        }

        System.out.println("INSERINDO......");
        System.out.println("===============================");

        System.out.println("EMPTY");
        System.out.println(pilhas.isEmpty(1));
        System.out.println(pilhas.isEmpty(2));
        System.out.println("===============================");

        System.out.println("EXIBE");
        pilhas.exibe();
        System.out.println("===============================");

        System.out.println("IS FULL");
        System.out.println(pilhas.isFull());
        System.out.println("===============================");

        System.out.println("PEEK");
        System.out.println(pilhas.peek(1));
        System.out.println(pilhas.peek(2));
        System.out.println("===============================");

        System.out.println("EXIBE");
        pilhas.exibe();
        System.out.println("===============================");

        System.out.println("POP");
        System.out.println(pilhas.pop(1));
        System.out.println(pilhas.pop(2));
        System.out.println("===============================");

        System.out.println("EXIBE");
        pilhas.exibe();
        System.out.println("===============================");
    }

    public static void exercicio2(){
        int[] vetor = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        FilaPilha filaPilha = new FilaPilha(10);

        System.out.println("EMPTY");
        System.out.println(filaPilha.isEmpty());
        System.out.println(filaPilha.isEmpty());
        System.out.println("===============================");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                filaPilha.push(vetor[i]);
            } else {
                filaPilha.insert(vetor[i]);
            }
        }

        System.out.println("INSERINDO......");
        System.out.println("===============================");

        System.out.println("EMPTY");
        System.out.println(filaPilha.isEmpty());
        System.out.println(filaPilha.isEmpty());
        System.out.println("===============================");

        System.out.println("EXIBE");
        filaPilha.exibe();
        System.out.println("===============================");

        System.out.println("IS FULL");
        System.out.println(filaPilha.isFull());
        System.out.println("===============================");

        System.out.println("PEEK");
        System.out.println(filaPilha.peekPilha());
        System.out.println(filaPilha.peekFila());
        System.out.println("===============================");

        System.out.println("EXIBE");
        filaPilha.exibe();
        System.out.println("===============================");

        System.out.println("POP");
        System.out.println(filaPilha.pop());
        System.out.println(filaPilha.poll());
        System.out.println("===============================");

        System.out.println("EXIBE");
        filaPilha.exibe();
        System.out.println("===============================");
    }

    public static void exercicio3(){
        int[] vetor = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

        PilhaFila pilhaFila = new PilhaFila(10);

        System.out.println("EMPTY");
        System.out.println(pilhaFila.isEmpty());
        System.out.println(pilhaFila.isEmpty());
        System.out.println("===============================");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                pilhaFila.push(vetor[i]);
            } else {
                pilhaFila.insert(vetor[i]);
            }
        }

        System.out.println("INSERINDO......");
        System.out.println("===============================");

        System.out.println("EMPTY");
        System.out.println(pilhaFila.isEmpty());
        System.out.println(pilhaFila.isEmpty());
        System.out.println("===============================");

        System.out.println("EXIBE");
        pilhaFila.exibe();
        System.out.println("===============================");

        System.out.println("IS FULL");
        System.out.println(pilhaFila.isFull());
        System.out.println("===============================");

        System.out.println("PEEK");
        System.out.println(pilhaFila.peekPilha());
        System.out.println(pilhaFila.peekFila());
        System.out.println("===============================");

        System.out.println("EXIBE");
        pilhaFila.exibe();
        System.out.println("===============================");

        System.out.println("POP");
        System.out.println(pilhaFila.pop());
        System.out.println(pilhaFila.poll());
        System.out.println("===============================");

        System.out.println("EXIBE");
        pilhaFila.exibe();
        System.out.println("===============================");
    }

    public static void main(String[] args) {
//        exercicio1();
//        exercicio2();
        exercicio3();
    }


}
