package tech.petko4.codewars.april;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class HighestAndLowestTest {

	@Test
	void test() {
		assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
		assertEquals("5 1", HighestAndLowest.highAndLow("1 2 3 4 5"));
		assertEquals("5 -3", HighestAndLowest.highAndLow("1 2 -3 4 5"));
		assertEquals("9 -5", HighestAndLowest.highAndLow("1 9 3 4 -5"));
	}
}
