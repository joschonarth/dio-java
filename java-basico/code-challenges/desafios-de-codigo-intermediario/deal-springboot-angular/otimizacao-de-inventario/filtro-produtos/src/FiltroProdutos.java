import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FiltroProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nome = scanner.nextLine();
            String categoria = scanner.nextLine();
            double preco = scanner.nextDouble();
            scanner.nextLine();
            produtos.add(new Produto(nome, categoria, preco));
        }

        double precoMin = scanner.nextDouble();
        double precoMax = scanner.nextDouble();

        List<Produto> produtosFiltrados = produtos.stream()
            .filter(p -> p.preco >= precoMin && p.preco <= precoMax)
            .collect(Collectors.toList());


        for (Produto p : produtosFiltrados) {
            System.out.printf("Nome: %s - Preco: %.2f\n", p.nome, p.preco);
        }

        scanner.close();
    }
}

class Produto {
    String nome;
    String categoria;
    double preco;

    Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
}