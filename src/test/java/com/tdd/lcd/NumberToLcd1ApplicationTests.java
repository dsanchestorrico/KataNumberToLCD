package com.tdd.lcd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


@SpringBootTest
class NumberToLcd1ApplicationTests {

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

}
