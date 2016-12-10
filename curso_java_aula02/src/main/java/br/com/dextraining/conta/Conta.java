package br.com.dextraining.conta;

public class Conta {
	public double saldo;
	
	public void saque(double valor){
		if(valor > saldo){
			System.out.println("saldo insulficiente");
		}else{
			saldo = saldo - valor;
		}
		//saldo = saldo - valor;
		//return saldo;
	}
	public void deposito(double valor){
		saldo = saldo + valor;
		//return saldo;
	}
	public double mostraSaldo(){
		System.out.println(saldo);
		return saldo;
	}

}
