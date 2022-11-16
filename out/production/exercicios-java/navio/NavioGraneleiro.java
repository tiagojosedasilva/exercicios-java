package java.exercicios.navio;

public class NavioGraneleiro extends Navio{

    private int quantidadeEscotilhas;

    public NavioGraneleiro(int idNavio, String nome, int quantidadePortoes, double capacidadeCarga, String disponibilidade, int quantidadeEscotilhas) {
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

    public int getQuantidadeEscotilhas() {
        return quantidadeEscotilhas;
    }
    public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }
}
