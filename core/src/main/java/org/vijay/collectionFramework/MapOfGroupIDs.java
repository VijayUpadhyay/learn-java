package org.vijay.collectionFramework;

import java.util.*;

public class MapOfGroupIDs {

    static ListOfGroupIDs objListofGroupIDs = new ListOfGroupIDs();
    static Map<String, Long> m1 = null;

    static List<Object> list = new ArrayList<Object>();

    public static void main(String[] args) {
        MapOfGroupIDs objMapOfGroupIDs = new MapOfGroupIDs();
        objMapOfGroupIDs.fetchData();
    }

    @SuppressWarnings("rawtypes")
    public void fetchData() {

        AssigningMapIntoList objAssigningMapIntoList = new AssigningMapIntoList();

        m1 = objAssigningMapIntoList.addValueToMap();

        Set<?> entrySet = m1.entrySet();
        System.out.println(entrySet);
        Iterator<?> i = entrySet.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            // System.out.println(me);
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
            list.add(me.getValue());
        }

        for (Map.Entry<String, Long> entryset : m1.entrySet())
            System.out.println(entryset);

        // Fetch the list
        ListIterator<Object> itr = list.listIterator();
        while (itr.hasNext()) {
            System.out.println((long) itr.next());
        }

    }

}
