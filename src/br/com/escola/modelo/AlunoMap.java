package br.com.escola.modelo;

import java.util.HashMap;
import java.util.Map;

public class AlunoMap {

	private String nome;
	private int numeroMatricula;
	Map<Materia, Nota> boletim = new HashMap<>();

	public AlunoMap(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public Map<Materia, Nota> getBoletim() {
		return boletim;
	}

	public void adicionaNota(Materia materia, Nota nota) {
		boletim.put(materia, nota);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroMatricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoMap other = (AlunoMap) obj;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.nome + "\nMatricula: " + this.numeroMatricula + "\nNotas: " + this.boletim;
	}

}
