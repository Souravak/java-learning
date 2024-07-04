package com.srv.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			
			sc = new Scanner(System.in);
			
			int[] numbers = {1,2,3,4};
			
			int number = numbers[2];
			return;
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			if(sc!=null) {
				sc.close();
			}
		}
		
		System.out.println("Just before closing out main");
	}

}