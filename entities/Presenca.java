package entities;

public class Presenca {
	private int diasPres;
	private int diasFalt;
	
	public Presenca(int diasPres, int diasFalt) {
		super();
		this.diasPres = diasPres;
		this.diasFalt = diasFalt;
	}

	public int getDiasPres() {
		return diasPres;
	}

	public void setDiasPres(int diasPres) {
		this.diasPres = diasPres;
	}

	public int getDiasFalt() {
		return diasFalt;
	}

	public void setDiasFalt(int diasFalt) {
		this.diasFalt = diasFalt;
	}
	
	public double presention() {
		return diasPres / 2;
	}
	
	public double falta() {
		return diasFalt / 2;
	}
	
	
	
	
}
