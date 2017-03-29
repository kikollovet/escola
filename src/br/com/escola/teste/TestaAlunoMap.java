package br.com.escola.teste;

import br.com.escola.modelo.AlunoMap;
import br.com.escola.modelo.Materia;
import br.com.escola.modelo.Nota;

public class TestaAlunoMap {

	public static void main(String[] args) {
		
		Materia fisica = new Materia("Física");
		Materia quimica = new Materia("Quimica");
		Materia matematica = new Materia("Matemática");
		
		Nota notaFisica = new Nota(10);
		Nota notaQuimica = new Nota(7);
		Nota notaMatematica = new Nota(8);
		
		AlunoMap aluno = new AlunoMap("João", 123);
		aluno.adicionaNota(fisica, notaFisica);
		aluno.adicionaNota(quimica, notaQuimica);
		aluno.adicionaNota(matematica, notaMatematica);
		
		System.out.println(aluno);
	}
}
