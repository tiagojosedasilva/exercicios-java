package java.exercicios.navio;

public class NavioContainer extends Navio{

    private int quantidadeGuindastes;
    private int quantidadeCamadas;

    public NavioContainer(int idNavio, String nome, int quantidadePortoes, double capacidadeCarga, String disponibilidade, int quantidadeGuindastes, int quantidadeCamadas) {
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamadas = quantidadeCamadas;
    }

    public int getQuantidadeGuindastes() {
        return quantidadeGuindastes;
    }

    public void setQuantidadeGuindastes(int quantidadeGuindastes) {
        this.quantidadeGuindastes = quantidadeGuindastes;
    }

    public int getQuantidadeCamadas() {
        return quantidadeCamadas;
    }

    public void setQuantidadeCamadas(int quantidadeCamadas) {
        this.quantidadeCamadas = quantidadeCamadas;
    }
}
