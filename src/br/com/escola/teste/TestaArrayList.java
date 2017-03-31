package br.com.escola.teste;

import java.util.ArrayList;
import java.util.List;

public class TestaArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		String notaGeografia = "8,5";
		
		lista.add(notaGeografia);
		//lista.add(lista);
		
		System.out.println(lista);
	}
}
