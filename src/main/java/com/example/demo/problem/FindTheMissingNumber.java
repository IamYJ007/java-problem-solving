package com.example.demo.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindTheMissingNumber {


    public static void main(String[] args) {
        int[] miss = new int[10];
        int[] ints = new int[]{0, 1, 4, 3, 6};

        //printMe(1); Stack over flow error

        Arrays.sort(ints);

        IntStream.of(ints).forEach(System.out::println);

        int low = ints[0];
        int high = ints[ints.length - 1];


    }

    public static int printMe(int i) {
        System.out.println(i);
        return printMe(i++);
    }
}
