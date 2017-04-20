package cert.java8.classstruct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ClassStructure {
	private static String s;
	int count;

	public ClassStructure() {
		count = 4;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10;) {
			i = i++;
			System.out.println(" Hello World");
		}

		ClassStructure c1 = new ClassStructure();
		ClassStructure c2 = null;
		Object N = null;

		float f1 = (int) 1;
		float f3 = (float) Float.MAX_VALUE;
		boolean b2 = Float.isInfinite(f3 + 200);
		long x3 = 3;
		long I = x3 = 34;
		boolean a = true;
		boolean b = false;
		Boolean f = a & b;
		Boolean f2 = a && b;

		if (c2 != null && c2.equals(c1)) {
			System.out.println();
		}
		int x = 6;
		boolean y = x >= 6 || x++ > 1;
		System.out.println(x); // prints 6 !

		int bs = 4;
		final int i4 = 4;

		switch (bs) {
		default:
			System.out.println("default");
			// break;
		case 34:
			System.out.println("equal to i4");
		case 40:
			System.out.println("equal to i4");
		}
		for (int x5 = 0, y5 = 0; y5 > 10 && x5 > 0; x5++) {

		}
		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 },
				{ 5, 7, 12, 7 } };

		OUTER: for (int[] array : myComplexArray) {
			char c3 = 'a';
			for (int j : array) {
				// System.out.println("c3"+(char)c3++);
				System.out.print(j + "\t");

			}
			System.out.println();

		}

		System.out.println("Max :" + "Max".charAt(2));
		String alpha = "ABCDAF";
		System.out.println("ABCDAF :" + alpha.indexOf('A', 1));
		System.out.println("ABCDAF :" + alpha.substring(1, alpha.length()));
		System.out.println("... :" + "01234".substring(1, 3));
		System.out.print("I :" + I);

		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("B");

		String res = sb2.toString().replace(sb2, sb1);
		System.out.println(res);
		System.out.println("\tA ".trim());
		StringBuilder sbEmpty = new StringBuilder(10);
		System.out.println(sbEmpty.capacity());
		System.out.println(sb1.capacity());

		StringBuilder sb3 = new StringBuilder("ABCD").insert(2, Boolean.TRUE);
		System.out.println(sb3.charAt(1));
		System.out.println(sb3.insert(2, Boolean.FALSE));

		StringBuilder sb4 = new StringBuilder("ABCD");
		sb4.deleteCharAt(2);
		System.out.println(sb4);
		System.out.println("============================");
		String s1 = "Assalam 3alaykum";
		String s2 = " Assalam 3alaykum".trim();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);

		StringBuilder sb5 = new StringBuilder("A");
		StringBuilder sb6 = new StringBuilder("A");
		System.out.println(sb5.equals(sb6));

		char[] chars = { 'e' };
		boolean x2 = chars instanceof Object;
		System.out.println(x2); // TRUE

		char[] arrayChar = new char[] {};
		for (int j = 0; j < arrayChar.length; j++) {
			System.out.println(arrayChar[j]);
		}
		// BETTER :
		Arrays.toString(arrayChar);

		Boolean bbb[] = new Boolean[5];
		System.out.println(Arrays.toString(bbb));

		Object[] refs = bbb;
		// refs[0] = 4; // Exception in thread "main"
		// java.lang.ArrayStoreException: java.lang.Integer

		int numbers[] = { 10, 4, 9, 3 };
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));

		String numbers2[] = { "10", "4", "9", "3" };
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));

		System.out.println(Arrays.binarySearch(numbers, 3)); // search for 3 in
																// a SORTED!!
																// array
		System.out.println(Arrays.binarySearch(numbers, 1));

		LocalDateTime d = LocalDateTime.of(2015, 9, 13, 12, 10, 54, 8937);
		LocalDateTime d1 = LocalDateTime.now();
		System.out.println(d);
		System.out.println(d1);

	}

}
