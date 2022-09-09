package exercicios.aula1;

import java.util.Scanner;

public class Main extends Calculadora{

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, insira o primeiro número!");
        cal.operando1 = ler.nextInt();
        System.out.println("Por favor, insira o segundo número!");
        cal.operando2 = ler.nextInt();

        System.out.println("Adição: " + cal.adicao());
        System.out.println("Subtração: " + cal.subtracao());
        System.out.println("Multiplicação: " + cal.multiplicacao());
        System.out.println("Divisão: " + cal.divisao());
        
        ler.close();
    }
}