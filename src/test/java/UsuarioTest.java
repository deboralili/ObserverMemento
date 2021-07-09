import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    @Test
    void deveNotificarUmUsuario() {
        Filme filme1 = new Filme("O Código da Vinci");
        Filme filme2 = new Filme("Anjos e Demônios");
        Acervo acervo = new Acervo(filme1);
        Usuario usuario = new Usuario("Clarisse", "111");
        usuario.aceitarNotificacao(acervo);
        acervo.adicionarFilme(filme2);
        assertEquals("Clarisse, um novo filme foi adicionado ao nosso acervo! Venha conferir!", usuario.getUltimaNotificacao());
    }

    @Test
    void deveNotificarUsuarios() {
        Filme filme1 = new Filme("O Código da Vinci");
        Filme filme2 = new Filme("Anjos e Demônios");
        Acervo acervo = new Acervo(filme1);
        Usuario usuario1 = new Usuario("Clarisse", "111");
        Usuario usuario2 = new Usuario("Roberto", "197");
        usuario1.aceitarNotificacao(acervo);
        usuario2.aceitarNotificacao(acervo);
        acervo.adicionarFilme(filme2);
        assertEquals("Clarisse, um novo filme foi adicionado ao nosso acervo! Venha conferir!", usuario1.getUltimaNotificacao());
        assertEquals("Roberto, um novo filme foi adicionado ao nosso acervo! Venha conferir!", usuario2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarUsuario() {
        Filme filme1 = new Filme("O Código da Vinci");
        Filme filme2 = new Filme("Anjos e Demônios");
        Acervo acervo = new Acervo(filme1);
        Usuario usuario = new Usuario("Clarisse", "111");
        acervo.adicionarFilme(filme2);
        assertEquals(null, usuario.getUltimaNotificacao());
    }
}