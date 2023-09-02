package com.example.exerciciotema;

public class Repositorio {

    private ListaLigada<Heroi> listaLigada;
    private PilhaLigada<Heroi> pilhaLigada;
    private FilaLigada<Heroi> filaLigada;

    public Repositorio() {
        this.listaLigada = new ListaLigada<>();
        this.pilhaLigada = new PilhaLigada<>();
        this.filaLigada = new FilaLigada<>();
    }

    public void salvar(Heroi obj) {
        listaLigada.insereNode(obj);
    }

    public void deletarPorId(int id) {
        Heroi heroi = listaLigada.buscaPorId(id);
        if (heroi == null) {
            System.out.println("Id inválido");
        } else {
            listaLigada.removeNode(heroi);
            pilhaLigada.push(heroi);
            System.out.println("Heroi com id " + id + " removido");
        }
    }

    public void exibe() {
        listaLigada.exibe();
    }

    public void exibePilha() {
        pilhaLigada.exibe();
    }

    public void desfazer() {
        Heroi heroi = pilhaLigada.pop();
        listaLigada.insereNode(heroi);
    }

    public void agendar(Heroi heroi) {
        filaLigada.insert(heroi);
        System.out.println("Heroi " + heroi + "agendado para salvar");
    }

    public void exibeFila() {
        filaLigada.exibe();
    }

    public void executarAgendado() {
        Heroi heroi = filaLigada.poll();
        listaLigada.insereNode(heroi);
    }
}
