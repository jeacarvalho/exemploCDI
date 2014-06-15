package treinamentocdi.exemplo;
 
	import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
 
	@Decorator
	public class DecorarEspTesteInjecaoImpl implements TesteInjecao {
 
	@Inject
	@Delegate
	@Any
	EspTesteInjecaoImpl espTesteInjecaoImpl;
	 
	@Override
	public String obterMensagem() {
		return espTesteInjecaoImpl.obterMensagem()+"++ Decorou ++";
	}

	@Override
	public String obterDataHora() {
		return espTesteInjecaoImpl.obterDataHora()+"++ Decorou ++";
	}
}
