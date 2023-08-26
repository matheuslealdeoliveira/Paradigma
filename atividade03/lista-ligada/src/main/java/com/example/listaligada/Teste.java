<<<<<<< HEAD
package com.example.listaligada;

public class Teste {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.insereNode(10);
        lista.insereNode(20);
        lista.exibe();

        System.out.println();
        System.out.println("Busca 10");
        System.out.println(lista.buscaNode(10));

        lista.removeNode(10);
        System.out.println();
        System.out.println("Exibe pós remove");
        lista.exibe();
    }

}
=======
package com.example.listaligada;

public class Teste {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.insereNode(10);
        lista.insereNode(20);
        lista.exibe();

        System.out.println();
        System.out.println("Busca 10");
        System.out.println(lista.buscaNode(10));

        lista.removeNode(10);
        System.out.println();
        System.out.println("Exibe pós remove");
        lista.exibe();
    }

}
>>>>>>> 595c641dab35a4a4b029c6a0763c3a873ddc4766
