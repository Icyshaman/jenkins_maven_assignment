package demo.calculator;

import java.util.Scanner;

public class Calculator {
	
	public static double Add(double n1, double n2) {
		return n1 + n2;
	}
	
	public static double Sub(double n1, double n2) {
		return n1 - n2;
	}
	
	public static double Mul(double n1, double n2) {
		return n1 * n2;
	}
	
	public static double Div(double n1, double n2) {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double n1, n2, result = 0;
		int choice;

		System.out.println("Operation			Key");
		System.out.println("Addition			1");
		System.out.println("Substraction			2");
		System.out.println("Multiplication			3");
		System.out.println("Division			4");
		System.out.println();
		System.out.print("Enter Your Choice: ");
		choice = cin.nextInt();
		System.out.println();
		if (choice > 0 && choice < 5) {
			System.out.print("Enter First No.: ");
			n1 = cin.nextInt();
			System.out.print("Enter Second No.: ");
			n2 = cin.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				result = Add(n1,n2);
				break;
			case 2:
				result = Sub(n1,n2);
				break;
			case 3:
				result = Mul(n1,n2);
				break;
			case 4:
				result = Div(n1,n2);
				break;
			}
			System.out.println("Result is " + result);
		} else {
			System.out.println("Invalid Input!!!");
		}
		System.out.println();
		cin.close();
	}
}
