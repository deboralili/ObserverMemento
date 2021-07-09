import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {
    @Test
    void deveArmazenarEstados() {
        Filme filme = new Filme();
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        filme.setEstado(FilmeEstadoAssistido.getInstance());
        assertEquals(2, filme.getEstados().size());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Filme filme = new Filme();
        filme.setEstado(FilmeEstadoNaoAssistido.getInstance());
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        filme.setEstado(FilmeEstadoInterrompido.getInstance());
        filme.restauraEstado(1);
        assertEquals(FilmeEstadoAssistindo.getInstance(), filme.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Filme filme = new Filme();
            filme.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}