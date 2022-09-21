package exercicios.codeChef;


import java.util.Scanner;

public class CursosRTP {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[][][] arr = new int[ler.nextInt()][ler.nextInt()][ler.nextInt()];

       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0][0] > 0) {
                

            }else if (arr[0][i][0] > 0) {
                arr[0][i][0] = arr[0][i][0] * 2; 
            }
            System.out.println();
        }
    }
}