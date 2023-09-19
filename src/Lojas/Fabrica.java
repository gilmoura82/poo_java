package Lojas;

import Equipamentos.Deskjet;
import Equipamentos.Impressora;
import Equipamentos.Laserjet;

public class Fabrica {
	public static void main(String[] args) {
		Impressora desk = new Deskjet();
		Impressora laser = new Laserjet();
		
		desk.imprimir();
		laser.imprimir();
	}
	

}
