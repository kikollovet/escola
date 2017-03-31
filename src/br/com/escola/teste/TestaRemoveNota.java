package br.com.escola.teste;

import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Nota;

public class TestaRemoveNota {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("João", 3434);
		
		Nota notaFisica = new Nota(10);
		Nota notaQuimica = new Nota(8);
		Nota notaMatematica = new Nota(7.5);
		
		aluno.adicionaNota(notaFisica);
		aluno.adicionaNota(notaQuimica);
		aluno.adicionaNota(notaMatematica);
		
		System.out.println(aluno);
		
		aluno.removeNota(0);
		
		System.out.println("\nDepois de remover....");
		
		System.out.println(aluno);
		
	}
}
