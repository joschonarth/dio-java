import java.util.*;

public class RemoverDuplicados {
    public static List<String> removerDuplicados(List<String> produtos) {
        Set<String> vistos = new HashSet<>();
        
        List<String> resultado = new ArrayList<>();
        
        for (String produto : produtos) {
            
            String produtoLower = produto.toLowerCase();
         
            if (!vistos.contains(produtoLower)) {
                
                resultado.add(produto);
                vistos.add(produtoLower);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  
        
        List<String> produtos = new ArrayList<>();
        

        for (int i = 0; i < n; i++) {
            String produto = scanner.nextLine();
            produtos.add(produto);
        }
        
        List<String> produtosUnicos = removerDuplicados(produtos);

        System.out.println("Produtos unicos:");
        for (String produto : produtosUnicos) {
                System.out.println(produto);
            }
       

        scanner.close();
    }
}