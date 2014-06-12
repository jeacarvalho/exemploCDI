package treinamentocdi.exemplo;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HelloWorldBean {

	@Inject
	private TesteInjecao testeInjecao;
	public String getMessage(){
		return testeInjecao.obterMensagem();
	}
	
	
	public String getDataHora(){
		return "Data e hora do acesso: " + testeInjecao.obterDataHora();
	}
		
	
}
