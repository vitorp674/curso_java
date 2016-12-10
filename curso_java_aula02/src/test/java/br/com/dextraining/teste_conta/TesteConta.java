package br.com.dextraining.teste_conta;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.conta.Conta;

public class TesteConta {
	Conta conta = new Conta();
	@Test
	public void testaDeposito(){
		double resultado;
		conta.deposito(100);
		resultado = conta.mostraSaldo();
		Assert.assertEquals(Double.valueOf(100),Double.valueOf(resultado));
	}
	@Test
	public void testaSaque(){
		double resultado;
		conta.deposito(100);
		conta.saque(50);
		resultado = conta.mostraSaldo();
		Assert.assertEquals(Double.valueOf(50),Double.valueOf(resultado));
	}
//	@Test
//	public void testaSaldo(){
//		double resultado;
//		resultado = conta.mostraSaldo();
//		Assert.assertEquals(Double.valueOf(100),Double.valueOf(resultado));
//	}
	

}
