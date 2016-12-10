package br.com.dextraining.lambada;

public class Lampada {
	public int numeroWatts;
	public String fabricante;
	public boolean status;
	
	
	public Lampada(int numeroWatts, String fabricante) {
		this.numeroWatts = numeroWatts;
		this.fabricante = fabricante;
		this.status = false;
	}
	public void ligar(){
		status = true;
		System.out.println("Ligando....");
	}
	public void desligar(){
		status = false;
		System.out.println("Desligando....");
	}
	
	public boolean estaLigada(){
		return status;
	}
}
