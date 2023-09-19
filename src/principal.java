import Mensageria.FacebookMessenger;
import Mensageria.MSNMessenger;
import Mensageria.Telegram;
import Veiculos.Carro;
import Veiculos.Moto;

public class principal {
	
	// público | estático | void | main | array de strings
	
	public static void main(String[] args) {
		
		/*
		Cachorro cachorro1 = new Cachorro("Mel", "Dourada", 5.5);
		Gato gato1 = new Gato("Felix", "Preto", 4.5);
		Passaro passaro1 = new Passaro("Felix", "Preto", 4.5);
		
		Petshop petshop = new Petshop();
		
		petshop.darBanho(cachorro1);
		System.out.println(cachorro1.getEstadoDeEspirito());
		
		petshop.darBanho(gato1);
		System.out.println(gato1.getEstadoDeEspirito());
		
		petshop.darBanho(passaro1);
		System.out.println(passaro1.getEstadoDeEspirito());
		
		
		
		Carro jeep = new Carro();
		jeep.setChassi("12345");
		jeep.ligar();
		
		Moto hz400 = new Moto();
		hz400.setChassi("223450");
		hz400.ligar();
		
		*/
		
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
		
		
		
	}

}
