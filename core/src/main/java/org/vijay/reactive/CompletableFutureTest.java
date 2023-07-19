package org.vijay.reactive;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {
        try {
            List<Integer> list = Arrays.asList(5, 9, 14);
            list.stream().map(num -> CompletableFuture.supplyAsync(() -> getNumber(num)))
                    .map(CompletableFuture -> CompletableFuture.thenApply(n -> n * n)).map(CompletableFuture::join)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int getNumber(int a) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return a * a;
    }
}
