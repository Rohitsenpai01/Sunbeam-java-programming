package assignment02;

import java.util.Scanner;

public class Que_b {

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            int length = input.length();
            System.out.println("Length of string: " + length);

            if (length > 80) {
                throw new ExceptionLineTooLong();
            }

            System.out.println("String length is within limit.");

        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
