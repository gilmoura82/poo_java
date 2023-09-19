package Equipamentos;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void imprimir() {
		System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

	@Override
	public void copiar() {
		System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
		
	}

}
