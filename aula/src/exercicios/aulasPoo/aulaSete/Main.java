package exercicios.aulasPoo.aulaSete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ContaBancaria[] conta = new ContaBancaria[3];

        for (int i = 0; i < conta.length; i++) {

            conta[i] = new ContaBancaria();


            System.out.println("Digite o numero da sua conta: ");
            int numConta = ler.nextInt();
            if (numConta <= 0) {
                System.out.println("Digite um numero maior que 0.");
            } else {
                conta[i].setNumero(numConta);
            }


            System.out.println("Digite o tipo da sua conta: ");
            String tipoConta = ler.next();
            conta[i].setTipo(tipoConta);


            System.out.println("Digite 1 para depositar, 2 para sacar e 3 para ver o saldo");
            int escolha = ler.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Digite o valor que vai ser depositado na " + (i + 1) + " conta:");
                    int valorDeposito = ler.nextInt();
                    conta[i].realizarDeposito(valorDeposito);
                case 2:
                    System.out.println("Digite o valor que vai ser sacado na " + (i + 1) + " conta:");
                    double valorSaque = ler.nextDouble();

                    conta[i].realizarSaque(valorSaque);
                    while (conta[i].realizarSaque(valorSaque) == false){
                        System.out.println("Tente novamente.");
                        break;
                    }
                case 3:
                    System.out.println("Seu saldo disponivel é de: " + conta[i].getSaldo());
                    break;

                default:
                    System.out.println("Numero incorreto");
            }
        }
    }
}
