package treinamentocdi.exemplo;

public class Entidade {
	private int chave;
	private String valor;
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Entidade(int chave, String valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}
	
	
	
}
