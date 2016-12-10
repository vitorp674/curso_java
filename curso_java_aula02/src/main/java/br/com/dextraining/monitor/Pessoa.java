package br.com.dextraining.monitor;

public class Pessoa {
	public String nome;
	public String cpf;
	public int rg;
	
	public Pessoa(String nome, String cpf, int rg){
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String toString(){
		return "nome "+nome+" rg "+ rg + " cpf "+ cpf;
	}
}
