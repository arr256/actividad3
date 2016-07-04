import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AsteriscoTest {

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
	public void test() {
		Asterisco asterix = new Asterisco();
		
		int x = 3;
		int y= 5;
		int z = -3;
		
		String cadena1 = asterix.TextoAsterisco(x);
		String cadena2 = asterix.TextoAsterisco(y);
		String cadena3 = asterix.TextoAsterisco(z);
		
		assertEquals(cadena1,"***");
		assertEquals(cadena2,"*****");
		assertEquals(cadena3, "numero erroneo");
	}

}
