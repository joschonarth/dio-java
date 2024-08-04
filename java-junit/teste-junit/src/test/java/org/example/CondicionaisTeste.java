package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "joschonarth")
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_20)
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_20)
    void validarUsuario() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
