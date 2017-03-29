package br.com.escola.teste;

import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Nota;
import br.com.escola.modelo.Turma;

public class TestaTurma {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Luis", 123);
		Aluno a2 = new Aluno("Pedro", 321);
		Aluno a1Copia = new Aluno("José", 123);
		
		a1.adicionarNota(new Nota(9), new Nota(8), new Nota(5));
		
		a2.adicionarNota(new Nota(7), new Nota(10), new Nota(7.5));
		
		Turma turma = new Turma();
		
		System.out.println("O primeiro aluno foi adicionado?");
		System.out.println(turma.adicionarAluno(a1));
		System.out.println("O segundo aluno foi adicionado?");
		System.out.println(turma.adicionarAluno(a2));
		System.out.println("O aluno copia (mesmo número de matricula) foi adicionado?");
		System.out.println(turma.adicionarAluno(a1Copia));
		
		System.out.println(turma);
		
		
	}

}
