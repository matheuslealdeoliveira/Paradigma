package org.example;

import java.io.*;
import java.util.*;
import java.util.zip.InflaterInputStream;

public class Deque {

    // Atributos
    private Node inicio;
    private Node fim;
    private List<Paciente> lista = new ArrayList<>();

    // Construtor
    public Deque() {
        inicio = new Node(null);
        fim = new Node(null);
        inicio.setNext(fim);
        fim.setPrev(inicio);
    }

    // Métodos
    public Boolean isEmpty() {
        return inicio.getNext() == fim && fim.getPrev() == inicio;
    }

    public void insereInicio(Paciente p) {
        Node novo = new Node(p);
        novo.setNext(inicio.getNext());
        novo.setPrev(novo);
        inicio.getNext().setPrev(novo);
        inicio.setNext(novo);
    }

    public void insereFim(Paciente p) {
        Node novo = new Node(p);
        novo.setNext(fim.getPrev());
        novo.setNext(novo);
        fim.getPrev().setNext(novo);
        fim.setPrev(novo);
    }

    public Paciente removeInicio() {
        if (isEmpty()) {
            return null;
        } else {
            Node removido = inicio.getNext();
            Paciente p = removido.getInfo();
            removido.getNext().setPrev(inicio);
            inicio.setNext(removido.getNext());
            return p;
        }
    }

    public Paciente removeFim() {
        if (isEmpty()) {
            return null;
        } else {
            Node removido = fim.getPrev();
            Paciente p = removido.getInfo();
            removido.getNext().setPrev(fim);
            fim.setPrev(removido.getPrev());
            return p;
        }
    }

    public void exibeInicioParaFim() {
        Node atual = inicio.getNext();
        while (atual != fim.getPrev()) {
            System.out.print(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public void exibeFimParaInicio() {
        Node atual = fim.getPrev();
        while (atual != inicio.getNext()) {
            System.out.print(atual.getInfo());
            atual = atual.getPrev();
        }
    }

    public void inserePaciente(Paciente p) {
        if (p.getPrioritario()) {
            insereInicio(p);
        } else {
            insereFim(p);
        }
    }


    public void restauraDeque(String nomeArq) {
        String registro, tipoRegistro;
        BufferedReader entrada = null;
        String nome, prioritario, sintomas;
        Double peso;
        Integer idade, id;
        int contaRegDadosLidos = 0;
        int contaRegDadosGravados = 0;

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

                if (tipoRegistro.equals("02")) {
                    id = Integer.parseInt(registro.substring(3,7));
                    prioritario = registro.substring(7,10).trim();
                    nome = registro.substring(10,40).trim();
                    sintomas = registro.substring(40,60).trim();
                    idade = Integer.valueOf(registro.substring(61, 63));
                    peso = Double.valueOf(registro.substring(64,69).replace(',','.'));

                    contaRegDadosLidos ++;

                    Boolean pri = null;
                    if (prioritario.equals("SIM")) {
                        pri = true;
                    } else {
                        pri = false;
                    }

                    Paciente p = new Paciente(id, nome, pri, sintomas, idade, peso);
                    inserePaciente(p);
                    lista.add(p);

                }

                registro = entrada.readLine();
            }
            entrada.close();
        }
        catch (IOException erro) {
            System.out.println("Erro na leitura do arquivo");
            erro.printStackTrace();
        }

    }

    public void gravaCsv(String nomeArq) {
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);
        }
        catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            for (Paciente p: lista) {
//                saida.format("%d;%s;%d;%d;%.1f;%b;%s\n", time.getId(), time.getNome(),
//                        time.getMundias(), time.getAnoFundacao(), time.getSalarios(),
//                        time.isCampeaoEsseAno(), time.getApelido());

                saida.format("%d;%b;%s;%s;%d;%.2f\n", p.getId(), p.getPrioritario(),
                        p.getNome(), p.getSintomas(), p.getIdade(),
                        p.getPeso());
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

    public void leExibeArquivoCsv(String nomeArq) {
            FileReader arq = null;
            Scanner entrada = null;
            Boolean deuRuim = false;

            try {
                arq = new FileReader(nomeArq);
                entrada = new Scanner(arq).useDelimiter(";|\\n");

            }
            catch (FileNotFoundException erro) {
                System.out.println("Arquivo não encontrado");
                System.exit(1);
            }

            try {
                System.out.printf("%-4s %-14s %-11s %-15s %-6s %-5s\n", "ID", "NOME", "PRIORITARIO", "SINTOMAS", "IDADE",
                        "PESO");
                while (entrada.hasNext()) {
                    Integer id = entrada.nextInt();
                    boolean prioritario = entrada.nextBoolean();
                    String nome = entrada.next();
                    String sintomas = entrada.next();
                    Integer idade = entrada.nextInt();
                    Double peso = entrada.nextDouble();

                    System.out.printf(
                            "%-4d %-14s %-11b %-15s %6d %5.2f \n", id, nome, prioritario, sintomas, idade, peso);
//
//                    ("%2s %-20s %4s %4s %10s %-5s %-20s\n", "ID", "NOME", "MUNDIAS", "ANO", "SALÁRIO",
//                            "CAMPEÃO", "APELIDO");
//
//                    "%02d %-20s %01d %04d %10.1f %-5s %-20s\n",
//                            id, nome, mundias, ano, salarios, campeao, apelido);

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
