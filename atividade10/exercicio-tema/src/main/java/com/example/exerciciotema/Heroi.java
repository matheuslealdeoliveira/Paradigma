package com.example.exerciciotema;

public class Heroi {

    private int id;
    private String nome;
    private String universo;
    private int numeroFilmes;
    private double forca;

    public Heroi(int id, String nome, String universo, int numeroFilmes, double forca) {
        this.id = id;
        this.nome = nome;
        this.universo = universo;
        this.numeroFilmes = numeroFilmes;
        this.forca = forca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getNumeroFilmes() {
        return numeroFilmes;
    }

    public void setNumeroFilmes(int numeroFilmes) {
        this.numeroFilmes = numeroFilmes;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", universo='" + universo + '\'' +
                ", numeroFilmes=" + numeroFilmes +
                ", forca=" + forca +
                '}';
    }
}
