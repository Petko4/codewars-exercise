package tech.petko4.codewars.april;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GrowthOfAPopulationTest {

	@Test
	public void test() {
		assertEquals(15, GrowthOfAPopulation.nbYear(1500, 5, 100, 5000));
		assertEquals(10, GrowthOfAPopulation.nbYear(1500000, 2.5, 10000, 2000000));
		assertEquals(94, GrowthOfAPopulation.nbYear(1500000, 0.25, 1000, 2000000));
	}
}
