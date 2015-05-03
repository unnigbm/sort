package com.liesard.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
	public static List<String> sort(List<String> list) {
		List<String> sortedList = new ArrayList<String>();
		String tmp;
		Character c, d;
		boolean swapped = false;

		while (!swapped) {
			for (int index = 0; index < list.size() - 1; index++) {
				c = list.get(index).charAt(0);
				d = list.get(index + 1).charAt(0);

				if (c > d) {
					if (index == list.size() - 1 && list.size() > 0) {
						sortedList.add(0, list.get(index));
						list.remove(index);
						index = 0;
					}
					tmp = list.get(index + 1);
					list.set(index + 1, list.get(index));
					list.set(index, tmp);
				} else if (c < d) {
					continue;
				}
			}
		}

		return sortedList;
	}

	public static void main(String[] args) {
		List<String> arguments = Arrays.asList(args);
		for (String s : sort(arguments)) {
			System.out.println(s);
		}
	}
}
