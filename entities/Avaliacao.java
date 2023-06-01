package entities;

public class Avaliacao {
	private double prova1;
	private double prova2;
	private double trab1;
	private double trab2;
	
	
	public Avaliacao(double prova1, double prova2, double trab1, double trab2) {
		super();
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.trab1 = trab1;
		this.trab2 = trab2;
	}


	public double getProva1() {
		return prova1;
	}


	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}


	public double getProva2() {
		return prova2;
	}


	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}


	public double getTrab1() {
		return trab1;
	}


	public void setTrab1(double trab1) {
		this.trab1 = trab1;
	}


	public double getTrab2() {
		return trab2;
	}


	public void setTrab2(double trab2) {
		this.trab2 = trab2;
	}
	
	public double mediaProvas() {
		return (prova1 + prova2) / 2;
	}
	
	public double mediaTrab() {
		return (trab1 + trab2) / 2;
	}
	
	
}
