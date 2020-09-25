package com.codegym.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class LongestString {
	private static List<String> strings;

	public static void main(String[] args) throws Exception {
		// write your code here
		strings = new ArrayList<String>();

		Reader r = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(r);

		for (int i = 0; i < 5; i++) {
			String s = reader.readLine();
			strings.add(s);

		}
		int j = 0;
		String s = strings.get(j);
		List<String> longest = new ArrayList<String>();

		for (int i = 1; i < strings.size(); i++) {

			if (s.length() < strings.get(i).length()) {
				s = strings.get(i);
			} else if (s.length() == strings.get(i).length()) {
				longest.add(strings.get(i));
			}

		}
		System.out.println(s);
		for (int i = 0; i < longest.size(); i++) {
			System.out.println(longest.get(i));
		}

	}
}
