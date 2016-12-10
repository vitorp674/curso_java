package br.com.dextraining.teste;

import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.monitor.Calculadora;

public class CalculadoraTest {
	    Calculadora calculadora = new Calculadora();

		@Test
		public void TestarSoma(){
	    	double resultado = calculadora.somar(1,3);
	    	
	
	    	Assert.assertEquals(Double.valueOf(4), Double.valueOf(resultado));
	    	//Assert.assertEquals(3.0,resultado);
			
		}
		@Test
		public void TestarSubtracao(){
			double resultado = calculadora.subtrair(4,2);
			Assert.assertEquals(Double.valueOf(2),Double.valueOf(resultado));
			
		}
		@Test
		public void TestarMultiplicacao(){
			double resultado = calculadora.multiplicar(4,2);
			Assert.assertEquals(Double.valueOf(8),Double.valueOf(resultado));
		}
		@Test
		public void TestarDivisao(){
			double resultado = calculadora.dividir(8,2);
			Assert.assertEquals(Double.valueOf(4),Double.valueOf(resultado));
		}
		
}
