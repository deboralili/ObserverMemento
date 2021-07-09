import java.util.Observable;
import java.util.Observer;

public class Usuario implements Observer {
    String id;
    String nome;
    private String ultimaNotificacao;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void aceitarNotificacao(Acervo acervo) {
        acervo.addObserver(this);
    }

    public void update(Observable acervo, Object arg1) {
        this.ultimaNotificacao = this.nome + ", um novo filme foi adicionado ao nosso acervo! Venha conferir!";
    }
}
