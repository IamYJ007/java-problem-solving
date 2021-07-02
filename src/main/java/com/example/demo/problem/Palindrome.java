package com.example.demo.problem;

public class Palindrome {

    static boolean isPal(String ss) {

        int i = 0, j = ss.length() - 1;

        while (i < j) {
            if (ss.charAt(i) != ss.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "oyyo";

        if (isPal(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
