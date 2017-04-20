package snippets.map;

import java.util.HashMap;

public class GeneralUsages {

	private static final int NB_ELTS = 10_000;

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
		for (int i = 0; i < NB_ELTS; i++)
			map.put(i, "A" + i);

		long t0 = System.nanoTime();
		map.clear();
		long t1 = System.nanoTime();
		long elapsed = t1 - t0;
		System.out.println("clear() took " + elapsed + " nanoseconds");
	}

	private static void measureReplacingAMap() {
		HashMap<Integer, Object> map = new HashMap<>();
		for (int i = 0; i < NB_ELTS; i++)
			map.put(i, "A" + i);

		long t0 = System.nanoTime();
		map = new HashMap<>();
		long t1 = System.nanoTime();
		long elapsed = t1 - t0;
		System.out.println("new Map " + elapsed + " nanoseconds");
	}
}
