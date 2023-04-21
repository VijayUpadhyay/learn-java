package org.vijay.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FilterOnMap {

    public static void main(String[] args) {
        Map<Integer, String> HOSTING = new HashMap<>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");
        HOSTING.put(5, "aws.amazon.com");
        Long result;
        result = HOSTING.entrySet().stream().filter(predicate -> "aws.amazon.com".equals(predicate.getValue())).map(Entry::getValue).collect(Collectors.counting());
        System.out.println("result1: " + result);
        result = HOSTING.values().stream().filter("aws.amazon.com"::equals).count();
        System.out.println("result2: " + result);
        String concatenatedResult;
        //concatenatedResult = HOSTING.entrySet().stream().filter(predicate -> "aws.amazon.com".equals(predicate.getValue())).map(Entry::getValue).collect(Collectors.joining("/"));
        concatenatedResult = HOSTING.values().stream().filter("aws.amazon.com"::equals).collect(Collectors.joining("/"));
        System.out.println("concatenatedResult: " + concatenatedResult);
        // aws.amazon.com/aws.amazon.com --> o/p --> if 2 values are same it will concatenate them.
        //Map -> Stream -> Filter -> Map
        Map<Integer, String> collect = HOSTING.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));
        System.out.println("2nd method:" + collect);
    }

}
