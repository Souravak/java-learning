package loops;

import com.loops.MyNumber;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);
		boolean isPrime = number.isPrime();
		System.out.println(isPrime);

		int sum = number.sumUptoN();
		System.out.println(sum);

		int sumOfDiv = number.sumOfDivisors();
		System.out.println(sumOfDiv);

		number.printNumberTriangle();
		
	}

}
