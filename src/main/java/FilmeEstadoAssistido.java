public class FilmeEstadoAssistido implements FilmeEstado{

    private FilmeEstadoAssistido() {};
    private static FilmeEstadoAssistido instance = new FilmeEstadoAssistido();
    public static FilmeEstadoAssistido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Filme Assistido!";
    }

    @Override
    public String marcarAssistido(Filme filme) {
        return "Filme Assistido Novamente!";
    }

    @Override
    public String marcarNaoAssistido(Filme filme) {
        filme.setEstado(FilmeEstadoNaoAssistido.getInstance());
        return "Filme Não Assistido.";
    }

    @Override
    public String marcarAssistindo(Filme filme) {
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        return "Assistindo Novamente ao Filme.";
    }

    @Override
    public String marcarInterrompido(Filme filme) {
        return "Operação não realizada. Comece a assistir a um filme.";
    }
}
