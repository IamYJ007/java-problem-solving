package com.example.demo.problem;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzzUsingJava8(40);
        usingJava(10);
    }

    private static void usingJava(int n) {
        for (int i = 1; i <= n; i++) {
            {
                if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
                    System.out.println("fizzbuzz");
                else if ((i % 5) == 0) // Is it a multiple of 5?
                    System.out.println("fizz");
                else if ((i % 7) == 0) // Is it a multiple of 7?
                    System.out.println("buzz");
                else
                    System.out.println(i); // Not a multiple of 5 or 7
            }
        }
    }

    private static void fizzBuzzUsingJava8(int n) {
        IntStream.rangeClosed(1, n)
                .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
