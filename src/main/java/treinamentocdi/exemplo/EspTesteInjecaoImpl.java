package treinamentocdi.exemplo;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;

@Alternative
@Specializes
@TesteInterceptador
public class EspTesteInjecaoImpl extends QualiTesteInjecaoImpl {

	@Override
	public String obterMensagem() {
		return "Exibindo mensagem do bean injetado com Alternativa e Especialização!";
	}

	@Override
	public String obterDataHora() {
		return "Sem plementação para data e hora";
	}

}
