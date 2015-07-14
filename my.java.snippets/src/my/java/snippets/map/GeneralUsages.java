package my.java.snippets.map;

import java.util.HashMap;

public class GeneralUsages {

	/**
	 * Clearing a Map is better than changing the ref. Even if clearing takes
	 * more time than the "new" but with the "new" with should count the GC
	 * collecting the Map and its content !
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		measureClearingAMap();
		measureReplacingAMap();
	}

	private static void measureClearingAMap() {
		HashMap<Integer, Object> map = new HashMap<>();
		System.out.println("Max: " + Integer.MAX_VALUE);
		for (int i = 0; i < 1000; i++)
			map.put(i, "A" + i);

		long t0 = System.nanoTime();
		map.clear();
		long t1 = System.nanoTime();
		long elapsed = t1 - t0;
		System.out.println("clear() took " + elapsed + " nanoseconds");
	}

	private static void measureReplacingAMap() {
		HashMap<Integer, Object> map = new HashMap<>();
		System.out.println("Max: " + Integer.MAX_VALUE);
		for (int i = 0; i < 1000; i++)
			map.put(i, "A" + i);

		long t0 = System.nanoTime();
		map = new HashMap<>();
		long t1 = System.nanoTime();
		long elapsed = t1 - t0;
		System.out.println("new Map " + elapsed + " nanoseconds");
	}
}
