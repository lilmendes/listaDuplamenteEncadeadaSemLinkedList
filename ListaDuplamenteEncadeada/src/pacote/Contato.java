package pacote;

public class Contato {
	private Integer idade;
	private String nomeAluno;
	public Integer getIdade() {
		return idade;
	}
	public Contato(Integer idade, String nomeAluno) {
		super();
		this.idade = idade;
		this.nomeAluno = nomeAluno;
	}
		
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
}
