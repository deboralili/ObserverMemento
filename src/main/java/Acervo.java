import java.util.*;

public class Acervo extends Observable {
    private List<Filme> acervo;

    public Acervo(Filme... filmes) {
        this.acervo = new ArrayList<Filme>();
        Collections.addAll(this.acervo, filmes);
    }

    public void adicionarFilme(Filme filme){
        acervo.add(filme);
        setChanged();
        notifyObservers();
    }
}
