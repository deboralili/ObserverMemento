public class FilmeEstadoNaoAssistido implements FilmeEstado{

    private FilmeEstadoNaoAssistido() {};
    private static FilmeEstadoNaoAssistido instance = new FilmeEstadoNaoAssistido();
    public static FilmeEstadoNaoAssistido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Filme Não Assistido!";
    }

    @Override
    public String marcarAssistido(Filme filme) {
        filme.setEstado(FilmeEstadoAssistido.getInstance());
        return "Filme Assistido!";
    }

    @Override
    public String marcarNaoAssistido(Filme filme) {
        return "Filme Não Assistido.";
    }

    @Override
    public String marcarAssistindo(Filme filme) {
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        return "Assistindo ao Filme.";
    }

    @Override
    public String marcarInterrompido(Filme filme) {
        return "Operação não realizada. Comece a assistir a um filme.";
    }
}
