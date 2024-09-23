package Uni;

import java.util.Scanner;

public class teachers {
	
	// main info
	
	String name;
	String pas;
	int id;
	String lastname;
	String birthday;
	int age;
	double salary;
	
	
	teachers(String name, String pas, int id, String lastname, String birthday, int age, double salary)
	{
		this.name = name;
		this.pas = pas;
		this.id = id;
		this.lastname = lastname;
		this.birthday = birthday;
		this.age = age;
		this.salary = salary;
		
	}
	public String toString() {
		 return id + "     " + name + "         " + lastname + "      " + birthday + "       " + age + "    " + salary;
	}
	
}