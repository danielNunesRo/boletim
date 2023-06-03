package entities;

public class Prova {
	
	private String disciplina;
	private double nota1;
	private double nota2;
	
	private Aluno aluno;
	
	public Prova () {
		
	}
	
	

	public Prova(String disciplina, double nota1, double nota2, Aluno aluno) {
		super();
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.aluno = aluno;
	}


	
	
	public String getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}



	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public Aluno getAluno() {
		return aluno;
	}



	@Override
	public String toString() {
		return "Prova [disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2=" + nota2 + ", aluno=" + aluno + "]";
	}
	
	public double mediaNotas() {
		return (nota1 + nota2)/2;
	}
	
	
}
