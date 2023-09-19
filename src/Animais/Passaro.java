package Animais;

public class Passaro extends Animal{
	
	static int numeroDePassaros;
	private String nome;
	private String cor;
	private int altura;
	private double peso;
	private String estadoDeEspirito;
	
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
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
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
	
	public Passaro(String nome, String cor, double peso) {
		super(nome, cor, peso);
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}
	
	
	public void comer() {}
	
	public void dormir() {}
	
	@Override
	public String toString() {
		return "Passaro [nome=" + nome + "]";
	}
	
	@Override
	public void soar() {
		System.out.println("Cri Cri");
	}
	
	
}
