package com.tokyo.quizApp.menu;

import java.util.Scanner;

public class SignUp {
	static String name;
	static String email;
	static String pass;
	static int age;
	public static void Signup(Scanner sc) {
		System.out.print("Enter your name : ");
		name = sc.next();
		System.out.print("Enter your email : ");
		email = sc.next();
		System.out.print("Enter your Password : ");
		pass = sc.next();
		System.out.print("Enter your age : ");
		age = sc.nextInt();
	}
	
}
