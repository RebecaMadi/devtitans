package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	
	public double largura;
	public double altura;
	
	public Retangulo(int posX, int posY, double largura, double altura) {
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return largura*altura;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2.0*(altura+largura);
	}

	public String toString() {
		double area = getArea();
		double p = getPerimetro();
		
		String aux = "Retângulo na posição (" + posX + ", " + posY + ") com largura de " + largura + "cm e altura de " + altura + "cm ";
		aux += "(área=" + area + "cm2, perímetro=" + p + "cm)";
		return aux;
	}
}
