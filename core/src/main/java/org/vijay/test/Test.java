package org.vijay.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		Integer o1 = Integer.valueOf(2);
		Integer o2 = o1;
		System.out.println("sdadf");
		m.put(o1, "4");
		m.put(o2, "5");

		Set<Map.Entry<Integer, String>> entry = m.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = entry.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> e = itr.next();
			System.out.println("Key is: " + e.getKey().toString()
					+ " Value is: " + e.getValue());
		}

		//////////////////
		Integer i = Integer.valueOf("12");// for "b" -> NumberFormatEx
		System.out.println("B is " + i);
	}

}
