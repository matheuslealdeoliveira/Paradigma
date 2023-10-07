package com.example.legravaarquivotxt;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LerCsv {

    public void leExibeArquivoCsv() {
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        String nomeArq = "times.csv";

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
            System.out.printf("%2s %-20s %7s %4s %7s %-7s %-20s\n",
                    "ID", "NOME", "MUNDIAS", "ANO", "SALÁRIO", "CAMPEÃO", "APELIDO");
            while (entrada.hasNext()) {
                Integer id = entrada.nextInt();
                String nome = entrada.next();
                Integer mundias = entrada.nextInt();
                Integer ano = entrada.nextInt();
                Double salarios = entrada.nextDouble();
                boolean campeao = entrada.nextBoolean();
                String apelido = entrada.next();
                System.out.printf(
                        "%02d %-20s %7d %4d %7.1f %-7s %-20s\n",
                        id, nome, mundias, ano, salarios, campeao, apelido);
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

}
