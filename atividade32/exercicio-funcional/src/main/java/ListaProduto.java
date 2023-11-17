import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListaProduto {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Smartphone", "Eletrônicos",
                699.99, 50));
        produtos.add(new Produto(2, "Notebook", "Informática",
                1299.99, 20));
        produtos.add(new Produto(3, "Televisão 4K", "Eletrônicos",
                899.99, 15));
        produtos.add(new Produto(4, "Fone de Ouvido Bluetooth", "Acessórios",
                79.99, 100));
        produtos.add(new Produto(5, "Cadeira de Escritório", "Móveis",
                199.99, 30));
        produtos.add(new Produto(6, "Máquina de Café", "Eletrodomésticos",
                49.99, 75));
        produtos.add(new Produto(7, "Tênis Esportivo", "Calçados",
                89.99, 40));
        produtos.add(new Produto(8, "Livro Best-seller", "Livros",
                29.99, 60));

        System.out.println("Exiba os produtos da lista");
        produtos.stream()
                .forEach(valor -> System.out.print(valor.getPreco() + "   "));
        System.out.println("\n");

        System.out.println("Exiba o nome dos produtos da lista em caixa alta");
        produtos.stream()
                .forEach(valor -> System.out.print(valor.getNome() + "   "));
        System.out.println("\n");

        System.out.println("Exiba os produtos da lista em ordem alfabetica em caps");
        produtos.stream()
                .map(produto -> produto.getNome())
                .sorted()
                .forEach(nome -> System.out.print(nome.toUpperCase() + "   "));
        System.out.println("\n");

        System.out.println("Predicate para filtar valores dos produtos");
        Predicate<Produto> preco30a100 =
                produto -> (produto.getPreco() >= 30 && produto.getPreco() <= 100);
        produtos.stream()
                .filter(preco30a100)
                .sorted(Comparator.comparing(Produto::getPreco))
                .forEach(produto -> System.out.print(preco30a100));
        System.out.println();

        System.out.println("Apenas o primeiro poduto que atenda ao filtro");
        System.out.print(produtos.stream()
                .filter(preco30a100)
                .findFirst()
                .get());
        System.out.println();

        System.out.println("Exibe categorias distintas em ordenadas");
        produtos.stream()
                .map(produto -> produto.getCategoria())
                .distinct()
                .sorted()
                .forEach(produto -> System.out.println(produto));
        System.out.println();

        System.out.println("Soma dos preços dos produtos usando o .sum");
        System.out.println(
                produtos.stream()
                        .mapToDouble(Produto::getPreco)
                        .sum());
        System.out.println();

        System.out.println("Soma dos preços dos produtos usando o .reduce");
        System.out.printf("%.2f",
                produtos.stream()
                        .mapToDouble(Produto::getPreco)
                        .reduce(0, (subtotal, y) -> subtotal + y));
        System.out.println("\n");

        System.out.println("Média dos preços do produto");
        System.out.printf("%.2f",
        produtos.stream()
                .mapToDouble(Produto::getPreco)
                .average()
                .getAsDouble());
        System.out.println("\n");

        System.out.println("Soma da qtd de estoque usando o .sum");
        System.out.println(
                produtos.stream()
                        .mapToDouble(Produto::getQtdEstoque)
                        .sum());
        System.out.println();

        System.out.println("Produtos agrupados por categoria");
        System.out.println(produtos.stream()
                .collect(
                        Collectors.groupingBy(Produto::getCategoria)
                ));
        System.out.println();

        System.out.println("Quantidade de produtos agrupados por categoria");
        System.out.println(produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.counting()
                )));
        System.out.println();

        System.out.println("Exiba a soma dos preços dos produtos agrupados por categoria");
        System.out.println(produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)
                )));
        System.out.println();

        System.out.println("Exiba a média dos preços dos produtos agrupados por categoria");
        System.out.println(produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.averagingDouble(Produto::getPreco)
                )));
    }

}
