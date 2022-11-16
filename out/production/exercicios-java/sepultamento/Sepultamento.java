public class Sepultamento {

    private int idSepultamento;
    private String Data;
    private Corpo corpo;
    private Tumulo tumulo;

    public Tumulo getTumulo() {
        return tumulo;
    }

    public void setTumulo(Tumulo tumulo) {
        this.tumulo = tumulo;
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

    public int getIdSepultamento() {
        return idSepultamento;
    }

    public void setIdSepultamento(int idSepultamento) {
        this.idSepultamento = idSepultamento;
    }

    public void sepultar(){
        this.corpo.setSituacao("Sepultado");
        this.tumulo.setOcupado(true);
    }
}
