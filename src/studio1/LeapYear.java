package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any year");
		int year = in.nextInt();
		int div4 = year % 4;
		int div100 = year % 100;
		int div400 = year % 400;
		boolean leapYear = div4 == 0 && div100 != 0 || div400 == 0;
		System.out.print(leapYear);
	}

}
