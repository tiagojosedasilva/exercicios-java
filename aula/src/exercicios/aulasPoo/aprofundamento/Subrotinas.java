package exercicios.aulasPoo.aprofundamento;

import java.util.Scanner;

class Subrotinas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salarioBruto = ler.nextDouble();

        String tipo = tipoDesconto(salarioBruto);
        double salarioLiquido = valorDesconto(salarioBruto);

        System.out.println("O tipo do desconto recebido é: " + tipo);
        System.out.printf("O valor do salário líquido é: %3.2f%n", salarioLiquido);
    }

    public static String tipoDesconto(double salario) {
        String desconto;
        if (salario <= 2000) {
            desconto = "Isento";
        }else if(salario > 2000 && salario <= 4000){
            desconto = "Mínimo";
            salario = salario*(2/100);
        }else if (salario > 4000 && salario < 10000){
            salario = salario*(4/100);
            desconto = "Médio";
        }else{
            salario = salario-400;
            desconto = "Máximo";
        }
        return desconto;
    }

    public static double valorDesconto(double salario) {
        double valor;
        if (salario <= 2000) {
            valor = 0;
        }else if(salario > 2000 && salario <= 4000){
            valor = salario*0.02;
        }else if(salario > 4000 && salario < 10000){
            valor = salario*0.04;
        }else{
            valor = 400;
        }
        salario-=valor;
        return salario;
    }
}