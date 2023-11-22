package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Cria uma lista de alunos
        List<Aluno> lista = new ArrayList();
        lista.add(new Aluno(20000, "Clara Teixeira", "CCO", 7.0, 400));
        lista.add(new Aluno(20001, "Beatriz Machado", "ADS", 6.0, 200));
        lista.add(new Aluno(20002, "Claudio Silva", "CCO", 7.5, 700));
        lista.add(new Aluno(20003, "Rodolfo Miranda", "CCO", 6.5, 500));
        lista.add(new Aluno(20004, "Horacio Bispo", "ADS", 8.0, 300));
        lista.add(new Aluno(20005, "Fabiola Chagas", "CCO", 8.5, 1000));
        lista.add(new Aluno(20006, "Ana Sousa", "ADS", 9.0, 900));

        // 1- Crie uma arvore binaria de busca, onde o Node armazene objeto Aluno
        //    O criterio da busca na arvore eh a pontuacao do aluno
        ArvBinBusca arvore = new ArvBinBusca();

        // 2- Percorra a lista criada acima, inserindo os alunos da lista na arvore binaria
        lista.stream()
                .forEach(aluno -> arvore.inserir(aluno));

        // 3- Exiba a arvore em pos-ordem
        System.out.println("PÓS ORDEM");
        arvore.percorre("pos ordem");
        System.out.println();
        System.out.println("=".repeat(100));
        System.out.println();

        // 4- Exiba a arvore em em-ordem
        System.out.println("EM ORDEM");
        arvore.percorre("em ordem");
        System.out.println();
        System.out.println("=".repeat(100));
        System.out.println();

        // 5- Exiba a arvore em pre-ordem
        System.out.println("PRE ORDEM");
        arvore.percorre("pre ordem");
        System.out.println();
        System.out.println("=".repeat(100));
        System.out.println();

        // 6- Usando paradigma funcional/declarativo, exiba a lista acima
        System.out.println("Exibe a lista");
        lista.stream()
                .forEach(aluno -> System.out.println(aluno));
        System.out.println("=".repeat(100));
        System.out.println();

        // 7- Usando paradigma funcional/declarativo, exiba a media das medias dos alunos de CCO
        System.out.println("Exibe a média");
        lista.stream()
                .forEach(aluno -> System.out.println(aluno.getMedia()));
        System.out.println("=".repeat(100));
        System.out.println();

        // 8- Usando paradigma funcional/declarativo, exiba a soma das pontuacoes somente dos alunos de ADS
        System.out.println("Exibe a soma das pontuações de ADS");
        System.out.printf("%d " ,lista.stream()
                .filter(aluno -> aluno.getCurso() == "ADS")
                .mapToInt(Aluno::getPontuacao)
                .reduce(0, (subtotal, y) -> subtotal + y));
        System.out.println();
        System.out.println("=".repeat(100));
        System.out.println();

        // 9- Usando paradigma funcional/declarativo, exiba os alunos em ordem alfabetica
        System.out.println("Alunos em ordem alfabética");
        lista.stream()
                .map(aluno -> aluno.getNome())
                .sorted()
                .forEach(aluno -> System.out.println(aluno));
        System.out.println("=".repeat(100));
        System.out.println();

        // 10- Usando reduce, exiba a soma das pontuacoes de todos os alunos
        System.out.println("Exibe a soma das pontuações de todos os alunos");
        System.out.printf("%d " ,lista.stream()
                .mapToInt(Aluno::getPontuacao)
                .reduce(0, (subtotal, y) -> subtotal + y));
        System.out.println();
        System.out.println("=".repeat(100));
        System.out.println();

        // 11- Usando paradigma funcional/declarativo, exiba os alunos agrupados pelo curso
        System.out.println("Alunos agrupados por categoria");
        System.out.println(lista.stream()
                .collect(
                        Collectors.groupingBy(Aluno::getCurso)
                ));
        System.out.println();
        System.out.println("=".repeat(100));
        System.out.println();

    }
}