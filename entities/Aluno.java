package entities;

public class Aluno {

	private String nome;
	private String nomeMae;
	private String nomePai;
	private Integer idade;

	private Avaliacao avaliacoes;

	private Presenca presenca;

	public Aluno(String nome, String nomeMae, String nomePai, Integer idade, Avaliacao avaliacoes, Presenca presenca) {
		super();
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.idade = idade;
		this.avaliacoes = avaliacoes;
		this.presenca = presenca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Avaliacao getAvaliacoes() {
		return avaliacoes;
	}

	public Presenca getPresenca() {
		return presenca;
	}

	public void dadosAluno() {
		System.out.println("Nome: " + nome + ", Idade: " + idade);
		System.out.println("Mãe: " + nomeMae + ", Pai: " + nomePai);
	}

	public void resultadoAvaliacao() {
		if ((avaliacoes.getProva1() + avaliacoes.getProva2())/2 >= 6.0) {
			System.out.println("Aprovado por nota");
		} else {
			System.out.println("Reprovado por nota");
		}
	}

	public void resultadoTrabalhos() {
		if((avaliacoes.getTrab1() + avaliacoes.getTrab2()) / 2 >= 6 ) {
			System.out.println("Trabalhos aprovados");
		} else {
			System.out.println("Trabalhos não aceitos!");
		}
	}

	public void resultadoMediaGeral() {
		if ((avaliacoes.getProva1() + avaliacoes.getProva2() + avaliacoes.getTrab1() + avaliacoes.getTrab2()) / 4 >= 6.0) {
			System.out.println("Aprovado por media");
	} else {
		System.out.println("Reprovado por media");

	}
  }	
}
