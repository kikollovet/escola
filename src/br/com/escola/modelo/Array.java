package br.com.escola.modelo;

public class Array {

	Double[] notas = new Double[7];
	int posicao = 0;
	
	public void adiciona(double nota){
		notas[posicao] = nota;
		posicao++;
	}
	
	public Double[] getNotas() {
		return notas;
	}
	
	@Override
	public String toString() {
		return "Notas: " + this.notas[0] + ", " + this.notas [1] + " Posição: " + this.posicao;
	}
}
