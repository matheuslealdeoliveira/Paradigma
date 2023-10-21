package org.example;

public class TesteArquivoTxt {

    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.restauraDeque("deque.txt");

        System.out.println("\nAtendimento:");
        System.out.println(deque.removeInicio());

        System.out.println("\nDesistencia:");
        System.out.println(deque.removeFim());

        System.out.println("\nDeque ao contrario:");
//        deque.exibeFimParaInicio();

        // Teste aqui o método que grava arquivo csv
//        deque.gravaCsv("deque.csv");

        // Teste aqui o método que le e exibe o arquivo csv
        deque.leExibeArquivoCsv("deque.csv");

    }

}
