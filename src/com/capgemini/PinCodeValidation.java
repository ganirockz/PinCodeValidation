package com.capgemini;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^(!([a-zA-Z][^W]))*[0-9]{6}");
		while (true) {
			System.out.println("Do you want to enter Pincode: \nselect \n1.yes\n2.no");
			int option = Integer.parseInt(sc.nextLine());
			if (option == 1) {
				System.out.println("Enter the Pincode to check pattern :");
				String input = sc.nextLine();
				Matcher m = pattern.matcher(input);
				if (m.find()) {
					System.out.println("Valid");
				} else {
					System.out.println("Not Valid");
				}
			} else {
				System.out.println("Thank you!");
				break;
			}
		}
		sc.close();
	}

}
