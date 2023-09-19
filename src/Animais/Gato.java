package Animais;

public class Gato extends Animal {
	
	static int numeroDeGatos;
	
	public Gato(String nome, String cor, double peso) {
		super(nome, cor, peso);
		this.nome = nome;
		this.cor = cor;
	    this.peso = peso;
	}



	@Override
	public String toString() {
		return "Gato [nome=" + nome + "]";
	}
	
	public void soar() {
		System.out.println("MIAU MIAU");
	}
}
