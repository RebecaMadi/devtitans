package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {

	public double raio;
	
	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2.0*Math.PI*raio;
	}
	
	public String toString() {
		double area = getArea();
		double p = getPerimetro();
		
		String aux = "Círculo na posição (" + posX + ", " + posY + ") com raio de " + raio + "cm ";
		aux += "(área=" + area + "cm2, perímetro=" + p + "cm)";
		
		return aux;
	}

}
