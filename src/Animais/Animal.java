package Animais;

public abstract class Animal {
	
	protected String nome;
	protected String cor;
	protected double peso;
	protected String estadoDeEspirito;

	public Animal(String nome, String cor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public String getEstadoDeEspirito() {
		return estadoDeEspirito;
	}



	public void setEstadoDeEspirito(String estadoDeEspirito) {
		this.estadoDeEspirito = estadoDeEspirito;
	}



	public void comer() {}
	
	public void dormir() {}
	
	public abstract void soar();

	

}
