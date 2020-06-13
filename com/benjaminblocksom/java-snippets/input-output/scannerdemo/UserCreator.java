package scannerdemo;

import java.util.Scanner;

public class UserCreator {

	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Name: ");
	String name = scanner.next();
	System.out.print("Age: ");
	int age = scanner.nextInt();
	System.out.print("Phone number: ");
	Long phoneNumber = scanner.nextLong();
	User user = new User(name, age, phoneNumber) ; 
	
	}
}
