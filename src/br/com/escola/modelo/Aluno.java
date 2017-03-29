package br.com.escola.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	private List<Nota> notas = new ArrayList<>();
	
	public Aluno(String nome, int numeroMatricula){
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public List<Nota> getNotas() {
		return Collections.unmodifiableList(this.notas);
	}
	
	public void adicionaNota(Nota nota){
		this.notas.add(nota);
	}
	
	public void adicionarNota(Nota notaMatematica, Nota notaFisica, Nota notaQuimica){
		this.notas.add(notaMatematica);
		this.notas.add(notaFisica);
		this.notas.add(notaQuimica);
	}
	
	public void removeNota(int index){
		this.notas.remove(index);
	}
	
	public Nota getNotaEspecifica(int index){
		return this.notas.get(index);
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
		Aluno other = (Aluno) obj;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + this.nome + "\nMatricula: " + this.numeroMatricula + "\nNotas: " + this.notas;
	}
}
