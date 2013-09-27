package fr.lidodo.plane;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PlaneTest {

	@Test
	public void test15(){
		Plane actual = new Plane(15);
		assertEquals(Arrays.asList(15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1), actual.getFlightSequence());
		assertEquals(18,actual.getTotalFlightTime());
		assertEquals(11, actual.getFlightTime());
		assertEquals(160, actual.getMaxHeight());
	}



	@Test
	public void testNewPlane_WithNameEnterprise_Expected1057(){
		Plane actual = new Plane("Enterprise");
		assertEquals(1057,actual.getInitialNumber());
	}

	@Test
	public void testNewPlane_WithNameFauconMillenium_Expected1544(){
		Plane actual = new Plane("FauconMillenium");
		assertEquals(1544,actual.getInitialNumber());
	}

}
