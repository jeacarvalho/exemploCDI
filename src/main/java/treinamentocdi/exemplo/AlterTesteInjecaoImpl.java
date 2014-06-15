package treinamentocdi.exemplo;

import javax.enterprise.inject.Alternative;

@Alternative
public class AlterTesteInjecaoImpl implements TesteInjecao {

	@Override
	public String obterMensagem() {
		return "Exibindo mensagem do bean injetado com Alternative!";
	}

	@Override
	public String obterDataHora() {
		// TODO Auto-generated method stub
		return "Sem implementação de data!";
	}

}
