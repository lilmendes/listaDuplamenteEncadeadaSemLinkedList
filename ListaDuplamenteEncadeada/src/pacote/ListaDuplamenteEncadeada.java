package pacote;
public class ListaDuplamenteEncadeada {

	private Nodo primeiro = null;
	private int numero = 0;
	private Nodo ultimo = null;

	public void AdicionarNaEsquerda(Contato valor) {
		Nodo auxiliar = new Nodo();
		auxiliar.dado = valor;
		if(numero==0) {
			primeiro = auxiliar;
			ultimo = auxiliar;
			auxiliar.anterior = null;
		} else {
			auxiliar.proximo = primeiro;
			auxiliar.anterior = null;
			primeiro = auxiliar;
		}

		numero++;
	}
	public void adicionarNaDireita(Contato valor) {
		Nodo auxiliar = new Nodo();
		Nodo temporario;
		auxiliar.dado = valor;
		if (numero == 0) {
			primeiro = auxiliar;
			ultimo = auxiliar;
		}else {
			temporario = ultimo;
			temporario.proximo = auxiliar;
			auxiliar.anterior = temporario;
			auxiliar.proximo = null;
			ultimo = auxiliar;
		}
		numero++;
	}


	public void listarListaImprimir() {
		System.out.println("Sua Lista está assim:");
		Nodo auxiliar = primeiro;
		if(auxiliar!= null) {
			while(auxiliar != null) {
				System.out.println("Nome: "+ auxiliar.dado.getNomeAluno() + " idade: "+ auxiliar.dado.getIdade());
				auxiliar = auxiliar.proximo;
			}
		}else {
			System.out.println("Lista vazia");
		}

		System.out.println();
	}
	public void consultarEsquerda() {
		Nodo auxiliar;
		auxiliar = primeiro;
		if(auxiliar!= null) {
			System.out.println("O primeiro elemento da sua lista é:");
			System.out.println("<--(Nome: "+ primeiro.dado.getNomeAluno() + " idade: "+ primeiro.dado.getIdade()+")-->");
		} else {
			System.out.println("nulo!");
		}
	}


	
	public void consultarDireita() {
		Nodo auxiliar;
		auxiliar = ultimo;
		if(auxiliar!= null) {
			System.out.println("O último elemento da sua lista é:");
			System.out.println("<--(Nome: "+ ultimo.dado.getNomeAluno() + " idade: "+ ultimo.dado.getIdade()+")-->");
		} else {
			System.out.println("nulo!");
		}
	}

	public Contato removeElementoListaEsquerda() {
		Nodo antes, auxiliar = primeiro;
		Contato dado;
		if(numero==0) {
			return(null);
		} else {
			dado = auxiliar.dado;
			numero--;
			if(numero==0) {
				primeiro = null;
				ultimo = null;
			System.out.println("Lista vazia!");
			} else {
				antes = auxiliar.proximo;
				primeiro = antes;
				antes.anterior = null;
			}
			return(dado);
		}
	}

	public Contato removeElementoListaDireita() {
		Nodo antes, auxiliar = ultimo;
		Contato dado;
		if(numero==0) {
			return(null);
		} else {
			dado = auxiliar.dado;
			numero--;
			if(numero==0) {
				primeiro = null;
				ultimo = null; 
			System.out.println("Lista vazia!");
			} else {
				antes = auxiliar.anterior;
				ultimo = antes;
				antes.proximo = null;
			}
			return(dado);
		}
	}
}
