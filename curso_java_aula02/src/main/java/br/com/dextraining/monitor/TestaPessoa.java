package br.com.dextraining.monitor;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("informe o nome: ");
		String nome = scanner.nextLine();
		System.out.println("informe o cpf: ");
		String cpf = scanner.nextLine();
		System.out.println("informe o rg: ");
		int rg = scanner.nextInt();	
		
		Pessoa pessoa = new Pessoa(nome,cpf,rg);
		
		System.out.println(pessoa.toString());
		
		scanner.close();
		

	}

}
