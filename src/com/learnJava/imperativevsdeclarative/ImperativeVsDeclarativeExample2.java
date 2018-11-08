package com.learnJava.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

        /**
         * Imperative - how style of programming
         */

        List<Integer> uniqueList = new ArrayList<>();

        for (Integer integer : integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }

        System.out.println("uniqueList: " + uniqueList);

        /**
         * Declarative style of Programming  - What style of programming
         */
        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("uniqueList1: " + uniqueList1);
    }
}
