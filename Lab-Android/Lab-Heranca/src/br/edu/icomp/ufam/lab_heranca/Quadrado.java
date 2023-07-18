package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {
	public Quadrado(int posX, int posY, double lado) {
		super(posX, posY, lado, lado);
	}
	
	public String toString() {
		double area = getArea();
		double p = getPerimetro();
		
		String aux = "Quadrado na posição (" + posX + ", " + posY + ") com lado de " + largura + "cm (área=" + area + "cm2, perímetro=" + p + "cm)" ;
	
		return aux;
	}
}
