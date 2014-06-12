package treinamentocdi.exemplo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteInjecaoImpl implements TesteInjecao{
	@Override
	public String obterMensagem() {
		return "Retornando mensagem injetada por implementacao de interface";
	}
	@Override
	public String obterDataHora() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date data =  new Date();
		return dateFormat.format(data);
	}
	
}
