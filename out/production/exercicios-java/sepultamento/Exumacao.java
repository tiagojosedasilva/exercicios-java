public class Exumacao {
    private int idExumacao;
    private String Data;
    private Corpo corpo;
    private Tumulo tumulo;

    public int getIdExumacao() {
        return idExumacao;
    }

    public void setIdExumacao(int idExumacao) {
        this.idExumacao = idExumacao;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public Corpo getCorpo() {
        return corpo;
    }

    public void setCorpo(Corpo corpo) {
        this.corpo = corpo;
    }

    public void exmucar(){
        this.corpo.setSituacao("Exumado");
        this.tumulo.desocupar();
    }
}
