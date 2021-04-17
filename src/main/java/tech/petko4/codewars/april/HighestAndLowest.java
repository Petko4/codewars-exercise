package tech.petko4.codewars.april;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class HighestAndLowest {

	/*
	In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
	
	Example:
	highAndLow("1 2 3 4 5")  // return "5 1"
	highAndLow("1 2 -3 4 5") // return "5 -3"
	highAndLow("1 9 3 4 -5") // return "9 -5"
	
	Notes:
	All numbers are valid Int32, no need to validate them.
	There will always be at least one number in the input string.
	Output string must be two numbers separated by a single space, and highest number is first.
	*/
	
	public static String highAndLow(String numbers) {
		
		IntSummaryStatistics summary = Arrays
				.stream(numbers.split(" "))
				.collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
		
		return String.format("%d %d", summary.getMax(), summary.getMin());
		
//		String[] splitted = numbers.split(" ");
//		String min = splitted[0]; 
//		String max = splitted[0];
//		
//		for(String s : splitted) {
//			if(Integer.parseInt(s) > Integer.parseInt(max)) {
//				max = s;
//			}
//			if(Integer.parseInt(s) < Integer.parseInt(min)) {
//				min = s;
//			}
//		}
//		return max + " " + min;
	}
}
