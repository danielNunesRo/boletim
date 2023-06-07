package application;

import entities.Aluno;
import entities.Avaliacao;
import entities.Presenca;

public class Program {

	public static void main(String[] args) {
		
		Avaliacao av = new Avaliacao(8.0,7.5,10.0,9.0);
		Presenca pre = new Presenca(150,50);
		Aluno aluno = new Aluno("Lucas Silva","Maria Joaquina","Jose Silva",14,av,pre);
		
		
		aluno.dadosAluno();
		System.out.println("A média de provas do aluno foi: " + aluno.getAvaliacoes().mediaProvas());
		System.out.println("A média de trabalho do aluno foi: " + aluno.getAvaliacoes().mediaTrab());
		System.out.println("Presença: " + aluno.getPresenca().presention() + "%");
		System.out.println("Faltas: " + aluno.getPresenca().falta());
		aluno.resultadoAvaliacao();
		aluno.resultadoTrabalhos();
		aluno.resultadoMediaGeral();
		
		
		
	}

}
