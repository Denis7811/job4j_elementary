package ru.job4j.array;

import array.FindLoop1;
import array.MinDiapason;
import array.SwitchArray;

public class SortSelected1 {
    public static int[] sort(int[] data) {
        for (int i = 0; i <data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop1.indexOf(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }
}

