package com.example.exerciciofilaprioridade;

public class Paciente {

    private String nome;
    private int idade;
    private boolean hasConvenio;
    private String sintoma;
    private int prioridade;

    public Paciente(String nome, int idade, boolean hasConvenio, String sintoma, int prioridade) {
        this.nome = nome;
        this.idade = idade;
        this.hasConvenio = hasConvenio;
        this.sintoma = sintoma;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isHasConvenio() {
        return hasConvenio;
    }

    public void setHasConvenio(boolean hasConvenio) {
        this.hasConvenio = hasConvenio;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", hasConvenio=" + hasConvenio +
                ", sintoma='" + sintoma + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }
}
