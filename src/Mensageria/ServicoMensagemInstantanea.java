package Mensageria;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();

	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado à internet");
	}
	
	protected void salvarHistoricoMensagens() {
		System.out.println("Salvando histórico de mensagens");
	}
	
}
