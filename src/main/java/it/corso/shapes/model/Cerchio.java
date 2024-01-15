package it.corso.shapes.model;

import it.corso.shapes.Shape;

/**
 * @author thimo
 * @version 1.0
 * @created 30-mag-2017 16:15:05
 */
public class Cerchio implements Shape {

	private int raggio;

	public Cerchio(){

	}

	public Cerchio(int radius) {
		this.raggio = radius;
	}

	public void finalize() throws Throwable {

	}

	@Override
	public double calcolaArea() {
		// TODO Auto-generated method stub
		return 3.14*3.14*raggio;
	}

}