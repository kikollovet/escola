package br.com.escola.teste;

import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Nota;
import br.com.escola.modelo.Turma;

public class TestaTurma {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Luis", 123);
		Aluno a2 = new Aluno("Pedro", 321);
		Aluno a1Copia = new Aluno("Jos�", 123);
		
		a1.adicionaNota(new Nota(9));
		
		a2.adicionaNota(new Nota(7));
		
		Turma turma = new Turma();
		
		System.out.println("O primeiro aluno foi adicionado?");
		System.out.println(turma.adicionaAluno(a1));
		System.out.println("O segundo aluno foi adicionado?");
		System.out.println(turma.adicionaAluno(a2));
		System.out.println("O aluno copia (mesmo n�mero de matricula) foi adicionado?");
		System.out.println(turma.adicionaAluno(a1Copia));
		
		System.out.println(turma);
		
		
	}

}
