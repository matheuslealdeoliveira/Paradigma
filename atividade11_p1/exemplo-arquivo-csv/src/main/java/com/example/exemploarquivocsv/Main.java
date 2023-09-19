package com.example.exemploarquivocsv;

import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void gravaArquivosCsv(List<Cachorro> lista, String nomeArq) {
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

        // Bloco try-catch para abrir o arquivo
        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        // Bloco try-catch para gravar o arquivo
        try {
            for (Cachorro dog: lista) {
                saida.format("%d;%s;%s;%.2f\n", dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso());
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar no arquivo");
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivoCsv(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

        // Bloco try-catch para abrir o arquivo
        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");

        }
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        }

        // Bloco try-catch para ler o arquivo
        try {
            System.out.printf("%4s %-15s %-9s %4s\n", "ID", "NOME", "PORTE", "PESO");
            while (entrada.hasNext()) {
                Integer id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();
                System.out.printf("%04d %-15s %-9s %4.1f\n", id, nome, porte, peso);
            }
        }
        catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            erro.printStackTrace();
            deuRuim = true;
        }
        catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        List<Cachorro> listaDog = new ArrayList<>();

        listaDog.add(new Cachorro(1, "Spike", "Médio", 13.0));
        listaDog.add(new Cachorro(2, "Bilu", "Grande", 15.0));
        listaDog.add(new Cachorro(3, "Totó", "Pequeno", 3.0));
        listaDog.add(new Cachorro(4, "Dumblesdore", "Grande", 22.0));
        listaDog.add(new Cachorro(5, "Peludinho", "Médio", 9.0));
        listaDog.add(new Cachorro(6, "Bolt", "Médio", 11.0));

        System.out.println("Lista de cachorros");
        listaDog.forEach(System.out::println);

//        gravaArquivosCsv(listaDog, "dogs");
        leExibeArquivoCsv("dogs");

    }

}
