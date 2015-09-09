package com.liesard.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sort: A library that sorts a string of text using various methods
 * @author liesard
 * @version 0.2
 */

public class Sort {
    /** Sorts a list of strings using bubble sort
     *  @since 0.1
     *  @param list The list to be sorted
     *  @return The sorted list
     */
    public static List<String> bubbleSort(List<String> list) {
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

    /** Sorts a list of strings using merge sort
     *  @since 0.2
     *  @param list The list to be sorted
     *  @return The sorted list
     */
    public static List<String> mergeSort(List<String> list) {
        if (list.size() <= 2) {
            if (list.size() == 2) {
                if (checkStrings(list.get(0), list.get(1))) {
                    swap(list, 0, 1);
                }
            }
            return list;
        }
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        for (int i = 0; i < list.size() / 2; i++) {
            list1.add(list.get(i));
        }
        for (int i = list.size() / 2; i < list.size(); i++) {
            list2.add(list.get(i));
        }

        mergeSort(list1);
        mergeSort(list2);

        // list.clear();
        // list.addAll(list1);
        // list.addAll(list2);

        return list;
    }

    private static boolean checkStrings(String string0, String string1) {
        int stringLength = string0.length() < string1.length() ?
                           string0.length() : string1.length();

        for (int charPos = 0; charPos < stringLength; charPos++) {
            if (string0.charAt(charPos) < string1.charAt(charPos)) {
                return true;
            } else if (string0.charAt(charPos) > string1.charAt(charPos)) {
                break;
            }
        }

        return false;
    }

    private static void swap(List<String> list, int index0, int index1) {
        String tmp = list.get(index0);
        list.set(index0, list.get(index1));
        list.set(index1, tmp);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);

        bubbleSort(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
