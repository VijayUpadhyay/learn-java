package org.vijay.collectionFramework;

import java.util.*;

public class MapComparableImpl implements Comparable<MapComparableImpl> {

    static List<String> list;
    int age;

    public static void main(String[] args) {
        list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<String, String>();
        //Map<String, String> map = new TreeMap<String,String>();
        map.put("first", "ram");
        map.put("second", "ramayana");
        map.put("third", "vj");
        map.put("fourth", "ramanujam");
        map.put("fifth", "vikesh");
        //list.addAll(map.to);
        Set<java.util.Map.Entry<String, String>> entry = map.entrySet();
        Iterator<java.util.Map.Entry<String, String>> itr = entry.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        if (map.containsValue("vikesh"))
            System.out.println("Found Key" + map);
    }

    @Override
    public int compareTo(MapComparableImpl o) {
        // TODO Auto-generated method stub
        return this.age - o.age;
    }

}
