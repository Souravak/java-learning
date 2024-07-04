package com.srv.arrays;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Sourav", new int[] {1,100,50});
		System.out.println("Number of Marks: "+ student.getNumberOfMarks());
		System.out.println("Total Sum: "+ student.getTotalSumOfMarks());
		System.out.println("Maximum Mark: "+ student.getMaximumMark());
		System.out.println("Minimum Mark: "+ student.getMinimumMark());
		System.out.println("Average: "+ student.getAverageMarks());

	}

}
