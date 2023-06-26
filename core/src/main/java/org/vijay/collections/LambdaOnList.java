package org.vijay.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaOnList {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("ram");
        list.add("rahim");
        list.add("rakesh");
        list.add("moti");
        list.add("raja");

        System.out.println("Asc order sorting:");
        list.sort(String::compareTo);
        list.forEach(System.out::println);


        list.sort((x, y) -> {
            return y.compareTo(x);
        });
        // Comparator<List<String>> comparatorObj = ( (x,y) -> x.compareTo(y) ) ;

        System.out.println("Desc order sorting:");
        list.forEach(System.out::println);

    }

}
