package com.yk12_buble;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 8, 3, 7, 1, 7, 4, 3, 8, 9, 1, 3, 5, 2, 10};
        System.out.println(Arrays.toString(array));
        new BubleExemple().BubleSort(array);
        System.out.println(Arrays.toString(array));

    }
}
