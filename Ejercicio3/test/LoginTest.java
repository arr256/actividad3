import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest {

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
	public void testLog() {
		//1
		Login logi = new Login();
		
		String user1 = "";
		String user2 = "Antonio";
		String user3 = "Juan Francisco Martinez Martinez Martinez";
		
		String pass1= "";
		String pass2= "123";
		String pass3 = "123456789123456789123456789123456789";
		
		boolean resultado1 = logi.log(user1, pass1); //Null user pass
		
		
		resultado1 = logi.log(user2, pass1); // Null pass
		assertFalse(resultado1);

		
		resultado1 = logi.log(user2, pass2); //Login normal
	    assertTrue(resultado1);

		resultado1 = logi.log(user3, pass2); //User largo pass normal
		assertFalse(resultado1);

		resultado1 = logi.log(user2, pass3); //User normal pass largo
		assertFalse(resultado1);

		resultado1 = logi.log(user2, user2); // Iguales
		assertFalse(resultado1);
	}

}
