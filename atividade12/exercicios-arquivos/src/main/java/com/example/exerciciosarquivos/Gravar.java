package com.example.exerciciosarquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;

public class Gravar {

    public void gravaArquivosCsv(List<Time> lista) {
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        String nomeArq = "times.csv";

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
            for (Time time: lista) {
                saida.format("%d;%s;%d;%d;%.1f;%b;%s\n", time.getId(), time.getNome(),
                        time.getMundias(), time.getAnoFundacao(), time.getSalarios(),
                        time.isCampeaoEsseAno(), time.getApelido());
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

}
