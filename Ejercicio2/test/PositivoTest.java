import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PositivoTest {

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
	public void testEspositivo() {
		
		Positivo pos = new Positivo();
		
		boolean positivo;
		
		positivo = pos.espositivo(0);
		assertTrue(positivo);
		
		positivo = pos.espositivo(1);
		assertTrue(positivo);

		positivo = pos.espositivo(-1);
		assertFalse(positivo);

		
	}

}
