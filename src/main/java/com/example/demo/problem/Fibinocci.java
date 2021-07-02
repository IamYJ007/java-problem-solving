package com.example.demo.problem;

public class Fibinocci {

    static int printFib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return printFib(n - 2) + printFib(n - 1);
    }


    public static void main(String[] args) {

        int maxNum = 10;

        for(int i =0; i<= maxNum-1;i++)
        System.out.print(printFib(i) + " ");

    }
}
