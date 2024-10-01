package org.example;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
//        Assertions.assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Joao", LocalDate.now());

        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDiferentesTipos() {

        float valor = 5.0F;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);

    }
}
