package it.corso.shapes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// DIP: These Imports are not necessary as we depend on the same-level interface
// import it.corso.shapes.model.Cerchio;
// import it.corso.shapes.model.Quadrato;
// import it.corso.shapes.model.Rettangolo;

/**
 * @author thimo
 * @version 1.0
 * @created 30-mag-2017 16:14:08
 */
public class Canvas {

	// We use OCP with Strategy Pattern (Same-level Interface)
	// public List<Quadrato> quadrati;
	// public List<Rettangolo> rettangoli;
	// public List<Cerchio> cerchi;
	public List<Shape> forme;
	
	public Canvas() {
		//quadrati = new ArrayList<>();
		//rettangoli = new ArrayList<>();
		//cerchi = new ArrayList<>();
		
		forme = new ArrayList<Shape>();
	}

	public void finalize() throws Throwable {

	}
	
	
	/**
	 * Restituisce il numero di forme contenute dal canvas
	 * 
	 * @return
	 */
	public int size() {
		//return quadrati.size() + rettangoli.size() + cerchi.size();
		return forme.size();
	}

	// All this methods can be refactored in OCP
	/*public void add(Rettangolo r) {
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
	}*/
	
	// OCP: accepts any class implementing Shape interface
	public void add(Shape s) {
		forme.add(s);
	}
	

	/**
	 * This can be tested via Unit Test after refactoring, without changing tests
	 * @return
	 */
	public double calcolaAreaTotale() {
		// This get refactored via OCP
		double totalArea = 0;
		/*for(Quadrato q: quadrati) {
			totalArea += q.calcolaArea();
		}
		for(Shape ce: cerchi) {
			totalArea += ce.calcolaArea();
		}
		for(Rettangolo r: rettangoli) {
			totalArea += r.calcolaArea();
		}*/
		for(Shape s: forme) {
			totalArea += s.calcolaArea();
		}
		return totalArea;
	}

}
