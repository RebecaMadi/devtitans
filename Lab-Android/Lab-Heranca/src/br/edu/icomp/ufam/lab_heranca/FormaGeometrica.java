package br.edu.icomp.ufam.lab_heranca;

abstract public class FormaGeometrica {
	public int posX, posY;
	
	public FormaGeometrica(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	public String getPosString(){
		return "posição (" + posX + ", " + posY + ")";
	}
	
	abstract public double getArea();
	
	abstract public double getPerimetro();
}
