package medicaoAr;

import java.util.Random;

public class MedicaoQualidadeAr {

    private int idMedicao;
    private int indice;
    private String classificação;

    public int getIdMedicao() {
        return idMedicao;
    }

    public void setIdMedicao(int idMedicao) {
        this.idMedicao = idMedicao;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getClassificação() {
        return classificação;
    }

    public void setClassificação(String classificação) {
        this.classificação = classificação;
    }

    String definirClassificao(int indice){
        if (indice <= 50){
            classificação = "Boa";
        }
        else if(indice > 50 && indice <= 100){
            classificação = "Regular";
        }
        else if(indice > 100 && indice <= 199){
            classificação = "Inadequada";
        }
        else if(indice > 199 && indice <= 299){
            classificação = "Má";
        }
        else if(indice > 300 && indice <= 399){
            classificação = "Péssima";
        }
        else if(indice >= 400){
            classificação = "Crítica";
        }
        return classificação;
    }
}
