package it.corso.shapes;

import java.util.ArrayList;
import java.util.List;

import it.corso.shapes.model.Cerchio;
import it.corso.shapes.model.Quadrato;
import it.corso.shapes.model.Rettangolo;

/**
 * @author thimo
 * @version 1.0
 * @created 30-mag-2017 16:14:08
 */
public class Canvas {

	public List<Quadrato> quadrati;
	public List<Rettangolo> rettangoli;
	public List<Cerchio> cerchi;

	public Canvas() {
		quadrati = new ArrayList<>();
		rettangoli = new ArrayList<>();
		cerchi = new ArrayList<>();
	}

	public void finalize() throws Throwable {

	}
	
	
	/**
	 * Restituisce il numero di forme contenute dal canvas
	 * 
	 * @return
	 */
	public int size() {
		return quadrati.size() + rettangoli.size() + cerchi.size();
	}

	// Added these methods using Ctrl+1 quick fix on the Test source
	public void add(Rettangolo r) {
		// TODO Auto-generated method stub
		rettangoli.add(r);
	}

	public void add(Cerchio ce) {
		// TODO Auto-generated method stub
		cerchi.add(ce);
	}

	public void add(Quadrato q) {
		// TODO Auto-generated method stub
		quadrati.add(q);
	}

}
