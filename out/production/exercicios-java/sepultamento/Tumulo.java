public class Tumulo {

    private int idTumulo;
    private String Data;
    private boolean ocupado;

    public int getIdTumulo() {
        return idTumulo;
    }

    public void setIdTumulo(int idTumulo) {
        this.idTumulo = idTumulo;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void ocupar(){
        this.ocupado = true;
    }
    public void desocupar(){
        this.ocupado = false;
    }
}
