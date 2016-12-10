package br.com.dextraining.conta;

import java.util.Scanner;

import java.util.Scanner;

public class MenuConta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
		int opcao = mostrarMenu(scanner);
		while (opcao != 4) {
			if (opcao == 1) {
				System.out.println("Ler valor do saque e sacar");
				conta.saque(scanner.nextDouble());
			} else if (opcao == 2) {
				System.out.println("Ler valor do deposito e depositar");
				conta.deposito(scanner.nextDouble());
			} else if (opcao == 3) {
				System.out.println("Mostrar saldo");
				conta.mostraSaldo();
			} else {
				System.out.println("Opcao invalida!");
			}
			opcao = mostrarMenu(scanner);
		}
		scanner.close();
	}

	private static int mostrarMenu(Scanner scanner) {
		System.out.println("1. Sacar");
		System.out.println("2. Depositar");
		System.out.println("3. Ver saldo");
		System.out.println("4. Sair");
		return scanner.nextInt();
	}
}