package br.com.dextraining.monitor;

public class Monitor {
	public String numeroSerie;
	public int    polegadas;
    public String cor;
    public boolean ligado ;
    public int brilho;
    
    public void ligar(){
    	System.out.println("ligando..");
    	ligado = true;
    }
    
    public void desligar(){
    	System.out.println("desligando..");
    	ligado = false;
    }    
    
    public int aumentaBrilho(){
    	if(brilho <100){
    		brilho ++;    	
    	    return brilho;
    	}
    
    	return brilho;
    }
    
    public int diminuiBrilho(){
    	if(brilho >0){
    		brilho --;
    	    return brilho;
    	}
    	return brilho;
    }    
	public int trocarBrilho(int brilho){
		this.brilho = brilho;
		return this.brilho;
	}
}
