package ListaXV15;

public class Filme extends ItemMidia implements Avaliavel {
    private String diretor;

    public Filme(String titulo, int anoLancamento, double duracao, String diretor) {
        super(titulo, anoLancamento, duracao);
        this.diretor = diretor;

    }


    @Override
    public void receberAvalacao(int nota) {
        System.out.println("O filme: " + getTitulo() + " recebeu a nota: " + nota);

    }

    @Override
    public void reproduzir() {
        System.out.println("Iniciando filme "+ getTitulo() + " do diretor: "+ diretor + " Duração: " + getDuracao());

    }
}
