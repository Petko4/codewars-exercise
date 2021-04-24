package tech.petko4.codewars.april;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MatchSubstTest {

	 private static void dotest(String s, String prog, String version, String exp) {
	        System.out.println("s:\n" + s);
	        System.out.println("prog: " + prog);
	        System.out.println("version: " + version);
	        String ans = MatchSubst.change(s, prog, version);
	        System.out.println("Actual: " + ans);
	        System.out.println("Expect: " + exp);
	        assertEquals(exp, ans);
	    }
	    @Test
	    public void test() {
	        String s1="Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-0091\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha";
	        dotest(s1, "Ladder", "1.1", "Program: Ladder Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 1.1");
	        String s11="Program title: Hammer\nAuthor: Tolkien\nCorporation: IB\nPhone: +1-503-555-0090\nDate: Tues March 29, 2017\nVersion: 2.0\nLevel: Release";
	        dotest(s11, "Balance", "1.5.6", "Program: Balance Author: g964 Phone: +1-503-555-0090 Date: 2019-01-01 Version: 2.0");
	        String s12="Program title: Primes\nAuthor: Kern\nCorporation: Gold\nPhone: +1-503-555-009\nDate: Tues April 9, 2005\nVersion: 6.7\nLevel: Alpha";
	        dotest(s12, "Ladder", "1.1", "ERROR: VERSION or PHONE");
	        
	    }
}
