package org.vijay.collectionFramework;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AssigningMapIntoList implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 5379004257228213009L;
	public static void main(String[] args) {
		
		AssigningMapIntoList objAssigningMapIntoList = new AssigningMapIntoList();
		
		objAssigningMapIntoList.addValueToMap();
	}
	
	Map<String, Long> m = new HashMap<>();
	
	public Map<String, Long> addValueToMap(){
		m.put("user1", Long.valueOf(1234));
		m.put("user2", Long.valueOf(1235));
		m.put("user3", Long.valueOf(1236));
		m.put("user4", Long.valueOf(1237));
		
		return m;
	}

}
