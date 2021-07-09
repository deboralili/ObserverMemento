public class FilmeEstadoInterrompido implements FilmeEstado {

    private FilmeEstadoInterrompido() {};
    private static FilmeEstadoInterrompido instance = new FilmeEstadoInterrompido();
    public static FilmeEstadoInterrompido getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Filme Interrompido.";
    }

    @Override
    public String marcarAssistido(Filme filme) {
        return "Operação não realizada. Volte a assistir ao filme.";
    }

    @Override
    public String marcarNaoAssistido(Filme filme) {
        return "Operação não realizada.";
    }

    @Override
    public String marcarAssistindo(Filme filme) {
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        return "Assistindo ao Filme.";
    }

    @Override
    public String marcarInterrompido(Filme filme) {
        return "Filme Interrompido.";
    }
}
