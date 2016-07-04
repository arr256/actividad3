import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CadenasTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNoesta() {
		
		String cadena1 = "Hola";
		String cadena2 = "Almeria";
		String cadena3 = "Si";
		String cadena4 = "Senti";
		
		String resultado = Cadenas.Noesta(cadena1, cadena2);
		assertEquals(resultado,"Ho");
		
		
		resultado = Cadenas.Noesta(cadena3, cadena3);
		assertEquals(resultado, "");
		
		resultado = Cadenas.Noesta(cadena1, cadena4);
		assertEquals(resultado, "Hola");
		
		

		
	}

}
