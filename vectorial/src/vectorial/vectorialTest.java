package vectorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class vectorialTest {
	
	vectorial vectorial=new vectorial();
	
	int v1[]= {5,5,5};
	int v2[]= {2,2,2};
	int v3[]= {1,1,1};
	int v4[]= {1,2,3};
	int v5[]= {1,1,1,1};
		
/*test funcional*/
	/*test Error*/
	@Test
	public void testSuma() {
		vectorial.sumatorio(v1, v2);
		int resultado1[]=vectorial.getResultado();
		int esperado1[]= {7,7,7};
		assertArrayEquals(esperado1,resultado1);
	
		vectorial.sumatorio(v1, v2 ,v3);
		int resultado2[]=vectorial.getResultado();
		int esperado2[]= {8,8,8};
		assertArrayEquals(esperado2,resultado2);
			int error[]= {7,7,8};
			assertArrayEquals(error,resultado2);
	}
	
	@Test
	public void testErrorSuma() {
		vectorial.sumatorio(v1, v2);
		int resultado1[]=vectorial.getResultado();
			int error[]= {7,7,8};
			assertArrayEquals(error,resultado1);
	
	}
	
	@Test
	public void testResta() {
		vectorial.resta(v1, v2);
		int resultado1[]=vectorial.getResultado();
		int esperado1[]= {3,3,3};
		assertArrayEquals(esperado1,resultado1);
		
		vectorial.resta(v1, v2 ,v3);
		int resultado2[]=vectorial.getResultado();
		int esperado2[]= {2,2,2};
		assertArrayEquals(esperado2,resultado2);
			int error[]= {7,7,8};
			assertArrayEquals(error,resultado2);
	}
	
	@Test
	public void testErrorResta() {
		vectorial.resta(v1, v2);
		int resultado1[]=vectorial.getResultado();
			int error[]= {7,7,8};
			assertArrayEquals(error,resultado1);
	}
	

	@Test
	public void testMultiplicacion() {
		vectorial.multiplicacio(v1, v2);
		int resultado1[]=vectorial.getResultado();
		int esperado1[]= {10,10,10};
		assertArrayEquals(esperado1,resultado1);
		
		vectorial.multiplicacio(v1, v2 ,v3);
		int resultado2[]=vectorial.getResultado();
		int esperado2[]= {10,10,10};
		assertArrayEquals(esperado2,resultado2);
			int error[]= {7,7,8};
			assertArrayEquals(error,resultado2);
	}
	@Test
	public void testErrorMultiplicacion() {
		vectorial.multiplicacio(v1, v2);
		int resultado1[]=vectorial.getResultado();
			int error[]= {7,7,8};
			assertArrayEquals(error,resultado1);}
	
	
	@Test
	public void testInvertir() {
		vectorial.invertir( v4);
		int resultado1[]=vectorial.getResultado();
		int esperado1[]= {3,2,1};
		assertArrayEquals(esperado1,resultado1);
			int error[]= {7,7,8};
			assertArrayEquals(error,resultado1);
	}
	
	@Test
	public void testTotal() {
		
		int resultado1=vectorial.total( v4);
		int esperado1=6;
		assertEquals(esperado1,resultado1);
			int error= 99;
			assertEquals(error,resultado1);
	}
	
		
	
	/*excepcions correctes*/
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ExcepSuma1() {
		vectorial.sumatorio(v1, v5);
	}
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ExcepSuma2() {
		vectorial.sumatorio(v1, v2, v5);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ExcepResta1() {
		vectorial.resta(v1, v5);
	}
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ExcepResta2() {
		vectorial.resta(v1, v2, v5);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ExcepMultiplicar1() {
		vectorial.multiplicacio(v1, v5);
	}
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void ExcepMultiplicar2() {
		vectorial.multiplicacio(v1, v2, v5);
	}
	
}
