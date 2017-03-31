package br.com.escola.modelo;

public class Nota {

	private double nota;

	public Nota(double nota) {
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() { 
		return "Nota: " + nota;
	}
}
