package com.example.legravaarquivotxt;

public class Time {

    private Integer id;
    private String nome;
    private Integer mundias;
    private Integer anoFundacao;
    private Double salarios;
    private boolean campeaoEsseAno;
    private String apelido;

    public Time(Integer id, String nome, Integer mundias, Integer anoFundacao, Double salarios, boolean campeaoEsseAno, String apelido) {
        this.id = id;
        this.nome = nome;
        this.mundias = mundias;
        this.anoFundacao = anoFundacao;
        this.salarios = salarios;
        this.campeaoEsseAno = campeaoEsseAno;
        this.apelido = apelido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMundias() {
        return mundias;
    }

    public void setMundias(Integer mundias) {
        this.mundias = mundias;
    }

    public Integer getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(Integer anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Double getSalarios() {
        return salarios;
    }

    public void setSalarios(Double salarios) {
        this.salarios = salarios;
    }

    public boolean isCampeaoEsseAno() {
        return campeaoEsseAno;
    }

    public void setCampeaoEsseAno(boolean campeaoEsseAno) {
        this.campeaoEsseAno = campeaoEsseAno;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", mundias=" + mundias +
                ", anoFundacao=" + anoFundacao +
                ", salarios=" + salarios +
                ", campeaoEsseAno=" + campeaoEsseAno +
                ", apelido='" + apelido + '\'' +
                '}';
    }
}
