package com.yk13_naturalnie_chisla;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPrimes(100));

    }

    public static List<Integer> getPrimes(int count) {
        List<Integer> primer = new ArrayList<>();
        if (count > 0) {
            primer.add(2);
            for (int i = 3; primer.size() < count ; i = i + 2) {
                if (isPrime(i, primer)) {
                    primer.add(i);

                }
            }

        }
        return primer;
    }

    public static boolean isPrime(int number, List<Integer> primer) {
        double sqrt = Math.sqrt(number);
        for (int n : primer) {
            if (n > sqrt) {
                return true;
            }
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }
}
