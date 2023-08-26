package com.example.hashtable;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);

        hashTable.insere(54);
        hashTable.insere(21);
        hashTable.insere(15);
        hashTable.insere(46);
        hashTable.insere(7);
        hashTable.insere(33);
        hashTable.insere(9);

        System.out.println("=".repeat(100));

        System.out.println("Hash após inserção:");
        hashTable.exibe();

        System.out.println("=".repeat(100));

        System.out.println("Buscando valores");
        System.out.println("Busca 9: " + hashTable.busca(9));
        System.out.println("Busca 1: " + hashTable.busca(1));

        System.out.println("=".repeat(100));

        System.out.println("Removendo valores");
        System.out.println("Removendo 21: " + hashTable.remove(21));

        System.out.println("Removendo o mesmo valor:");
        System.out.println("Removendo 21: " + hashTable.remove(21));

        System.out.println("=".repeat(100));

        System.out.println("Exibindo após remoção");
        hashTable.exibe();
    }

}
