package com.liesard.sort;

import java.util.ArrayList;
import java.util.List;

public class Sort {
	public List<String> Sort(List<String> list) {
		List<String> sortedList = new ArrayList<String>();

		for (String currentWord : list) {
			sortedList.add(currentWord);

			for (String otherWord : sortedList) {
				if (currentWord.equals(otherWord)) {
					continue;
				} else {
					System.out.println(currentWord);
				}
			}
		}

		for (String s : sortedList) {
			System.out.println(s);
		}

		return sortedList;
	}

	public static void main(String[] args) {
		new Sort(new List<String>(args));
	}
}