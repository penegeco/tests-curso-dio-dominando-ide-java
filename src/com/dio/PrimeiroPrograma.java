package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("jose", "preto", 5);
		Livro livro = new Livro();
		
		System.out.println(gato);
		System.out.println(livro);
	}

}

class Livro {
	public String livro;
	public Integer numPaginas;
}