package br.com.escola.teste;

import br.com.escola.modelo.Aluno;

public class TestaHashCode {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedro", 124);
		Aluno aluno2 = new Aluno("Luis", 123);
		
		System.out.println(aluno1.hashCode());
		System.out.println(aluno2.hashCode());
	}
}
