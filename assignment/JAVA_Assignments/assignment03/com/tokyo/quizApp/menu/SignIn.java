package com.tokyo.quizApp.menu;

import java.util.Scanner;

public class SignIn {
	static String username;
	static String pass;

	public static void Signin(Scanner sc) {
		System.out.print("Enter your username : ");
		username = sc.next();

		System.out.print("Enter your pass : ");
		pass = sc.next();
	}
}
