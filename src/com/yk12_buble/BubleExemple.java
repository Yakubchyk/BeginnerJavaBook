package com.yk12_buble;

public class BubleExemple {
    public void BubleSort(int[] array) {
        var sort = false;
        while (!sort) {
            sort = true;
            for (int i = 1; i < array.length; i++) {
                int prew = array[i - 1];
                int carren = array[i];
                if (prew > carren) {
                    swap(array, i - 1, i);
                    sort = false;

                }
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}