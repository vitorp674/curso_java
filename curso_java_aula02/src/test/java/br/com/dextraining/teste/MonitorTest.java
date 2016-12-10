package br.com.dextraining.teste;


import org.junit.Assert;
import org.junit.Test;

import br.com.dextraining.monitor.Monitor;

public class MonitorTest {
	Monitor monitor = new Monitor();
	
	@Test
	public void testarMonitor(){
		//System.out.println(monitor);
		monitor.cor = "preto";
		monitor.numeroSerie = "20";
		monitor.polegadas = 10;
		
		//System.out.print(monitor.cor);
		
	    Assert.assertNotNull(monitor);
	    Assert.assertFalse(monitor.ligado);
	    Assert.assertEquals(0, monitor.brilho);
	}
	
	@Test
	public void testarMaximoBrilho(){
		monitor = new Monitor();
		
		for(int i = 0; i<102; i++){
			monitor.aumentaBrilho();
		}
		Assert.assertEquals(103, monitor.brilho);
	}

}
