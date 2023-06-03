package pacote;
import java.util.Scanner;
public class TestaLista {
	public static void main(String[] args) {
		Scanner opcaoUsuario = new Scanner(System.in);
		Scanner	nomeInformadoz = new Scanner(System.in);
		Scanner	idadeInformada = new Scanner(System.in);
		ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();
        TestaLista testaLista = new TestaLista(); 
	//		Contato dado = new Contato();
		int qtd=0,idadeInformado;
	   String nomeInformado;
		do {
			System.out.print("Usuário escolha a opção"
					+ "\n(1) Adicionar contato na esquerda "
					+ "\n(2) Adicionar contato na direita"
					+ "\n(3) Listar"
					+ "\n(4) Consultar esquerda"
					+ "\n(5) Consultar direita"
					+ "\n(6) Remover da esquerda"
					+ "\n(7) Remover da direita"  
					+ "\n(8) Sair");
			int operacao = opcaoUsuario.nextInt();

			switch(operacao) {
			case 1: 
			//adicionar na esquerda
				nomeInformado = recebeNomeUsuario(nomeInformadoz);
				idadeInformado = recebeIdadeUsuario(idadeInformada);
				testaLista.adicionarNovoContatoEsquerda(listaDuplamenteEncadeada, testaLista, nomeInformado, idadeInformado);
				listaDuplamenteEncadeada.listarListaImprimir(); 
			
				break;
			case 2: 
			//adiciona na direita
				nomeInformado = recebeNomeUsuario(nomeInformadoz);
				idadeInformado = recebeIdadeUsuario(idadeInformada);
				testaLista.adicionarNovoContatoDireita(listaDuplamenteEncadeada, testaLista, nomeInformado, idadeInformado);
				listaDuplamenteEncadeada.listarListaImprimir(); 
				
				break;
			case 3: 
			//imprimir	
				listaDuplamenteEncadeada.listarListaImprimir();

				break;
			case 4: 
			
				listaDuplamenteEncadeada.consultarEsquerda();
				break;
			case 5: 
				listaDuplamenteEncadeada.consultarDireita();
				break;
           case 6: 
			 listaDuplamenteEncadeada.removeElementoListaEsquerda();
			 listaDuplamenteEncadeada.listarListaImprimir();
			
			 break;
      		case 7: 
     			listaDuplamenteEncadeada.removeElementoListaDireita();
				listaDuplamenteEncadeada.listarListaImprimir();
			
				break;
          		
      		    case 8: 
				qtd=20;
				break;
			}		
		}while(qtd<10);

		System.out.println("Você saiu do menu!");
	    opcaoUsuario.close();
	}
	public static int recebeIdadeUsuario(Scanner idadeInformada){
		System.out.println("Usuário qual a idade do aluno que você quer adicionar?");
		int dadoRecebido = idadeInformada.nextInt();
		return dadoRecebido;
	}
	public static String recebeNomeUsuario(Scanner nomeInformadoz ){
		System.out.println("Usuário qual o nome do aluno que você quer adicionar?");
		String nomeRecebido = nomeInformadoz.nextLine();
		return nomeRecebido;
	}
	public void adicionarNovoContatoEsquerda(ListaDuplamenteEncadeada listaDuplamenteEncadeada, TestaLista testaLista, String nomeAluno, int idadeAluno) {
		Contato novoAluno = new Contato(idadeAluno, nomeAluno);
		listaDuplamenteEncadeada.AdicionarNaEsquerda(novoAluno);
		System.out.println("Novo aluno adicionado na esquerda!");;
		}
	public void adicionarNovoContatoDireita(ListaDuplamenteEncadeada listaDuplamenteEncadeada, TestaLista testaLista, String nomeAluno, int idadeAluno) {
		Contato novoAluno = new Contato(idadeAluno, nomeAluno);
		listaDuplamenteEncadeada.adicionarNaDireita(novoAluno);
		System.out.println("Novo aluno adicionado na esquerda!");;
		}
}




