package Animais;

public class Cachorro extends Animal {
	
	// Atributos
	static int numeroDeCachorros;
	private String estadoDeEspirito;
	
	// Construtores
	
	
	
	// Métodos

	public Cachorro(String nome, String cor, double peso) {
		super(nome, cor, peso);
		this.nome = nome;
		this.cor = cor;
	    this.peso = peso;
	}

	public String getEstadoDeEspirito() {
		return estadoDeEspirito;
	}

	public void setEstadoDeEspirito(String estadoDeEspirito) {
		this.estadoDeEspirito = estadoDeEspirito;
	}


	public String interagir(String acao) {
		switch (acao) {
		case "carinho":
			this.estadoDeEspirito = "feliz";
			break;
		case "vai dormir":
			this.estadoDeEspirito = "bravo"; break;
		case "pisar na patinha":
			this.estadoDeEspirito = "triste"; break;
		default:
			this.estadoDeEspirito = "neutro"; break;
		}
		
		return this.estadoDeEspirito;
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + "]";
	}
	
	public void soar() {
		System.out.println("AU AU");
	}
	
	
}
