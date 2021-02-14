package cs265;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void editDistance_basicTest1() {
		assertEquals(CS265_Lab_W03.editDistance("Software", "Hardware"),
				4);	
		}
	@Test
	public void editDistance_basicTest2() {
		assertEquals(CS265_Lab_W03.editDistance("Softball", "Hardball"),
				4);	
		}
	@Test
	public void editDistance_basicTest3() {
		assertEquals(CS265_Lab_W03.editDistance("Software", "Curtain"),
				6);	
		}
	@Test
	public void editDistance_basicTest4() {
		assertEquals(CS265_Lab_W03.editDistance("Software", "Hardware"),
				1);	
		}
	@Test
	public void editDistance_basic5() {
		assertEquals(CS265_Lab_W03.editDistance("Dog", "Cat"),
				1);	
		}
	@Test
	public void editDistance_basicTest6() {
		assertEquals(CS265_Lab_W03.editDistance("Software", "Hardware"),
				2);	
		}
  }



