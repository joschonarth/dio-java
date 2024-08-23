import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorEstoque {
    
    private static final Map<String, Integer> produtosEstoque = new HashMap<>();
    
    static {
        produtosEstoque.put("Switch", 10);
        produtosEstoque.put("Roteador", 0);
        produtosEstoque.put("Teclado", 25);
        produtosEstoque.put("Mouse", 10);
        produtosEstoque.put("Servidor", 5);
    }
    
    public static String consultarProduto(String nomeProduto) {
        if (produtosEstoque.containsKey(nomeProduto)) {
            int quantidade = produtosEstoque.get(nomeProduto);
            if (quantidade > 0) {
                return "Produto disponivel: " + quantidade + " em estoque.";
            } else {
                return "Produto indisponivel: " + quantidade + " em estoque.";
            }
        } else {
            return "Produto nao encontrado.";
        }

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nomeProduto = scanner.nextLine().trim();
        
        String resultado = consultarProduto(nomeProduto);
        System.out.println(resultado);
        
        scanner.close();
    }
}