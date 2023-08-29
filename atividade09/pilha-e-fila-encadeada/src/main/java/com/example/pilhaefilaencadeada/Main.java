package com.example.pilhaefilaencadeada;

public class Main {

    public static void pilha() {
        PilhaLigada pilhaLigada = new PilhaLigada();

        System.out.println();
        System.out.println("IsEmpty?");
        System.out.println(pilhaLigada.isEmpty());

        pilhaLigada.push("davi");
        pilhaLigada.push("guigo");
        pilhaLigada.push("matheus");

        System.out.println();
        System.out.println("Exibe pós push");
        pilhaLigada.exibe();

        System.out.println();
        System.out.println("IsEmpty?");
        System.out.println(pilhaLigada.isEmpty());

        System.out.println();
        System.out.println("Peek");
        System.out.println(pilhaLigada.peek());

        System.out.println();
        System.out.println("Exibe pós peek");
        pilhaLigada.exibe();

        System.out.println();
        System.out.println("Pop");
        System.out.println(pilhaLigada.pop());

        System.out.println();
        System.out.println("Exibe pós pop");
        pilhaLigada.exibe();
    }

    public static void fila() {

        FilaLigada filaLigada = new FilaLigada();

        System.out.println();
        System.out.println("IsEmpty?");
        System.out.println(filaLigada.isEmpty());

        filaLigada.insert("davi");
        filaLigada.insert("guigo");
        filaLigada.insert("matheus");

        System.out.println();
        System.out.println("Exibe pós insert");
        filaLigada.exibe();

        System.out.println();
        System.out.println("IsEmpty?");
        System.out.println(filaLigada.isEmpty());

        System.out.println();
        System.out.println("Peek");
        System.out.println(filaLigada.peek());

        System.out.println();
        System.out.println("Exibe pós peek");
        filaLigada.exibe();

        System.out.println();
        System.out.println("Poll");
        System.out.println(filaLigada.poll());

        System.out.println();
        System.out.println("Exibe pós Poll");
        filaLigada.exibe();

    }

    public static void lista() {

        ListaLigada listaLigada = new ListaLigada();

        System.out.println();
        System.out.println("Exibe");
        listaLigada.exibe();

        listaLigada.insereNode("davi");
        listaLigada.insereNode("guigo");
        listaLigada.insereNode("matheus");

        System.out.println();
        System.out.println("Exibe pós inserir");
        listaLigada.exibe();

        System.out.println();
        System.out.println("Buscando o guigo");
        System.out.println(listaLigada.buscaNode("guigo"));

        System.out.println();
        System.out.println("Tamanho");
        System.out.println(listaLigada.getTamanho());

        System.out.println();
        System.out.println("Removendo o guigo");
        listaLigada.removeNode("guigo");

        System.out.println();
        System.out.println("Exibe pós remoção");
        listaLigada.exibe();
    }

    public static void main(String[] args) {
//       pilha();
//       fila();
        lista();
    }

}
