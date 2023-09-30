package entities;

import entities.enums.Color;

public class Circulo extends Shape{

	private Double raio;
	
	public Circulo() {
		
	}

	public Circulo(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}

	public Double getCircunference() {
		return raio;
	}

	public void setCircunference(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		
		return Math.PI * raio*raio;
	}

}
