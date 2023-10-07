package com.example.legravaarquivotxt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GravarTxt {

    public void gravaRegistro(String nomeArq, String registro) {
        BufferedWriter saida = null;

        // Abre o arquivo
        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo!");
            erro.printStackTrace();
        }

        // Grava o registro e finaliza

        try {
            saida.append(registro + "\n");
            saida.close();
        }
        catch (IOException erro) {
            System.out.println("Erro ao gravar ou fechar o arquivo!");
            erro.printStackTrace();
        }

    }

    public void gravaArquivoTxt(List<Time> lista, String nomeArq) {
        int contaRegistroDado = 0;

        if (lista.size() == 0) {
            System.out.println("Lista vazia. Não há nada a gravar!");
            return;
        }

        // Monta o registro de header
        String header = "00TIME";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += "01";

        // Grava header
        gravaRegistro(nomeArq, header);

        // Monta e grava o corpo (registros de dados)
        for (Time t : lista) {
            String corpo = "02";
            corpo += String.format("%03d", t.getId()); // Corrigido para garantir 3 dígitos
            corpo += String.format("%-20.20s", t.getNome());
            corpo += String.format("%01d", t.getMundias()); // Corrigido para "mundiais"
            corpo += String.format("%04d", t.getAnoFundacao());
            corpo += String.format("%05.2f", t.getSalarios()); // Corrigido para 5 casas decimais
            corpo += String.format("%-5.5s", t.isCampeaoEsseAno()); // Corrigido para formatar como string
            corpo += String.format("%-20.20s", t.getApelido());

            gravaRegistro(nomeArq, corpo);
            contaRegistroDado++;
        }

        String trailer = "01";
        trailer += String.format("%05d", contaRegistroDado);

        gravaRegistro(nomeArq, trailer);

        System.out.println("Gravação efetuada com sucesso!");
        System.out.println();

    }

}
