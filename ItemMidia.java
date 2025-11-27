package ListaXV15;

public abstract class ItemMidia {
    private String titulo ;
    private int anoLancamento;
    private double duracao;

    public ItemMidia(String titulo, int anoLancamento, double duracao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        if (duracao > 0){
        this.duracao = duracao;
    }}
    public abstract void reproduzir();
}
