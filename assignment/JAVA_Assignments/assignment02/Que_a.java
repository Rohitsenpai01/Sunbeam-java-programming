package assignment02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Que_a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();

		int ch = 1, rollno;
		String name;
		float percentage;

		while (ch != 7) {

		    System.out.print("\n\n1.Add student\n2.Display\n3.Search by Roll number\n4.Sort by Roll no\n5.Sort by name\n6.Sort by marks\n7.Exit.\n\nEnter your choice :");
		    ch = sc.nextInt();

		    switch (ch) {

		    case 1:
		        System.out.print("Enter roll no : ");
		        rollno = sc.nextInt();
		        System.out.print("Enter name : ");
		        name = sc.next();
		        System.out.print("Enter percentage : ");
		        percentage = sc.nextFloat();
		        list.add(new Student(rollno, name, percentage));
		        break;

		    case 2:
		        System.out.println("\nStudent Details:");
		        for (Student e : list)
		            System.out.println(e);
		        break;

		    case 3:
		        System.out.print("Enter roll no to search : ");
		        rollno = sc.nextInt();
		        Student key = new Student(rollno, "", 0);
		        int idx = list.indexOf(key);
		        if (idx != -1)
		            System.out.println(list.get(idx) + " found at index " + idx);
		        else
		            System.out.println("Not found");
		        break;

		    case 4:
		        System.out.println("Sort by roll no:");
		        Collections.sort(list);
		        list.forEach(System.out::println);
		        break;

		    case 5:
		        System.out.println("Sort by name:");
		        Collections.sort(list, Comparator.comparing(Student::getName));
		        list.forEach(System.out::println);
		        break;

		    case 6:
		        System.out.println("Sort by percentage:");
		        Collections.sort(list, Comparator.comparing(Student::getPercentage));
		        list.forEach(System.out::println);
		        break;

		    case 7:
		        System.out.println("Exiting...");
		        break;

		    default:
		        System.out.println("Invalid choice");
		    }
		}


		sc.close();
	}
}
