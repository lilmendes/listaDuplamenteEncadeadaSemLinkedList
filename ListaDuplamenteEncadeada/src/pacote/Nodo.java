package pacote;
public class Nodo {

	 public Nodo anterior=null; //é isso? 
 	 public Contato dado;
	 public Nodo proximo; //é isso?
	 
	 
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public void setDado(Contato dado) {
		this.dado = dado;
	}
	public Nodo getProximo() {
		return proximo;
	}
	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}
	 
	 
	 
	 
}
