package com.example.hashtable;

public class HashTable {

    private ListaLigada hashTable[];
    private int tamanho;

    public HashTable(int tamanho) {
        this.tamanho = tamanho;
        hashTable = new ListaLigada[tamanho];

        for (int i = 0; i < tamanho; i++) {
            hashTable[i] = new ListaLigada();
        }
    }

    public int funcaoHash(int x) {
        return x % tamanho;
    }

    public void insere(int x) {
        int posicao = funcaoHash(x);
        hashTable[posicao].insereNode(x);
    }

    public boolean busca(int x) {
        int posicao = funcaoHash(x);
        return hashTable[posicao].buscaNode(x) != null;
    }

    public boolean remove(int x) {
        if (busca(x)) {
            int posicao = funcaoHash(x);
            return hashTable[posicao].removeNode(x);
        }
        return false;
    }

    public void exibe() {
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println("Entrada " + i);
            if (hashTable[i].getTamanho() == 0) {
                System.out.println("Lista vazia");
            } else {
                hashTable[i].exibe();
            }
        }
    }

}
