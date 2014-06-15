package treinamentocdi.exemplo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@MeuQualificador
public class QualiTesteInjecaoImpl implements TesteInjecao {

	@Override
	public String obterMensagem() {
		return "Exibindo mensagem do bean injetado com qualificador!";
	}

	@Override
	public String obterDataHora() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date data =  new Date();
		return dateFormat.format(data);
	}

}
