package com.example.exerciciotema;

public class Main {

    public static void main(String[] args) {

        Heroi homemDeFerro = new Heroi(1, "Homem de Ferro",
                "Marvel", 3, 9.0);
        Heroi viuvaNegra = new Heroi(2, "Viúva Negra", "Marvel",
                1, 8.5);
        Heroi batman = new Heroi(3, "Batman", "DC",
                3, 8.3);
        Heroi homemAranha = new Heroi(4, "Homem Aranha", "Marvel",
                4, 9.1);
    Heroi panteraNegra = new Heroi(5, "Pantera Negra", "Marvel",
            2, 9.2);

        Repositorio repositorio = new Repositorio();

        System.out.println("Salvando herois");
        repositorio.salvar(homemDeFerro);
        repositorio.salvar(viuvaNegra);
        repositorio.salvar(batman);
        repositorio.salvar(homemAranha);
        repositorio.salvar(panteraNegra);

        System.out.println();
        System.out.println("Exibindo herois");
        System.out.println();
        repositorio.exibe();

        System.out.println();
        System.out.println("Tentando remover");
        System.out.println();
        System.out.println("id 10");
        repositorio.deletarPorId(10);
        System.out.println("id 1");
        repositorio.deletarPorId(1);
        System.out.println("id 5");
        repositorio.deletarPorId(5);

        System.out.println();
        System.out.println("Herois removidos foram adicionados na pilha");

        System.out.println();
        System.out.println("Exibindo herois depois de remover");
        System.out.println();
        repositorio.exibe();

        System.out.println();
        System.out.println("Desfazendo operação");
        repositorio.desfazer();

        System.out.println();
        System.out.println("Exibindo herois depois de desfazer");
        System.out.println();
        repositorio.exibe();

        System.out.println();
        System.out.println("Desfazendo mais uma operação e exibindo");
        System.out.println();
        repositorio.desfazer();
        repositorio.exibe();

        System.out.println();
        System.out.println("Agendando heroi para salvar");
        System.out.println();
        Heroi capitaoAmerica = new Heroi(6, "Capitão América", "Marvel",
                3, 8.9);
        repositorio.agendar(capitaoAmerica);

        System.out.println();
        System.out.println("Capitão América foi agendado, mas ainda não foi salvo");
        System.out.println();
        System.out.println("Agendados");
        repositorio.exibeFila();
        System.out.println("Herois");
        repositorio.exibe();

        System.out.println();
        System.out.println("Executando agendados");
        repositorio.executarAgendado();

        System.out.println();
        System.out.println("Exibindo herois depois de exutar agendado");
        repositorio.exibe();

        System.out.println("=".repeat(100));

        HashTableTema hashTable = new HashTableTema(5);

        System.out.println();
        System.out.println("Inserindo herois na tabela hash");
        hashTable.insere(homemDeFerro);
        hashTable.insere(viuvaNegra);
        hashTable.insere(batman);
        hashTable.insere(homemAranha);
        hashTable.insere(panteraNegra);
        hashTable.insere(capitaoAmerica);

        System.out.println();
        System.out.println("Hash após inserção:");
        hashTable.exibe();

        System.out.println();
        System.out.println("Buscando herois");
        System.out.println("Busca Homem de Ferro: " + hashTable.busca(homemAranha));
        Heroi flash = new Heroi(7, "Flash", "DC",
                1, 8.2);
        System.out.println("Busca Flash: " + hashTable.busca(flash));

        System.out.println();
        System.out.println("Removendo herois");
        System.out.println("Removendo Batman: " + hashTable.remove(batman));

        System.out.println();
        System.out.println("Removendo o mesmo heroi:");
        System.out.println("Removendo Batman: " + hashTable.remove(batman));

        System.out.println();
        System.out.println("Exibindo após remoção");
        hashTable.exibe();

    }

}
