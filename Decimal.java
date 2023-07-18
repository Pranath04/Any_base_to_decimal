package base_to_decimal;

import java.util.Scanner;

public class Decimal{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		System.out.println("Enter the base");
		int base = scanner.nextInt();
		System.out.print(basetodecimal(number,base));
	}
	public static int basetodecimal(int number,int base) {
		int r = 0,index = 0;
		while(number>0) {
			r += (number%10)*Math.pow(base, index);
			index++;
			number /= 10;
		}
		return r;
	}
}