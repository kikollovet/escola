package br.com.escola.teste;

import java.util.ArrayList;

import br.com.escola.modelo.Array;
import br.com.escola.modelo.Nota;

public class TestaArrayDouble {

	public static void main(String[] args) {
		
		Double[] notas = new Double[7];
		
		double nota1 = 8.5;
		notas[0] = nota1;
		
		System.out.println(notas);
		
		Nota[] notas2 = new Nota[7];
		notas2[0] = new Nota(8.5);
		for(int i = 0; i < notas2.length; i++){
			System.out.print(notas2[i] + ", ");
		}
		
		ArrayList<Double> lista = new ArrayList<>();
		lista.add(8.5);
		lista.add(7.0);
		System.out.println(lista);
		
		Array array = new Array();
		array.adiciona(8.5);
		array.adiciona(7.6);
		
		System.out.println(array);
		
		for(int i = 0; i < array.getNotas().length; i++){
			
			if(array.getNotas()[i] != null){
				System.out.print(array.getNotas()[i]);
			}
		}
		
	}
}
