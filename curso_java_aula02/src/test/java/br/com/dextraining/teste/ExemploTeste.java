package br.com.dextraining.teste;

import org.junit.Assert;
import org.junit.Test;

public class ExemploTeste {
		@Test
		public void testarSoma(){
			int valor1 = 10;
			int valor2 = 20;
			int resultado = valor1 + valor2;
			Assert.assertEquals(30, resultado);
		}
		@Test
		public void testarMultiplicacao(){
			
		}
}
