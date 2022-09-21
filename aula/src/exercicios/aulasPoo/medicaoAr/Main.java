package medicaoAr;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MedicaoQualidadeAr medicaoAr = new MedicaoQualidadeAr();
        Random gerador = new Random();
        Scanner ler = new Scanner(System.in);

        medicaoAr.setIdMedicao(gerador.nextInt(1000));
        System.out.println("Insira o índice da qualidade do ar.");
        medicaoAr.setIndice(ler.nextInt());
        medicaoAr.setClassificação(medicaoAr.definirClassificao(medicaoAr.getIndice()));

        System.out.println("ID_Medição | " + medicaoAr.getIdMedicao());
        System.out.println("Indice | " + medicaoAr.getIndice());
        System.out.println("Classificação | " + medicaoAr.getClassificação());
    }
}
