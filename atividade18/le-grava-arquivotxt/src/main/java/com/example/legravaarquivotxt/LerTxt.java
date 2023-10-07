package com.example.legravaarquivotxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerTxt {

    public void leArquivoTxt(String nomeArq) {
        BufferedReader entrada = null;
        String registro, tipoRegistro;

        int id, mundiais, anoFundacao;
        String nome, apelido;
        Double salarios;
        boolean campeaoEsseAno;

        int contaRegDadosLidos = 0;
        int contaRegDadosGravados = 0;

        List<Time> listaLida = new ArrayList<>();

        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        }
        catch (IOException erro) {
            System.out.println("Erro na abertura do arquivo");
            erro.printStackTrace();
        }

        try {
            registro = entrada.readLine();

            while (registro != null) {
                tipoRegistro = registro.substring(0,2);

                if (tipoRegistro.equals("00")) {
                    System.out.println("É um registro de header");
                    System.out.println("Tipo do arquivo:" + registro.substring(2,6));
                    System.out.println("Data e hora de gravacao:" + registro.substring(6,25));
                    System.out.println("Versao do documento:" + registro.substring(25,27));
                }
                else if (tipoRegistro.equals("01")) {
                    System.out.println("É um registro de trailer");
                    contaRegDadosGravados = Integer.parseInt(registro.substring(2,7));
                    if (contaRegDadosGravados == contaRegDadosLidos) {
                        System.out.println("Quantidade de registro de dados lidos é compatível com " +
                                "a quantidade de registros de dados gravados");
                    } else {
                        System.out.println("Quantidade de registro de dados lidos é incompatível com " +
                                "a quantidade de registros de dados gravados");
                    }
                }
                else if (tipoRegistro.equals("02")) {
                    System.out.println("É um registro de dados");

                    id = Integer.parseInt(registro.substring(2, 5));
                    nome = registro.substring(5, 25).trim();
                    mundiais = Integer.parseInt(registro.substring(25, 26));
                    anoFundacao = Integer.parseInt(registro.substring(26, 30));
                    salarios = Double.valueOf(registro.substring(30, 35).replace(',', '.'));
                    campeaoEsseAno = Boolean.parseBoolean(registro.substring(35, 40).trim());
                    apelido = registro.substring(40, 60).trim();

                    contaRegDadosLidos++;

                    Time a = new Time(id, nome, mundiais, anoFundacao, salarios, campeaoEsseAno, apelido);
                    listaLida.add(a);
                }
                else {
                    System.out.println("Tipo de registro inválido");
                }

                registro = entrada.readLine();
            }
            entrada.close();
        }
        catch (IOException erro) {
            System.out.println("Erro na leitura do arquivo");
            erro.printStackTrace();
        }

        System.out.println("\nDados lidos do arquivo");
        for (Time t: listaLida) {
            System.out.println(t);
        }

        System.out.println();

    }

}
