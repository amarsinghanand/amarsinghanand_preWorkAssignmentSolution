package preworkAssignment;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		String pallindromeStringToCheck = "", reversedPallindrome = "";
		pallindromeStringToCheck = sc.nextLine();
		int pallindromeLength = pallindromeStringToCheck.length();
		if (pallindromeLength == 0) {
			System.out.println("Please enter the valid input." + "\n");
		} else {

			for (int i = pallindromeLength - 1; i >= 0; i--) {
				reversedPallindrome = reversedPallindrome + pallindromeStringToCheck.charAt(i);
			}
			if (pallindromeStringToCheck.equals(reversedPallindrome)) {
				System.out
						.println("The entered number string " + pallindromeStringToCheck + " is a pallindrome." + "\n");
			} else {
				System.out.println(
						"The entered number string " + pallindromeStringToCheck + " is not a pallindrome." + "\n");
			}
		}
	}

	// function to printPattern

	public void printPattern() {
		int patternInput = 0, count = 0, i, j;
		patternInput = sc.nextInt();
		count = patternInput - 1;
		if (patternInput > 0) {
			for (i = patternInput; i >= 0; i--) {
				for (j = count; j >= 0; j--) {
					System.out.print("*");
				}
				count--;
				System.out.println("\n");
			}
		} else {
			System.out.println("Please enter the valid input." + "\n");
		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		int primeNumerInput, i, m = 0, flag = 0;
		primeNumerInput = sc.nextInt();
		m = primeNumerInput / 2;
		if (primeNumerInput == 0 || primeNumerInput == 1) {
			System.out.println(primeNumerInput + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (primeNumerInput % i == 0) {
					System.out.println(primeNumerInput + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(primeNumerInput + " is prime number" + "\n");
			}
		}
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int fibonacciInput, first = 0, second = 1, i, fiboncacci;
		String fibonacciSeries = "";
		fibonacciInput = sc.nextInt();
		for (i = 1; i < fibonacciInput; i++) {
			fiboncacci = first + second;
			if (i == 1) {
				fibonacciSeries = first + ", " + second;
			} else {
				fiboncacci = first + second;
				first = second;
				second = fiboncacci;
				fibonacciSeries += ", " + fiboncacci;
			}
		}
		System.out.println("The fibonacci series for the number " + fibonacciInput + " is " + fibonacciSeries + "\n");
	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}
}
