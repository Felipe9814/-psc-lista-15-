package ListaXV15;

public class Teste {
    public static void main(String[] args) {
        //teste 1
        Filme filme = new Filme("it", 1900, 200,"atoa");
        Musica musica = new Musica("halo",1500,20,"EU");
        ItemMidia[] lista = {filme , musica};
        for(ItemMidia item : lista ){
            item.reproduzir();
        }
        // teste 2
        Avaliavel avaliavel = new Filme("oi", 1400, 200 , "Bernardo");
        Avaliavel dois = new Musica("tu", 1504, 2, "felipe");
        avaliavel.receberAvalacao(4);
        dois.receberAvalacao(2);
        //teste 3
        filme.setDuracao(-45);
        filme.reproduzir();






    }}