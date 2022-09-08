package studio1;

import java.util.Scanner;

public class Average {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("enter your first number");
		int int1 = in.nextInt();
		System.out.println("enter your second number");
		int int2 = in.nextInt();
		double average = ((double)int1 + int2)/2;
		System.out.println("the average of your two numbers is " + average);
	}

}
