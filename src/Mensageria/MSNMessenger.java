package Mensageria;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		System.out.println("MSN MESSENGER");
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		salvarHistoricoMensagens();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}

}
