package Uni;

import java.util.Scanner;


public class Student {
	String name;
	String pas;
	int id;
	String lastname;
	String birthday;
	int age;
	String group;
	int Java;
	int Csharp;
	int Python;
	int PHP;
	String passed;
	int retake = 3;
	
	
	Student(String name, String pas, int id, String lastname, String birthday, int age, String group, int Java, int Csharp, int Python, int PHP, String passed, int retake)
	{
		this.name = name;
		this.pas = pas;
		this.id = id;
		this.lastname = lastname;
		this.birthday = birthday;
		this.age = age;
		this.group = group;
		this.Java = Java;
		this.Csharp = Csharp;
		this.Python = Python;
		this.PHP = PHP;
		this.passed = passed;
		this.retake = retake;
	
	}
	public String toString() {
		 return id + "     " + name + "         " + lastname + "      " + birthday + "       " + age + "    " + group + "   " + Java + "  " + Csharp + "   " + Python + "  " + PHP;
	}
	   public String getName() 
	   {
	        return name;
	    }
	   public int getAge() 
	   {
	        return age;
	    }
	   public int getId() 
	   {
	        return id;
	    }
	   public String getLastname() 
	   {
	        return lastname;
	    }
	   public int getJava() 
	   {
	        return Java;
	    }
	   public int getCsharp() 
	   {
	        return Csharp;
	    }
	   public int getPython() 
	   {
	        return Python;
	    }
	   public int getPHP() 
	   {
	        return PHP;
	    }
	   public int getRetake() 
	   {
	        return retake;
	    }





}