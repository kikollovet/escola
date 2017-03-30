package br.com.escola.modelo;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;

public class Turma {

	Set<Aluno> alunos = new HashSet<>();
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}
	
	public boolean adicionaAluno(Aluno aluno){
		return this.alunos.add(aluno);
	}
	
	@Override
	public String toString() {
		return "Alunos: " + alunos;
	}
}
