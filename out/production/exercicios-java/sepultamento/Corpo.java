public class Corpo {
    private int idCorpo;
    private String Nome;
    private String situacao;



    public int getIdCorpo() {
        return idCorpo;
    }

    public void setIdCorpo(int idCorpo) {
        this.idCorpo = idCorpo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void sepultar(){
        this.situacao = "Sepultado";
    }
    public void exumar(){
        this.situacao = "Exumado";
    }
}
