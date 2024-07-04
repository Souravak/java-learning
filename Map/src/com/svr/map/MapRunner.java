package com.svr.map;

import java.util.HashMap;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. " 
				+ "This has never happened before.";
		
		HashMap<Character, Integer> occurances = new HashMap<>();
		
		char[] characters = str.toCharArray();
		System.out.println(characters.length);
		for(char character:characters) {
			Integer integer = occurances.get(character);
			if(integer==null) {
				occurances.put(character, 1);
			}
			else {
				occurances.put(character, integer + 1);
			}
		}
		System.out.println(occurances);
		
		
		HashMap<String, Integer> stringOccurances = new HashMap<>();
		
		String[] strings = str.split(" ");
		System.out.println(strings.length);
		
		for(String string:strings) {
			Integer integer = stringOccurances.get(string);
			if(integer==null) {
				stringOccurances.put(string, 1);
			}
			else {
				stringOccurances.put(string, integer + 1);
			}
		}
		System.out.println(stringOccurances);
		

	}

}
