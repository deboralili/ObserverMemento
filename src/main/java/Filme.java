import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private FilmeEstado estado;
    private List<FilmeEstado> memento = new ArrayList<FilmeEstado>();

    public Filme() {
        this.estado = FilmeEstadoNaoAssistido.getInstance();
    }

    public Filme(String nome) {
        this.nome = nome;
    }

    public void setEstado(FilmeEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public String marcarAssistido() {
        return estado.marcarAssistido(this);
    }

    public String marcarNaoAssistido() {
        return estado.marcarNaoAssistido(this);
    }

    public String marcarAssistindo() {
        return estado.marcarAssistindo(this);
    }

    public String marcarInterrompido() {
        return estado.marcarInterrompido(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FilmeEstado getEstado() {
        return estado;
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<FilmeEstado> getEstados() {
        return this.memento;
    }
}
