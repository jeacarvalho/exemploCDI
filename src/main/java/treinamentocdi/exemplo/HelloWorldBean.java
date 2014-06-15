package treinamentocdi.exemplo;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class HelloWorldBean {

	@Inject
	@MeuQualificador
	private TesteInjecao testeInjecao;
	
	@Inject
	private Mensagem mensagem;
	
	@Inject @Notificar
	private TratarEntidade tratarEntidade;
	
	public String getExecutarEvento (){
        return tratarEntidade.trataEntidade(new Entidade (1,"Valor"));

    }
	
	public String getMessageFromProducer(){
		return mensagem.obterMensagem();
	}
	
	public String getMessage(){
		return testeInjecao.obterMensagem();
	}
	
	
	public String getDataHora(){
		return "Data e hora do acesso: " + testeInjecao.obterDataHora();
	}
		
	
}
