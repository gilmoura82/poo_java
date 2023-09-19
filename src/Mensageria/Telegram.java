package Mensageria;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		System.out.println("TELEGRAM");
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagens();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}

}
