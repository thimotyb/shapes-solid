package it.corso.shapes.model;


/**
 * @author thimo
 * @version 1.0
 * @created 30-mag-2017 16:14:50
 */
public class Rettangolo {

	private int larghezza;
	private int altezza;

	public Rettangolo(){

	}

	public Rettangolo(int height, int width) {
		this.larghezza = width;
		this.altezza = height;
	}

	public void finalize() throws Throwable {

	}

	public double calcolaArea() {
		// TODO Auto-generated method stub
		return new Double(larghezza*altezza); // Check Sonarlint's suggestion on casting int to double
	}

}