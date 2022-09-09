package exercicios.aulaSeis;

import java.util.Scanner;

public class ExercicioAulaSeis {
    
    static int[] arr = new int[5];
    static int totalAlunos = 0;
    static double frequencia;
    static int maiorFrequencia;
    static int menorFrequencia;
    static int diaMaiorFrequencia;
    static int diaMenorFrequencia;
    
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
        int menorFrequencia=0;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i] > menorFrequencia) {
                maiorFrequencia = arr[i];
            }
        }
        return menorFrequencia;
    }

    public static int numeroMaiorFrequencia(int[] arr) {
        int numeroMaiorFrequencia=0;
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
        int numeroMenorFrequencia=0;
        int indiceMenorFrequencia = 0;
        for(int i=0 ; i<arr.length ; i++){
            if (arr[i]<numeroMenorFrequencia) {
                numeroMenorFrequencia = arr[i];
                indiceMenorFrequencia = i + 1;
            }
        }
        return indiceMenorFrequencia;
    }
}
