package fr.lidodo.plane;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharLenghtUtilTest {

	@Test
	public void testEnterprise(){
		int expected = 1057;
		int actual = CharLenghtUtil.compute("Enterprise");
		assertEquals(expected, actual);
	}

	@Test
	public void testFauconMillenium(){
		int expected = 1544;
		int actual = CharLenghtUtil.compute("FauconMillenium");
		assertEquals(expected, actual);
	}

}
