package aulaDois;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ContaBancaria acc = new ContaBancaria();

        System.out.println("saldo: ");
        acc.saldo = ler.nextDouble();
        System.out.println("N conta: ");
        acc.numeroConta = ler.nextDouble();
        System.out.println("Tipo: ");
        acc.tipoConta = ler.next();
        System.out.println("depósito: ");
        acc.quantia = ler.nextDouble();
        acc.deposito(acc.quantia);
        System.out.println(acc.saldo);

        System.out.println("Saque: ");
        acc.quantia = ler.nextDouble();
        acc.saque(acc.quantia);
        System.out.println("Saldo: " + acc.saldo);



    }
}

