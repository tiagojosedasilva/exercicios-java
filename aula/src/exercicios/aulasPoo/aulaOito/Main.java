package exercicios.aulasPoo.aulaOito;

public class Main{

    public static void main(String[] args) {
        
        while(0<1){
            System.out.println("gudi dia!");
        }
    }
}
/*
 * E02 - Orientação a Objetos - 2022.2 - Noite
Exercício: Classe ContaBancaria (array)
Aldo de Moura Lima
•
15 de set. Editado às 20:36
Data de entrega: Ontem 23:59
Implemente a classe ContaBancaria em anexo. O atributo limite refere-se a um valor que é franqueado ao correntista para que ele possa realizar saque além do saldo da conta. O método realizarSaque() não deve permitir sacar um valor superior ao saldo total disponível (saldo + limite).

Implemente uma aplicação console que recebe os dados para (três) objetos da classe ContaBancaria que deverão ser armazenados em um array. Não pode ter número de conta e limite igual ou menor que 0 (zero).

CL_ContaBancaria.png
Imagem

AppArray.java
Java

ContaBancaria.java
Java
Comentários da turma
Seus trabalhos
Devolvido

Main.java
Java

ContaBancaria.java
Java
1 comentário particular

Aldo de Moura Lima18:31
O atributo saldo não deve ter método set, pois só pode ser alterado através do registrarDeposito() e registarSaque.

Método set não tem processamento. O parâmetro do método set é apenas o dado que será armazenado. 
Que regra é essa no método setLimite?

O saldo disponível envolve o limite de crédito.

Na aplicação
A crítica sobre o número da conta informa que o número está errado, mas permite avançar. Faltou  receber o limite de crédito.

Não foi solicitado operações de deposito e saque.

package br.com.unit.aula06;

public class ContaBancaria {
	private int    numero;
	private String tipo;
	private double saldo;
	private double limite;
	

	public ContaBancaria(int numero, String tipo, double limite) {
		this.numero = numero;
		this.tipo = tipo;
		this.limite = limite;
	}

	public void realizarDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean realizarSaque(double valorSaque) {
		if (valorSaque > saldo + limite) {
			return false;
		}
		this.saldo -= valorSaque;
		return true;
	}
	
	public double obterSaldoDisponivel() {
		return saldo + limite;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


}
ContaBancaria.java
Exibindo ContaBancaria.java…
 */




 /*
  * E02 - Orientação a Objetos - 2022.2 - Noite
Exercício: Classe ContaBancaria (array)
Aldo de Moura Lima
•
15 de set. Editado às 20:36
Data de entrega: Ontem 23:59
Implemente a classe ContaBancaria em anexo. O atributo limite refere-se a um valor que é franqueado ao correntista para que ele possa realizar saque além do saldo da conta. O método realizarSaque() não deve permitir sacar um valor superior ao saldo total disponível (saldo + limite).

Implemente uma aplicação console que recebe os dados para (três) objetos da classe ContaBancaria que deverão ser armazenados em um array. Não pode ter número de conta e limite igual ou menor que 0 (zero).

CL_ContaBancaria.png
Imagem

AppArray.java
Java

ContaBancaria.java
Java
Comentários da turma
Seus trabalhos
Devolvido

Main.java
Java

ContaBancaria.java
Java
1 comentário particular

Aldo de Moura Lima18:31
O atributo saldo não deve ter método set, pois só pode ser alterado através do registrarDeposito() e registarSaque.

Método set não tem processamento. O parâmetro do método set é apenas o dado que será armazenado. 
Que regra é essa no método setLimite?

O saldo disponível envolve o limite de crédito.

Na aplicação
A crítica sobre o número da conta informa que o número está errado, mas permite avançar. Faltou  receber o limite de crédito.

Não foi solicitado operações de deposito e saque.

package br.com.unit.aula06;

import java.util.Scanner;

public class AppArray {

	static ContaBancaria[] vetorContas = new ContaBancaria[3];

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
				
		
		for (int i = 0; i < vetorContas.length; i++) {
	
			int numero;
			do {
				System.out.printf("Número da %dª conta: ", i+1);
				numero = lerTeclado.nextInt();
				if (numero <=0) {
					System.out.println("Número da conta inválido. Tem de ser positivo");
					continue;
				}
				break;
			} while (true);

			lerTeclado.nextLine();
			System.out.printf("Tipo da conta: ");
			String tipo = lerTeclado.nextLine();
			
			double limite;
			do {
				System.out.printf("Limite: ");
				limite = lerTeclado.nextInt();
				if (limite<=0) {
					System.out.println("O valor do limite deve ser positivo");
					continue;
				}
				break;
			} while (true);


			vetorContas[i] = new ContaBancaria(numero, tipo, limite);
		
		}
		
		lerTeclado.close();
	}
}
AppArray.java
Exibindo AppArray.java…
  */