package br.com.escola.teste;

import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Nota;

public class TestaAlunoGetAdd {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno("Luis", 1234);
		
		Nota notaMatematica = new Nota(8.5);
		Nota notaFisica = new Nota(9.5);
		Nota notaQuimica = new Nota(10);
		
		aluno.getNotas().add(notaMatematica);
		aluno.getNotas().add(notaFisica);
		aluno.getNotas().add(notaQuimica);
		
		System.out.println(aluno);
	}
}
