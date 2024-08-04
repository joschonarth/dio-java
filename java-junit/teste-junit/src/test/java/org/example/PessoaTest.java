package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class PessoaTest {
    @Test
    void validarIdade() {
        Pessoa pessoa = new Pessoa("João", LocalDate.of(2004, 1, 1));
        Assertions.assertEquals(20, pessoa.getIdade());
    }

    @Test
    void maioridade() {
        Pessoa joao = new Pessoa("João", LocalDate.of(2004, 1, 1));
        Assertions.assertTrue(joao.maiorDeIdade());

        Pessoa maria = new Pessoa("Maria", LocalDate.of(2020, 1, 1));
        Assertions.assertFalse(maria.maiorDeIdade());

    }

}