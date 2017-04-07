package br.com.escola.teste;

import br.com.escola.modelo.Nota;

public class TestaArray {

	public static void main(String[] args) {
		Nota[] lista = new Nota[10];
		Nota nota = new Nota(8.5);
		lista[1] = nota;
		System.out.println(lista);
	}
}
