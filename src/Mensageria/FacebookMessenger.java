package Mensageria;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		System.out.println("FACEBOOK MESSENGER");
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		salvarHistoricoMensagens();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");

	}

}
