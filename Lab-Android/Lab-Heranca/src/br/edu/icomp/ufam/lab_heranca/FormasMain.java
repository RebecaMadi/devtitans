package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
	public static void main(String[] args) {
		FormaGeometrica[] formas = new FormaGeometrica[5];
		
		formas[0] = new Quadrado(1, 2, 3);
		formas[1] = new Retangulo(1, 2, 2, 5);
		formas[2] = new Circulo(1, 2, 5);
		formas[3] = new Quadrado(3, 2, 4);
		formas[4] = new Retangulo(5, 5, 2, 4);
		
		for(int i=0; i<5; i++) {
			System.out.println(formas[i].toString());
		}
	}
}
