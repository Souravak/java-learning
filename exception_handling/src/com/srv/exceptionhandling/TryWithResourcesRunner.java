package com.srv.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] numbers = { 1, 2, 3, 4 };
			int number = numbers[8];
		}
	}

}

