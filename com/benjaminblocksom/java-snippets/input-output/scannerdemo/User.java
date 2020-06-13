package scannerdemo;

public class User {
	private String name;
	private int age;
	private long phoneNumber;

	public User (String name, int age, long phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		System.out.println("User created."
			+  "Name: " + name 
			+ ", age: " + age 
			+ ", phone number: " + phoneNumber);		 
	}

}
