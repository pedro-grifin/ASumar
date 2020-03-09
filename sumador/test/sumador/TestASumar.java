package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	 @Test
	    public void testUnaCifra() {
	        ASumar sumi = new ASumar("5");
	        String resultado = sumi.mostrar();
	        assertEquals("5 = 5",resultado );
	    }
	 
	 @Test
	 public void testValorNegativo() {
			ASumar sumi = new ASumar("-7");
	        String resultado = sumi.mostrar();
	        assertEquals(null,resultado );
		 
	 }
	 
	 @Test
	 public void testTotal() {
			ASumar sumi = new ASumar("27");
	        int resultado = sumi.total();
	        assertEquals(9,resultado );
	 }
	 
	 @Test
	 public void testMasDeUnDigito() {
		 ASumar sumi = new ASumar("27");
	        String resultado = sumi.mostrar();
	        assertEquals("2 + 7 = 9",resultado );
		 
	 }
	

}
