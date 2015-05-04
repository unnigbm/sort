package com.liesard.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    public static List<String> bubbleSort(List<String> list) {
        String tmp;
        Character currentChar, lastChar;
        boolean swapped = false;

        for (int index = 1; index < list.size(); index++) {
            currentChar = list.get(index).charAt(0);
            lastChar = list.get(index - 1).charAt(0);

            if (currentChar < lastChar) {
                tmp = list.get(index - 1);
                list.set(index - 1, list.get(index));
                list.set(index, tmp);
                swapped = true;
            }
            if (index == list.size() - 1) {
                if (!swapped) {
                    break;
                } else {
                    index = 0;
                    swapped = false;
                }
            }
        }

        return list;
    }
}
