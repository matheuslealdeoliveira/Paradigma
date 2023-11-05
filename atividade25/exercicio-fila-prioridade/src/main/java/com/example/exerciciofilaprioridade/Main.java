package com.example.exerciciofilaprioridade;

import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        FilaPrioridade filaPrioridade = new FilaPrioridade(5);

        boolean loop = true;

        while (loop) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Menu:\n" +
                    "1- Inserir\n" +
                    "2- Remover\n" +
                    "3- Exibir \n" +
                    "4- Fim\n" +
                    "5- Inserir Auto");
            int opcao = leitor.nextInt();

            if (opcao == 1) {
                Paciente paciente = digitaPaciente();
                filaPrioridade.inserir(paciente);
                System.out.println("Paciente " + paciente + " inserido");
                System.out.println("=".repeat(100));
            }

            if (opcao == 2) {
                filaPrioridade.remove();
                System.out.println("=".repeat(100));
            }

            if (opcao == 3) {
                System.out.println("Exibindo...");
                filaPrioridade.exibe();
                System.out.println("=".repeat(100));
            }

            if (opcao == 4) {
                System.out.println("Saindo...");
                System.out.println("=".repeat(100));
                loop = false;
            }

            if (opcao == 5) {
                System.out.println("Inserindo automatico...");
                filaPrioridade.inserirAuto();
                System.out.println("=".repeat(100));
            }

            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {
                System.out.println("Opção inválida");
            }

        }

    }

    public static Paciente digitaPaciente() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Preencha as informações do paciente:");

        System.out.println("Nome do paciente:");
        String nome = leitor.nextLine();

        System.out.println("Idade do paciente:");
        int idade = leitor.nextInt();

        System.out.println("Tem convenio:");
        boolean convenio = leitor.nextBoolean();
        leitor.nextLine();

        System.out.println("Sintoma do paciente:");
        String sintomas = leitor.nextLine();

        System.out.println("Prioridade de atendimento:");
        int prioridade = leitor.nextInt();

        return new Paciente(nome, idade, convenio, sintomas, prioridade);

    }

}
