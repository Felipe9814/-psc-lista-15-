package ListaXV15;

public class Musica extends ItemMidia implements Avaliavel {
    private String artista;


    public Musica(String titulo, int anoLancamento, double duracao, String artista) {
        super(titulo, anoLancamento, duracao);
        this.artista = artista;
    }

    @Override
    public void receberAvalacao(int nota) {
        System.out.println("A musica: " + getTitulo() + " recebeu " + nota + "estrelas. ");

    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando a musica: " + getTitulo() + " do artista: " + artista + " tempo: " + getDuracao());

    }
}

