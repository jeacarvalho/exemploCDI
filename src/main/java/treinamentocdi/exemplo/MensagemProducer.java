package treinamentocdi.exemplo;

import javax.enterprise.inject.Produces;

public class MensagemProducer {
 
	@Produces
	public Mensagem makeMessage() {
		return new Mensagem() {
			@Override
			public String obterMensagem() {
				return "Mensagem gerada no produtor";
			}
		}; 
	}
 
}
