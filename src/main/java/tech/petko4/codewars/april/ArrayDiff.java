package tech.petko4.codewars.april;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
	/*
	 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

	  It should remove all values from list a, which are present in list b keeping their order.

		array_diff({1, 2}, 2, {1}, 1, *z) == {2} (z == 1)
		If a value is present in b, all of its occurrences must be removed from the other:
		
		array_diff({1, 2, 2, 2, 3}, 5, {2}, 1, *z) == {1, 3} (z == 2)
	 */
	
	public static int[] arrayDiff(int[] a, int[] b) {
		List<Integer> blist = Arrays.stream(b)
									.boxed()
									.collect(Collectors.toList());
		
		return Arrays.stream(a)
				.filter(value -> !blist.contains(value))
				.toArray();
	}
}
