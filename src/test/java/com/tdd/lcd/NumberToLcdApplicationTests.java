package com.tdd.lcd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class NumberToLcdApplicationTests {

	@Test
    public void exist_method() throws Exception {
		String res = Drawer.ToLCDNumber(0);
		assertTrue(!res.isEmpty());

    }
	@Test
	public void test_1() throws Exception {
		assertEquals(
				"   \n"
						+ "  |\n"
						+ "  |", Drawer.ToLCDNumber(1));
	}
	@Test
    public void test_2() throws Exception {
		assertEquals(
                " _ \n"
                + " _|\n"
                + "|_ ", Drawer.ToLCDNumber(2));
    }
	@Test
	public void test_77() throws Exception {
		assertEquals(" _  _ \n" + 
				"  |  |\n" + 
				"  |  |", Drawer.ToLCDNumber(77));
	}

}
