package org.example;

import java.util.Arrays;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

    }

    public static void fizzOrBuzz() {
        for (int i = 1; i < 500; i++) {
            if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("fizzbuzz");
                continue;
            }

            if (i % 5 == 0) {
                System.out.println("fizz");
                continue;
            }

            if (i % 7 == 0) {
                System.out.println("buzz");
            }
        }
    }

    public static String reverseText (String str) {
        StringBuilder res = new StringBuilder();

        for (int i = str.length() -1; i >= 0; i--) {
            res.append(str.charAt(i));
        }

        return res.toString();
    }

    public static double[] calculateQuadraticEquation(double[] val) {
        double a = val[0];
        double b = val[1];
        double c = val[2];

        double D = b * b - 4.0 * a * c;

        double []x;

        if (D > 0.0) {
            x = new double[]{(-b + sqrt(D)) / (2.0 * a), (-b - sqrt(D)) / (2.0 * a)};
            return x;
        }

        if (D == 0.0) {
            x = new double[]{-b / (2.0 * a)};
            return x;
        }

        System.out.print("No real roots");
        return null;
    }

    public static double calculateSumOfSeries(double n) {
        double memberSerias = 0.0;
        double sum = 0.0;

        do {
            memberSerias = 1.0 / (n * n + n - 2.0);
            sum += memberSerias;
            n += 2.0;
        } while(memberSerias >= Math.pow(10.0, -6.0));

        return sum;
    }

    public static String isPalindrome(String str) {
        String res = str.replaceAll("[^a-zA-Z0-9]", "");

        int n = res.length();

        for (int i = 0; i < n / 2; i++) {
            if (res.charAt(i) != res.charAt(n - i - 1)) {
                return "This is not a palindrome";
            }
        }

        return "This is a palindrome";
    }
}