package exercicios.aulasPoo.aulaSeis.aprofundamento;

import java.util.Scanner;

public class Frequencia {
    static Scanner ler = new Scanner(System.in);

    static int[] diasSemana = new int[5];
    static double frequenciaMedia;
    static int diaAcimaDaMedia = acimaMedia(frequenciaMedia);

    public static void main(String[] args) {
        System.out.println("Insira a frequencia dia-a-dia desta semana.");
        System.out.println(frequenciaMedia(diasSemana));
        System.out.println("quantidade de dias da semana com frequencia acima da média: " + acimaMedia(frequenciaMedia));
    }

    public static double frequenciaMedia(int[] diasSemana) {
        for (int i=0 ; i<diasSemana.length ; i++){
            diasSemana[i] = ler.nextInt();
            frequenciaMedia += diasSemana[i];
        }
        frequenciaMedia = frequenciaMedia/diasSemana.length;
        return frequenciaMedia;
    }

    public static int acimaMedia(double frequenciaMedia){
        for (int i=0 ; i<diasSemana.length ; i++){
            if (diasSemana[i] > frequenciaMedia){
                diaAcimaDaMedia +=1;
            }
        }
        return diaAcimaDaMedia;
    }


}
