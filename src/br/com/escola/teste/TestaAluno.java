package br.com.escola.teste;

import java.util.List;

import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Nota;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Pedro", 123);
		Aluno a2 = new Aluno("Pedro", 321);
		
		//a1.adicionarNota(new Nota(7), new Nota(9), new Nota(8));
		
		a2.adicionarNota(new Nota(9), new Nota(7), new Nota(8));
		
		Nota notaFisica = new Nota(9);
		Nota notaMatematica = new Nota(10);
		Nota notaQuimica = new Nota(8.5);
		
		aluno.adicionaNota(notaFisica);
		aluno.adicionaNota(notaMatematica);
		aluno.adicionaNota(notaQuimica);
		
		System.out.println(aluno.getNotas().contains(notaFisica));
		
		System.out.println(aluno);
		
		Nota nota = aluno.getNotas().get(0);
		System.out.println(nota);
		
		aluno.removeNota(0);
		
		aluno.alteraNota(8.5, 0);
		
		System.out.println(aluno);
		

	}

}
