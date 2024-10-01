package org.example;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.MethodRandom.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemTeste {

    @DisplayName("Teste que valida o Fluxo A")
    @Order(4)
    @Test
    void validarFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("Teste que valida o Fluxo B")
    @Order(3)
    @Test
    void validarFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("Teste que valida o Fluxo C")
    @Order(2)
    @Test
    void validarFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("Teste que valida o Fluxo D")
    @Order(1)
    @Test
    void validarFluxoD() {
        Assertions.assertTrue(true);
    }


}
