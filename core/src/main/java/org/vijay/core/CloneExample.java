package org.vijay.core;

import java.lang.reflect.InvocationTargetException;

public class CloneExample implements Cloneable {

	public static void main(String[] args) {

		// 1
		CloneExample obj1 = new CloneExample();

		// 2
		try {
			CloneExample obj2 = (CloneExample) Class
					.forName("org.vijay.core.CloneExample").getConstructors()[0]
					.newInstance();
			System.out.println(obj2.str);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | IllegalArgumentException
				| InvocationTargetException | SecurityException e) {
			e.printStackTrace();
		}

		// 3
		try {
			CloneExample obj3 = (CloneExample) obj1.clone();
			System.out.println("clone obj: " + obj3.str);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	String str = "vijay";

}
