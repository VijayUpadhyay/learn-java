package org.vijay.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayToSet {
    public static <T> Set<T> convertArrayToSet(T[] array) {
        // create a set from the Array
        return Arrays.stream(array).collect(
                Collectors.toSet());
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, -200, 500, 800, 0, 500};
        HashSet<Integer> set = (HashSet<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toSet());
        Set<Integer> data = Arrays.stream(arr).boxed().collect(Collectors.toCollection(HashSet::new));
        System.out.println(set);
        System.out.println(data);
    }
}
