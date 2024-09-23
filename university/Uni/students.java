package Uni;

import java.util.Scanner;


public class students {
	String name;
	String pas;
	int id;
	String lastname;
	String birthday;
	int age;
	String group;
	
	
	
	students(String name, String pas, int id, String lastname, String birthday, int age, String group)
	{
		this.name = name;
		this.pas = pas;
		this.id = id;
		this.lastname = lastname;
		this.birthday = birthday;
		this.age = age;
		this.group = group;
		
	
	}
	public String toString() {
		 return id + "     " + name + "         " + lastname + "      " + birthday + "       " + age + "    " + group;
	}

}