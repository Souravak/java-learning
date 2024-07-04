package com.loops;

public class WhileNumberPlayer {

	private int number;
	
	public WhileNumberPlayer(int number) {
		super();
		this.number = number;
	}

	public void printSquareUptoLimit() {
		int i=1;
		while(i*i <= number) {
			System.out.print(i*i+ " ");
			i++;
		}
		System.out.println();
	}
	
	public void printCubeUptoLimit() {
		int i=1;
		while(i*i*i <= number) {
			System.out.print(i*i*i+ " ");
			i++;
		}
		System.out.println();
		
	}
	
}
