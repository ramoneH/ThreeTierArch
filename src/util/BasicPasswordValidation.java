package util;

import java.util.Scanner;

public class BasicPasswordValidation {

	public static void main(String[] args) {

		System.out.print("1. A password must have at least eight characters.\n"
				+ "2. A password consists of only letters and digits.\n"
				+ "3. A password must contain at least two digits \n"
				+ "Input a password (You are agreeing to the above Terms and Conditions.): ");

		String password = new Scanner(System.in).nextLine();

		if (isPasswordValid(password)) {
			System.out.println("Password: " + password + " is valid");
		} else {
			System.out.println("Password: " + password + " is not valid");
		}

	}

	public static boolean isPasswordValid(String password) {

		if (password.length() < 8) {
			return false;
		}

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (isDigit(ch)) {
				numCount++;
			}

			else if (isLetter(ch)) {
				charCount++;
			} else {
				return false;
			}
		}

		if (charCount >= 2 && numCount >= 2) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isLetter(char ch) {
		ch = Character.toUpperCase(ch);
		if (ch >= 'A' && ch <= 'Z') {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDigit(char ch) {

		if (ch >= '0' && ch <= '9') {
			return true;
		} else {
			return false;
		}
	}

}