package it.corso.shapes.model;

import it.corso.shapes.Shape;

public class Triangolo implements Shape {

	int base;
	int altezza;
	
	public Triangolo() {}
	
	public Triangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	@Override
	public double calcolaArea() {	
		return (this.base*this.altezza)/2;
	}

	
}
