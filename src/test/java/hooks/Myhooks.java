package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Myhooks {

	@Before
	public void setup() {
		System.out.println("Before Hook");
	}
	
	@After
	public void tearDown() {
		System.out.println("After Hook");
	}
}
