package aprofundamento;

import java.util.Scanner;

public class ExercicioAulaSeis {
    
    static int[] arr = new int[5];
    static int totalAlunos = 0;
    static double frequencia;
    static int maiorFrequencia;
    static int menorFrequencia;
    static int diaMaiorFrequencia;
    static int diaMenorFrequencia;
    static int diaAcimaDaMedia;
    /*static double diferenca = percentualDiferenca(maiorFrequencia, menorFrequencia);*/
    static int quantidadePares = pares(arr);
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = ler.nextInt();
            totalAlunos += arr[i];
        }
        System.out.println(totalAlunos);
        System.out.println(frequencia = frequenciaMedia(totalAlunos));
        System.out.println(maiorFrequencia = maiorFrequencia(arr));
        System.out.println(menorFrequencia = menorFrequencia(arr));
        System.out.println(diaMaiorFrequencia = numeroMaiorFrequencia(arr));
        System.out.println(diaMenorFrequencia = numeroMenorFrequencia(arr));
        System.out.println(diaAcimaDaMedia = acimaMedia(frequencia));
        System.out.println(quantidadePares);
        /*System.out.println(diferenca);*/


        ler.close();
    }

    public static double frequenciaMedia(int total) {
        double frequencia = total/5;
        return frequencia;
    }

    public static int maiorFrequencia(int[] arr) {
        int maiorFrequencia=0;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i]>maiorFrequencia) {
                maiorFrequencia = arr[i];
            }
        }
        return maiorFrequencia;
    }
    
    public static int menorFrequencia(int[] arr) {
        int menorFrequencia=Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] < menorFrequencia) {
                menorFrequencia = arr[i];
            }
        }
        return menorFrequencia;
    }

    public static int numeroMaiorFrequencia(int[] arr) {
        int numeroMaiorFrequencia = Integer.MIN_VALUE;
        int indiceMaiorFrequencia = 0;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i]>numeroMaiorFrequencia) {
                numeroMaiorFrequencia = arr[i];
                indiceMaiorFrequencia = i + 1;
            }
        }
        return indiceMaiorFrequencia;
    }

    public static int numeroMenorFrequencia(int[] arr) {
        int numeroMenorFrequencia = Integer.MAX_VALUE;
        int indiceMenorFrequencia = 0;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i]<numeroMenorFrequencia) {
                numeroMenorFrequencia = arr[i];
                indiceMenorFrequencia = i + 1;
            }
        }
        return indiceMenorFrequencia;
    }
    public static int acimaMedia(double frequenciaMedia){
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] > frequenciaMedia){
                diaAcimaDaMedia +=1;
            }
        }
        return diaAcimaDaMedia;
    }

    /*public static double percentualDiferenca(int maiorFrequencia, int menorFrequencia) {
        double diferenca = (maiorFrequencia - menorFrequencia) / (maiorFrequencia * 100);
        return diferenca;
    }
*/
    public static int pares(int[] arr) {
        for (int i=0 ; i<arr.length ; i++){
            if(arr[i]%2==0){
                quantidadePares +=1;
            }
        }
        return quantidadePares;
    }
}
