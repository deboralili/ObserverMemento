public interface FilmeEstado {

    String getEstado();

    String marcarAssistido(Filme filme);

    String marcarNaoAssistido(Filme filme);

    String marcarAssistindo(Filme filme);

    String marcarInterrompido(Filme filme);

}
