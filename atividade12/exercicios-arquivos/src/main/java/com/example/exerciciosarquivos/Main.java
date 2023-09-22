package com.example.exerciciosarquivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Time> times = new ArrayList<>();
        boolean loop = true;
        Gravar gravar = new Gravar();
        Ler ler = new Ler();

        while (loop) {
            Scanner leitor = new Scanner(System.in);
            Integer escolha = 0;

            while (escolha == 0) {
                System.out.println("Escolha uma opção:\n" +
                        "1- Adicionar time\n" +
                        "2- Exibir times cadastrados\n" +
                        "3- Gravar arquivo CSV\n" +
                        "4- Ler CSV\n" +
                        "5- Fechar programa");
                escolha = leitor.nextInt();
                if (escolha < 1 | escolha > 5) {
                    System.out.println("Escolha uma opção válida");
                }
            }
            if (escolha == 1) {
                System.out.println("Escolha um id:");
                Integer id = leitor.nextInt();

                leitor.nextLine();
                System.out.println("Nome do time:");
                String nome = leitor.nextLine();

                System.out.println("Quantos mundiais:");
                Integer mundias = leitor.nextInt();

                System.out.println("Ano de fundação:");
                Integer ano = leitor.nextInt();

                System.out.println("Folha salarial:");
                Double salarios = leitor.nextDouble();

                System.out.println("Foi campeão esse ano? true or false");
                Boolean campeao = leitor.nextBoolean();

                leitor.nextLine();
                System.out.println("Qual o apelido?");
                String apelido = leitor.nextLine();

                Time time = new Time(id, nome, mundias, ano, salarios, campeao, apelido);
                times.add(time);

                System.out.println();
                System.out.println("Time " + time.getNome() + " cadastrado");
                System.out.println();
            }
            if (escolha == 2) {
                System.out.println();
                System.out.println("Exibindo times cadastrados");
                System.out.println();
                times.forEach(System.out::println);
                System.out.println();

            }
            if (escolha == 3) {
                System.out.println();
                System.out.println("Gravando times no arquivo csv...");
                System.out.println();
                gravar.gravaArquivosCsv(times);
                System.out.println("Arquivo criado com sucesso");
                System.out.println();
            }

            if (escolha == 4) {
                System.out.println();
                System.out.println("Exibindo times do arquivo csv...");
                System.out.println();
                ler.leExibeArquivoCsv();
                System.out.println("Arquivo exibido com sucesso");
                System.out.println();
            }

            if (escolha == 5) {
                System.out.println("Saindo do programa");
                loop = false;
            }

        }

    }

}
