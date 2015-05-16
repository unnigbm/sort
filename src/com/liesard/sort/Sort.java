package com.liesard.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sort: A library that sorts a string of text using various methods
 * @author liesard
 * @version 0.1
 */

public class Sort {
    public Sort(List<String> list) {
        bubbleSort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    /** Sorts a list of strings using bubble sort
     *  @param list The list to be sorted
     *  @return The sorted list
     */
    public List<String> bubbleSort(List<String> list) {
        String currentWord, lastWord, tmp;
        boolean swapped = false;
        int wordLength;

        for (int index = 1; index < list.size(); index++) {
            currentWord = list.get(index);
            lastWord = list.get(index - 1);

            if (checkStrings(currentWord, lastWord)) {
                swap(list, index, index - 1);
                swapped = true;
            }

            if (index >= list.size() - 1) {
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

    public List<String> mergeSort(List<String> list) {
        return list;
    }

    private boolean checkStrings(String string0, String string1) {
        int stringLength = string0.length() < string1.length() ? string0.length() : string1.length();

        for (int charPos = 0; charPos < stringLength; charPos++) {
            if (string0.charAt(charPos) < string1.charAt(charPos)) {
                return true;
            } else if (string0.charAt(charPos) > string1.charAt(charPos)) {
                break;
            }
        }

        return false;
    }

    private void swap(List<String> list, int index0, int index1) {
        String tmp = list.get(index0);
        list.set(index0, list.get(index1));
        list.set(index1, tmp);
    }

    public static void main(String[] args) {
        new Sort(Arrays.asList(args));
    }
}
