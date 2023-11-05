package com.example.exerciciofilaprioridade;

import java.util.Arrays;

public class FilaPrioridade {

    private Paciente[] lista;
    private int tamanho;
    private int capacidade;

    private HeapSort heapSort;

    public FilaPrioridade(int capacidade) {
        this.lista = new Paciente[capacidade];
        this.tamanho = 0;
        this.capacidade = capacidade;
        this.heapSort = new HeapSort();
    }

    public boolean isFull() {
        return tamanho == capacidade;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void inserir(Paciente paciente) {
        if (isFull()) {
            System.out.println("Não há espaço na fila");
        }
        else {
            lista[tamanho] = paciente;
            tamanho ++;
            ordernar();
        }
    }

    public Paciente remove() {
        int maiorPrioridade = -999999;
        Paciente pacienteMaiorPrioridade = null;

        if (isEmpty()) {
            System.out.println("");
            System.out.println("Lista vazia, não é possível remover");
        } else {
            int indiceMaiorPrioridade = 0;
            for (int i = 1; i < tamanho; i++) {
                if (lista[i] != null && lista[i].getPrioridade() > maiorPrioridade) {
                    maiorPrioridade = lista[i].getPrioridade();
                    indiceMaiorPrioridade = i;
                }
            }

            pacienteMaiorPrioridade = lista[indiceMaiorPrioridade];

            for (int i = indiceMaiorPrioridade; i < tamanho - 1; i++) {
                lista[i] = lista[i + 1];
            }
            lista[tamanho - 1] = null;
            tamanho--;
            ordernar();
            return pacienteMaiorPrioridade;
        }
        return null;
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (lista[i] != null) {
                    System.out.println(lista[i]);
                }

            }
        }
    }

    public void inserirAuto() {
        lista[0] = new Paciente("matheus", 20, true, "dor de cabeça", 1);
        lista[1] = new Paciente("maria", 36, true, "dor de dente", 2);
        lista[2] = new Paciente("felipe", 24, false, "pneumonia", 4);
        lista[3] = new Paciente("julia", 12, true, "dedo quebrado", 3);

        tamanho = 4;
    }

    public void ordernar() {
        Paciente[] pacientes = Arrays.copyOf(lista, tamanho);
        heapSort.heapSort(pacientes);
        lista = Arrays.copyOf(pacientes, capacidade);
    }

}
