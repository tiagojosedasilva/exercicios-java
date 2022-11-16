package java.exercicios.navio;

public abstract class Navio {

    private int idNavio;
    private String nome;
    private int quantidadePortoes;
    private double capacidadeCarga;
    private String disponibilidade;

    public Navio(int idNavio, String nome, int quantidadePortoes, double capacidadeCarga, String disponibilidade) {
        this.idNavio = idNavio;
        this.nome = nome;
        this.quantidadePortoes = quantidadePortoes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = disponibilidade;
    }

    public Navio() {
    }

    public int getIdNavio() {
        return idNavio;
    }

    public void setIdNavio(int idNavio) {
        this.idNavio = idNavio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePortoes() {
        return quantidadePortoes;
    }

    public void setQuantidadePortoes(int quantidadePortoes) {
        this.quantidadePortoes = quantidadePortoes;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void iniciarCaregamento(){
        this.disponibilidade = "Carregando";
    }

    public void bloquearCarregamento(){
        this.disponibilidade = "Lotado";
    }
}


