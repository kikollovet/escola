package br.com.escola.teste;

import java.util.List;

import br.com.escola.modelo.Aluno;
import br.com.escola.modelo.Nota;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Luis", 123);
		Aluno a2 = new Aluno("Pedro", 321);
		
		a1.adicionarNota(new Nota(7), new Nota(9), new Nota(8));
		
		a2.adicionarNota(new Nota(9), new Nota(7), new Nota(8));
		
		System.out.println(a1);
		
		List<Nota> notas = a1.getNotas();
		notas.add(2, new Nota(10));
		
		System.out.println(notas);

	}

}
