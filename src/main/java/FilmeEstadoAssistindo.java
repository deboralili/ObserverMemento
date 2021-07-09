public class FilmeEstadoAssistindo implements FilmeEstado {

    private FilmeEstadoAssistindo() {};
    private static FilmeEstadoAssistindo instance = new FilmeEstadoAssistindo();
    public static FilmeEstadoAssistindo getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Assistindo ao Filme!";
    }

    @Override
    public String marcarAssistido(Filme filme) {
        filme.setEstado(FilmeEstadoAssistido.getInstance());
        return "Filme Assistido!";
    }

    @Override
    public String marcarNaoAssistido(Filme filme) {
        filme.setEstado(FilmeEstadoNaoAssistido.getInstance());
        return "Filme Não Assistido.";
    }

    @Override
    public String marcarAssistindo(Filme filme) {
        return "Assistindo ao Filme!";
    }

    @Override
    public String marcarInterrompido(Filme filme) {
        filme.setEstado(FilmeEstadoInterrompido.getInstance());
        return "Filme Interrompido.";
    }
}
