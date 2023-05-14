package smarttech.nyc.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import smarttech.nyc.basepage.ParentClass;

public class Hooks extends ParentClass{

	
	@Before
	public void setUp() {
	initialization();
	}
	@After
	public void tearDown() {
	driver.quit();	
	}
}
