package dio;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dio.entity.Produto;
import dio.exception.ProductPriceException;
import dio.service.ProdutoService;

@SpringBootTest
public class ProdutoTest {

    @Autowired
    private ProdutoService produtoService;

    @Test
    public void vericicaValorNegativoNoProduto() {
        Produto produto = new Produto();

        produto.setNome("Teste");
        produto.setPreco(-10.0);

        assertThrows(ProductPriceException.class, () -> produtoService.save(produto));

    }

}