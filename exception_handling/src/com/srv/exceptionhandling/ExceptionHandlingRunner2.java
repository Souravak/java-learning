package com.srv.exceptionhandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		try {
//			String str = null;
//			str.length();
			int[] i = {1,2,3};
			int number = i[4];
			System.out.println("Method2 Ended");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOutOfBoundsException");
			ex.printStackTrace();
		} catch (NullPointerException ex) {
			System.out.println("Matched NullPointerException");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}
	}
}
