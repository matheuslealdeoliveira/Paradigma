import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int v[] = {-1, 13, 22, -5, 18, 4, 7};

        System.out.println("Dados do vetor:");
        IntStream.of(v).forEach(value -> {
            System.out.print(value + "   ");
        });
        System.out.println();

        System.out.println("\nMédia dos valores do vetor:");
        double media = IntStream.of(v)
                .average()
                .getAsDouble();
        System.out.printf("%.2f", media);
        System.out.println();

        System.out.println("\nSoma dos valores do vetor:");
        int soma = IntStream.of(v)
                .reduce(0, (subtotal, y) -> subtotal + y);
        System.out.println(soma);

        System.out.println("\nSoma da metade dos valores do vetor:");
        int somaMetade = IntStream.of(v)
                .reduce(0, (subtotal, y) -> subtotal + y);
        System.out.println(somaMetade / 2);

//        erro / testar novamente
        System.out.println("\nMultiplicação dos quadrados dos valores do vetor:");
        BigInteger multiplicacaoQuadrados =
                BigInteger.valueOf(IntStream.of(v)
                    .reduce(1, (subtotal, y) -> subtotal * (y * y)));

        System.out.println(multiplicacaoQuadrados);

        System.out.println("\nValores do vetor que são mutiplos de 3:");
        IntStream.of(v)
                .filter(subtotal -> subtotal % 3 == 0)
                .sorted()
                .forEach(value -> System.out.printf(value + "   "));

        System.out.println("\nValores negativos multiplicados por 5:");
        IntStream.of(v)
                .filter(subtotal -> subtotal < 0)
                .sorted()
                .forEach(value -> System.out.printf(value * 5 + "   "));

    }

}
