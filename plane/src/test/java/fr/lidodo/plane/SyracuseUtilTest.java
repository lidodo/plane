package fr.lidodo.plane;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SyracuseUtilTest {

	@Test
	public void test15(){
		List<Integer> expected = Arrays.asList(15, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1);
		assertEquals(expected, SyracuseUtil.compute(new ArrayList<Integer>(), 15));
	}

}
