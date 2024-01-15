package it.corso.shapes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.corso.shapes.Canvas;
import it.corso.shapes.model.Cerchio;
import it.corso.shapes.model.Quadrato;
import it.corso.shapes.model.Rettangolo;


public class ShapesTest {

	private Canvas c;
	private Rettangolo r;
	private Cerchio ce;
	private Quadrato q;

	@Before
	public void setup() {		
		int height = 4;
		int width = 5;
		int lato = 6;
		int radius = 2;
		
		c = new Canvas();	
		r = new Rettangolo(height, width);
		ce = new Cerchio(radius);
		q = new Quadrato(lato);
	}
	
	@Test
	public void shouldAddShapeToCanvas() {		
				
		// Voglio aggiungere la forma al canvas
		c.add(r);
		
		// Verifico che il canvas contiene 1 forma
		assertEquals("Il canvas ha una forma", 1, c.size());		 		
	}
	
	@Test
	public void shouldAddAllShapesToCanvas() {
		
		c.add(r);
		c.add(ce);
		c.add(q);
		
		// Asserisco che ci sono 3 forme
		assertEquals("Ci sono tre forme", 3, c.size());
		
	}

	@Test
	public void shouldCalculateAreaOnShape() {
	
		int area = r.calcolaArea();		
		assertTrue("L'area non � nulla", area>0);
		
		int areaCerchio = ce.calcolaArea();
		assertTrue("L'area del cerchio non � nulla", areaCerchio>0);
		
		int areaQuadrato = q.calcolaArea();
		assertTrue("L'area del quadrato non � nulla", areaQuadrato>0);
		
	}

}
