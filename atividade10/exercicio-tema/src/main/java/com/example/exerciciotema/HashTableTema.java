package com.example.exerciciotema;

public class HashTableTema {

    private ListaLigada hashTable[];
    private int tamanho;

    public HashTableTema(int tamanho) {
        this.tamanho = tamanho;
        hashTable = new ListaLigada[tamanho];

        for (int i = 0; i < tamanho; i++) {
            hashTable[i] = new ListaLigada();
        }
    }

    public int funcaoHash(Heroi heroi) {
        int x = heroi.getId();
        return x % tamanho;
    }

    public void insere(Heroi heroi) {
        int posicao = funcaoHash(heroi);
        hashTable[posicao].insereNode(heroi);
    }

    public boolean busca(Heroi heroi) {
        int posicao = funcaoHash(heroi);
        return hashTable[posicao].buscaNode(heroi) != null;
    }

    public boolean remove(Heroi heroi) {
        if (busca(heroi)) {
            int posicao = funcaoHash(heroi);
            return hashTable[posicao].removeNode(heroi);
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
