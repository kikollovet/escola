package br.com.escola.modelo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Turma {

	Set<Aluno> alunos = new HashSet<>();
	
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	
	public boolean adicionarAluno(Aluno aluno){
		return this.alunos.add(aluno);
	}
	
	@Override
	public String toString() {
		return "Alunos: " + alunos;
	}
}
