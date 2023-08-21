package com.example.exerciciolistaencadeada;

public class Teste {
    // 1
    public static void ordemCrescente() {
        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();
        lista.insereNode(5);
        lista.insereNode(2);
        lista.insereNode(6);
        lista.insereNode(3);

        System.out.println("Valores na lista de forma crescente:");
        lista.exibe();
    }

    public static void buscaOrdenada() {
        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();
        lista.insereNode(5);
        lista.insereNode(2);
        lista.insereNode(6);
        lista.insereNode(3);

        Node nodeEncontrado = lista.buscaNode(3);
        if (nodeEncontrado != null) {
            System.out.println("Nó encontrado: " + nodeEncontrado.getNext());
        } else {
            System.out.println("Nó não encontrado.");
        }

    }

    public static void testar() {
        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();

        lista.insereNode(5);
        lista.insereNode(2);
        lista.insereNode(7);
        lista.insereNode(1);

        System.out.println("Lista original:");
        lista.exibe();

        lista.removeNode(2);
        lista.removeNode(7);

        System.out.println("\nLista após remoção:");
        lista.exibe();
    }

    // 2
    public static void concatena() {
        ListaLigada lista1 = new ListaLigada();
        lista1.insereNode(10);
        lista1.insereNode(7);
        lista1.insereNode(15);
        lista1.insereNode(2);

        ListaLigada lista2 = new ListaLigada();
        lista2.insereNode(5);
        lista2.insereNode(20);
        lista2.insereNode(8);

        lista1.concatena(lista2);

        System.out.println("Lista concatenada:");
        lista1.exibe();
    }

    public static void compara() {
        ListaLigada lista1 = new ListaLigada();
        lista1.insereNode(10);
        lista1.insereNode(7);
        lista1.insereNode(15);

        ListaLigada lista2 = new ListaLigada();
        lista2.insereNode(10);
        lista2.insereNode(7);
        lista2.insereNode(14124);

        boolean saoIguais = lista1.compara(lista2);

        System.out.println("Lista 1");
        lista1.exibe();
        System.out.println("Lista 2");
        lista1.exibe();
        System.out.println("São iguais?" + saoIguais);
        System.out.println();
    }

    public static void inverte() {
        ListaLigada lista = new ListaLigada();

        lista.inverte(5);
        lista.inverte(2);
        lista.inverte(8);
        lista.inverte(4);
        lista.inverte(1);

        System.out.println("Valores na lista invertidos:");
        lista.exibe();
    }

    public static void exibeRecursivo() {
        ListaLigada lista = new ListaLigada();
        lista.insereNode(1);
        lista.insereNode(2);
        lista.insereNode(3);
        lista.insereNode(4);

        System.out.println("\nExibição recursiva:");
        lista.exibeRecursivo(lista.getHead().getNext());

    }

    public static void buscaRecursivo() {
        ListaLigada lista = new ListaLigada();
        lista.insereNode(1);
        lista.insereNode(2);
        lista.insereNode(3);
        lista.insereNode(4);

        System.out.println("\nBusca recursiva:");
        System.out.println(lista.buscaNodeRecursivo(lista.getHead().getNext(), 2));

    }

//    public static void removeRecursivo() {}

    public static void tamanhoRecursivo() {
        ListaLigada lista = new ListaLigada();
        lista.insereNode(1);
        lista.insereNode(2);
        lista.insereNode(3);
        lista.insereNode(4);

        System.out.println("Tamanho recursivo");
        lista.getTamanhoRecursivo(lista.getHead().getNext(), 0);
    }

    public static void main(String[] args) {
        // 1A
//        ordemCrescente();
//        buscaOrdenada();
//        testar();

        // 2C
//        concatena();
//        compara();
//        inverte();
//        exibeRecursivo();
//        buscaRecursivo();
//        removeRecursivo();
        tamanhoRecursivo();
    }

}
