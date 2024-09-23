package Uni;

import java.util.Scanner;

import UniTest.Persoon;
import UniTest.Student;
import UniTest.students;
import UniTest.teachers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MenuUni {
	
	public static void main(String[] args)
	{
		// user input
		
		Scanner scan = new Scanner(System.in);
		ArrayList<students> Student01 = new ArrayList<>();
		ArrayList<Student> Student02 = new ArrayList<>();
		ArrayList<teachers> Teacher = new ArrayList<>();
		HashMap<Integer, Student> studentMap = new HashMap<>();
		System.out.print("Enter your userename: ");
		String username = scan.nextLine();
		System.out.print("Enter your password: ");
		String password = scan.nextLine();
		
		//students
		
		students jack = new students("jack", "jack123", 5, "hendrikson", "12-08-1990", 33, "HICOEPQ3");
		students eva = new students("eva", "eva123", 7, "ludwig", "23-02-1995", 28, "HICOEPQ3");
		students bob = new students("bob", "bob123", 4, "the builder", "17-07-1989", 34, "HICOEPQ3");
		students lara = new students("lara", "lara123", 8, "yigit", "9-11-2001", 22, "HICOEPQ3");
		students sarah = new students("sarah", "sarah123", 9, "will", "5-03-2003", 20, "HICOEPQ3");
		Student Jack = new Student("jack", "jack123", 5, "hendrikson", "12-08-1990", 33, "HICOEPQ3", 90, 75, 100 , 60, "passed", 3);
		Student Eva = new Student("eva", "eva123", 7, "ludwig", "23-02-1995", 28, "HICOEPQ3", 45, 70, 50, 55, "passed", 2);
		Student Bob = new Student("bob", "bob123", 4, "the builder", "17-07-1989", 34, "HICOEPQ3", 60, 70, 70, 60, "passed", 2);
		Student Lara = new Student("lara", "lara123", 8, "yigit", "9-11-2001", 22, "HICOEPQ3", 30, 25, 15, 45, "not passed", 0);
		Student Sarah = new Student("sarah", "sarah123", 9, "will", "5-03-2003", 20, "HICOEPQ3", 75, 70, 65, 70, "passed", 0);
		studentMap.put(5, Jack);
		studentMap.put(7, Eva);
		studentMap.put(4, Bob);
		studentMap.put(8, Lara);
		studentMap.put(9, Sarah);
		Student01.add(jack);
		Student01.add(eva);
		Student01.add(bob);
		Student01.add(lara);
		Student01.add(sarah);
		Student02.add(Jack);
		Student02.add(Eva);
		Student02.add(Bob);
		Student02.add(Lara);
		Student02.add(Sarah);

		//teachers
		
		teachers john = new teachers("john", "john456", 2, "anderson", "28-09-1972", 51, 5200);
		teachers marry = new teachers("marry", "marry456", 6, "johnsen", "02-02-1991", 32, 4200);
		teachers lars = new teachers("lars", "lars456", 3, "belson", "02-04-1975", 48, 4700);
		Teacher.add(john);
		Teacher.add(marry);
		Teacher.add(lars);
		
		//manager
		
		Persoon molly = new Persoon("molly", "molly789", 1, "adams", "16-01-1971", 52);
		
		//if teacher, student or manager
		
		if(username.equalsIgnoreCase(molly.name))
		{
			if(password.equalsIgnoreCase(molly.pas))
			{
				while(true)
				{
					//manager input menu
					System.out.print("\n");
					System.out.print("\n");
					System.out.print("S. Display Students  |  T. Display Teachers  |  A. Add students  |  R. Display Reports  |  V. Save Reports  |  X. Exit  |\n");
					System.out.print("\nPlease enter a choice: ");
					String choice = scan.nextLine();
					if(choice.equalsIgnoreCase("s"))
					{
						//manager student menu
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  List of the Students\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Group\n");
						System.out.print("**    *********    ********      *********      ***   *****\n");
						for (students students : Student01) {
				            System.out.println(students);
						}
					}
					
					else if(choice.equalsIgnoreCase("t"))
					{
						//manager teacher menu
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  List of the Teachers\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Salary\n");
						System.out.print("**    *********    ********      *********      ***   ******\n");
						for (teachers teachers : Teacher) {
				            System.out.println(teachers);
						}
					}
					else if(choice.equalsIgnoreCase("a"))
					{
						//manager add student
						System.out.print("Enter student name: ");
		                String name = scan.nextLine();
		                System.out.print("Enter student password: ");
		                String pass = scan.nextLine();
		                System.out.print("Enter student ID: ");
		                int id = scan.nextInt();
		                System.out.print("Enter student lastname: ");
		                String lastname = scan.nextLine();
		                String Lastname = scan.nextLine();
		                System.out.print("Enter student brithdate: ");
		                String birthdate = scan.nextLine();
		                System.out.print("Enter student age: ");
		                int age = scan.nextInt();
		                System.out.print("Enter student group: ");
		                String group = scan.nextLine();
		                String Group = scan.nextLine();

		                
		               students students = new students(name, pass, id, Lastname, birthdate, age, Group);
		               Student01.add(students);
		               Student Student = new Student(name, pass, id, Lastname, birthdate, age, Group, 0,0,0,0, "not passed", 3);
		               Student02.add(Student);
		               studentMap.put(id, Student);
					}
					else if(choice.equalsIgnoreCase("r"))
					{
						//teacher see reports
						
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  Student Results\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Group    Java   Csharp   Python   PHP\n");
						System.out.print("**    *********    ********      *********      ***   *****    ****   ******   ******   ***\n");
						for (Student Student : Student02) {
				            System.out.println(Student);
						}
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  Enter student id (report details)  | or 0 to  main menu:");
						int choice01 = scan.nextInt();
						scan.nextLine();
						
						System.out.print(choice01);
						
						if(choice01 == 0)
						{
							System.out.print("\n");	
						}
						else if(studentMap.containsKey(choice01))
						{
							  Student student = studentMap.get(choice01);
					            
					            System.out.print("\n");
					            System.out.println("Report of student " + student.getName() + " " + student.getLastname());
					            System.out.print("\n");
					            System.out.print("\nStudent ID:              " + student.getId());
					            System.out.print("\nStudent Frist name:      " + student.getName());
					            System.out.print("\nStudent Laste name:      " + student.getLastname());
					            System.out.print("\nStudent Age:             " + student.getAge());
					            System.out.print("\n");
					            System.out.print("\n           CROUSES");
					            System.out.print("\n");
					            System.out.print("\nJava:                    " + student.getJava());
					            System.out.print("\nCsharp:                  " + student.getCsharp());
					            System.out.print("\nPython:                  " + student.getPython());
					            System.out.print("\nPHP:                     " + student.getPHP());
					            System.out.print("\n");
					            System.out.print("\n           RESULTS");
					            System.out.print("\n");
					            if((student.getJava() >= 55) || (student.getCsharp() >= 55) || (student.getPython() >= 55) || (student.getPHP() >= 55))
					            {
					            	System.out.print("\nResults:                 Passed");
					            }
					            else
					            {
					            	System.out.print("\nResults:                 Not Passed");
					            }
					            System.out.print("\nRetakes:                 " + student.getRetake());  
					            System.out.print("\n");
					            System.out.print("A. Add (Update) Report  |  R. Display Reports  |  B. Back to main  |  X. exit  |");
					            System.out.print("\n");
					            System.out.print("Select a menu: ");
					            String choice03 = scan.nextLine();
					            
					            if(choice03.equalsIgnoreCase("a"))
					            {
					            	System.out.println("Current java grade is: " + student.getJava());
					            	System.out.print("Enter a (new) grade: ");
					            	student.Java = scan.nextInt();
					            	System.out.println("Current Csharp grade is: " + student.getCsharp());
					            	System.out.print("Enter a (new) grade: ");
					            	student.Csharp = scan.nextInt();
					            	System.out.println("Current Python grade is: " + student.getPython());
					            	System.out.print("Enter a (new) grade: ");
					            	student.Python = scan.nextInt();
					            	System.out.println("Current PHP grade is: " + student.getPHP());
					            	System.out.print("Enter a (new) grade: ");
					            	student.PHP = scan.nextInt();
					            	System.out.print("\n");
					            }
					            else if(choice03.equalsIgnoreCase("r"))
					            {
					            	System.out.print("\n");
									System.out.print("\n");
									System.out.print("  Student Results\n");
									System.out.print("\n");
									System.out.print("ID    FirstName    lastname      Birthdate      Age   Group    Java   Csharp   Python   PHP\n");
									System.out.print("**    *********    ********      *********      ***   *****    ****   ******   ******   ***\n");
									for (Student Student : Student02) {
							            System.out.println(Student);
									}
					            }
								else if(choice03.equalsIgnoreCase("x"))
					            {
					            	System.out.print("\n");
									System.out.print("\n");
									System.out.print("  System shutting down...\n");
									System.out.print("\n");
									break;
					            }
					            else if(choice03.equalsIgnoreCase("b"))
					            {
					            	System.out.print("\n");
									System.out.print("\n");
					            	System.out.print("returnning back to main menu....");
					            	System.out.print("\n");
					            }
					            else
					            {
					            	System.out.print("\n");
									System.out.print("\n");
									System.out.print("  Please enter a correct letter\n");
									System.out.print("\n");
					            }
		                }
					else 
		                {
		                	System.out.print("\n");
		                	System.out.print("\n");
		                    System.out.println("Invalid student number.");
		                }
					}
					else if(choice.equalsIgnoreCase("v"))
					{
						System.out.print("\nall reports are saved!");
						  String baseDirectory = "C:/example/";

					        try {
					            for (Student student : Student02) {
					                // Create a file path for each student with their name as the filename
					                String filePath = baseDirectory + student.getName() + ".txt";

					                // Create a FileWriter and BufferedWriter for the student's file
					                FileWriter fileWriter = new FileWriter(filePath);
					                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

					                // Write the student information to the file
					                bufferedWriter.write("Report of student " + student.getName() + " " + student.getLastname());
					                bufferedWriter.newLine();
					                bufferedWriter.newLine();
					                bufferedWriter.write("Student ID:              " + student.getId());
					                bufferedWriter.newLine();
					                bufferedWriter.write("Student First name:      " + student.getName());
					                bufferedWriter.newLine();
					                bufferedWriter.write("Student Last name:       " + student.getLastname());
					                bufferedWriter.newLine();
					                bufferedWriter.write("Student Age:             " + student.getAge());
					                bufferedWriter.newLine();
					                bufferedWriter.newLine();
					                bufferedWriter.write("           COURSES");
					                bufferedWriter.newLine();
					                bufferedWriter.newLine();
					                bufferedWriter.write("Java:                    " + student.getJava());
					                bufferedWriter.newLine();
					                bufferedWriter.write("Csharp:                  " + student.getCsharp());
					                bufferedWriter.newLine();
					                bufferedWriter.write("Python:                  " + student.getPython());
					                bufferedWriter.newLine();
					                bufferedWriter.write("PHP:                     " + student.getPHP());
					                bufferedWriter.newLine();
					                bufferedWriter.newLine();
					                bufferedWriter.write("           RESULTS");
					                bufferedWriter.newLine();
					                bufferedWriter.newLine();
					                
					                if (student.getJava() >= 55 || student.getCsharp() >= 55 || student.getPython() >= 55 || student.getPHP() >= 55) {
					                    bufferedWriter.write("Results:                 Passed");
					                } else {
					                    bufferedWriter.write("Results:                 Not Passed");
					                }
					                bufferedWriter.newLine();
					                bufferedWriter.write("Retakes:                 " + student.getRetake());

					                // Close the BufferedWriter
					                bufferedWriter.close();
					                
					            }
					        } catch (IOException e) {
					            e.printStackTrace();
					        }
					    }
					
					
					else if(choice.equalsIgnoreCase("x"))	
					{
						//manager end
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  System shutting down...\n");
						System.out.print("\n");
						break;
					}
					else
					{
						// manager wrong input
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  Please enter a correct letter\n");
						System.out.print("\n");
					}
				}
			}
			else
			{
				System.out.print("The password or username is wrong.");
			}
		
		}
			
		else if((username.equalsIgnoreCase(lars.name)) || (username.equalsIgnoreCase(marry.name)) || (username.equalsIgnoreCase(john.name)))
		{
			if((password.equalsIgnoreCase(lars.pas)) || (password.equalsIgnoreCase(marry.pas)) || (password.equalsIgnoreCase(john.pas)))
			{
				//teachers
				while(true)
				{
					//teacher input menu
					System.out.print("\n");
					System.out.print("\n");
					System.out.print("S. Display Students  |  T. Display Teachers  |  A. Add students  |  R. Display Reports  |  X. Exit  |\n");
					System.out.print("\nPlease enter a choice: ");
					String choice = scan.nextLine();
					if(choice.equalsIgnoreCase("s"))
					{
						// teachers student menu
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  List of the Students\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Group\n");
						System.out.print("**    *********    ********      *********      ***   *****\n");
						for (students students : Student01) {
				            System.out.println(students);
						}
					}
					else if(choice.equalsIgnoreCase("t"))
					{
						//teacher teacher menu
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  List of the Teachers\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Salary\n");
						System.out.print("**    *********    ********      *********      ***   ******\n");
						for (teachers teachers : Teacher) {
				            System.out.println(teachers);
						}
					}
					else if(choice.equalsIgnoreCase("a"))
					{
						//teacher add student
						System.out.print("Enter student name: ");
		                String name = scan.nextLine();
		                System.out.print("Enter student password: ");
		                String pass = scan.nextLine();
		                System.out.print("Enter student ID: ");
		                int id = scan.nextInt();
		                System.out.print("Enter student lastname: ");
		                String lastname = scan.nextLine();
		                String Lastname = scan.nextLine();
		                System.out.print("Enter student brithdate: ");
		                String birthdate = scan.nextLine();
		                System.out.print("Enter student age: ");
		                int age = scan.nextInt();
		                System.out.print("Enter student group: ");
		                String group = scan.nextLine();
		                String Group = scan.nextLine();

		                
		               students students = new students(name, pass, id, Lastname, birthdate, age, Group);
		               Student01.add(students);
		               Student Student = new Student(name, pass, id, Lastname, birthdate, age, Group, 0,0,0,0, "not passed", 3);
		               Student02.add(Student);
		               studentMap.put(id, Student);
					}
					else if(choice.equalsIgnoreCase("r"))
					{
						//teacher see reports
						
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  Student Results\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Group    Java   Csharp   Python   PHP\n");
						System.out.print("**    *********    ********      *********      ***   *****    ****   ******   ******   ***\n");
						for (Student Student : Student02) {
				            System.out.println(Student);
						}
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  Enter student id (report details)  | or 0 to  main menu:");
						int choice01 = scan.nextInt();
						scan.nextLine();
						
						System.out.print(choice01);
						
						if(choice01 == 0)
						{
							System.out.print("\n");	
						}
						else if(studentMap.containsKey(choice01))
						{
							  Student student = studentMap.get(choice01);
					            
					            System.out.print("\n");
					            System.out.println("Report of student " + student.getName() + " " + student.getLastname());
					            System.out.print("\n");
					            System.out.print("\nStudent ID:              " + student.getId());
					            System.out.print("\nStudent Frist name:      " + student.getName());
					            System.out.print("\nStudent Laste name:      " + student.getLastname());
					            System.out.print("\nStudent Age:             " + student.getAge());
					            System.out.print("\n");
					            System.out.print("\n           CROUSES");
					            System.out.print("\n");
					            System.out.print("\nJava:                    " + student.getJava());
					            System.out.print("\nCsharp:                  " + student.getCsharp());
					            System.out.print("\nPython:                  " + student.getPython());
					            System.out.print("\nPHP:                     " + student.getPHP());
					            System.out.print("\n");
					            System.out.print("\n           RESULTS");
					            System.out.print("\n");
					            if((student.getJava() >= 55) || (student.getCsharp() >= 55) || (student.getPython() >= 55) || (student.getPHP() >= 55))
					            {
					            	System.out.print("\nResults:                 Passed");
					            }
					            else
					            {
					            	System.out.print("\nResults:                 Not Passed");
					            }
					            System.out.print("\nRetakes:                 " + student.getRetake());  
					            System.out.print("\n");
					            System.out.print("A. Add (Update) Report  |  R. Display Reports  |  B. Back to main  |  X. exit  |");
					            System.out.print("\n");
					            System.out.print("Select a menu: ");
					            String choice03 = scan.nextLine();
					            
					            if(choice03.equalsIgnoreCase("a"))
					            {
					            	System.out.println("Current java grade is: " + student.getJava());
					            	System.out.print("Enter a (new) grade: ");
					            	student.Java = scan.nextInt();
					            	System.out.println("Current Csharp grade is: " + student.getCsharp());
					            	System.out.print("Enter a (new) grade: ");
					            	student.Csharp = scan.nextInt();
					            	System.out.println("Current Python grade is: " + student.getPython());
					            	System.out.print("Enter a (new) grade: ");
					            	student.Python = scan.nextInt();
					            	System.out.println("Current PHP grade is: " + student.getPHP());
					            	System.out.print("Enter a (new) grade: ");
					            	student.PHP = scan.nextInt();
					            }
					            else if(choice03.equalsIgnoreCase("r"))
					            {
					            	System.out.print("\n");
									System.out.print("\n");
									System.out.print("  Student Results\n");
									System.out.print("\n");
									System.out.print("ID    FirstName    lastname      Birthdate      Age   Group    Java   Csharp   Python   PHP\n");
									System.out.print("**    *********    ********      *********      ***   *****    ****   ******   ******   ***\n");
									for (Student Student : Student02) {
							            System.out.println(Student);
									}
					            }
								else if(choice03.equalsIgnoreCase("x"))
					            {
					            	System.out.print("\n");
									System.out.print("\n");
									System.out.print("  System shutting down...\n");
									System.out.print("\n");
									break;
					            }
					            else if(choice03.equalsIgnoreCase("b"))
					            {
					            	System.out.print("\n");
									System.out.print("\n");
					            	System.out.print("returnning back to main menu....");
					            	System.out.print("\n");
					            }
					            else
					            {
					            	System.out.print("\n");
									System.out.print("\n");
									System.out.print("  Please enter a correct letter\n");
									System.out.print("\n");
					            }
		                }
					else 
		                {
		                	System.out.print("\n");
		                	System.out.print("\n");
		                    System.out.println("Invalid student number.");
		                }
					}
					else if(choice.equalsIgnoreCase("x"))	
					{
						//teacher end
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  System shutting down...\n");
						System.out.print("\n");
						break;
					}
					else
					{
						// teacher wrong input
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  Please enter a correct letter\n");
						System.out.print("\n");
					}
				}
			}
			else
			{
				// wrong password
				System.out.print("The password or username is wrong.");
			}
		}
		
			
		else if((username.equalsIgnoreCase(jack.name)) || (username.equalsIgnoreCase(eva.name)) || (username.equalsIgnoreCase(bob.name)) || (username.equalsIgnoreCase(lara.name)) || (username.equalsIgnoreCase(sarah.name)))
		{
			if((password.equalsIgnoreCase(jack.pas)) || (password.equalsIgnoreCase(eva.pas)) || (password.equalsIgnoreCase(bob.pas)) || (password.equalsIgnoreCase(lara.pas)) || (password.equalsIgnoreCase(sarah.pas)))
			{
				//students
				
				while(true)
				{
					//student input menu
					System.out.print("\n");
					System.out.print("\n");
					System.out.print("S. Display Students  |  T. Display Teachers  |  X. Exit  |\n");
					System.out.print("\nPlease enter a choice: ");
					String choice = scan.nextLine();
					if(choice.equalsIgnoreCase("s"))
					{
						//student student menu
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  List of the Students\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Group\n");
						System.out.print("**    *********    ********      *********      ***   *****\n");
						for (students students : Student01) {
				            System.out.println(students);
						}
						System.out.print("\n");
						System.out.print("\n");
					}
					else if(choice.equalsIgnoreCase("t"))
					{
						// student teacher menu
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  List of the Teachers\n");
						System.out.print("\n");
						System.out.print("ID    FirstName    lastname      Birthdate      Age   Salary\n");
						System.out.print("**    *********    ********      *********      ***   ******\n");
						for (teachers teachers : Teacher) {
				            System.out.println(teachers);
						}
					}
					else if(choice.equalsIgnoreCase("x"))
					{
						//student end
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  System shutting down...\n");
						System.out.print("\n");
						break;
					}
					else
					{
						// student wrong input
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("  Please enter a correct letter\n");
						System.out.print("\n");
					}
				}
			}
		}
		else
		{
			// wrong password
			System.out.print("The password or username is wrong.");
		}
	}
}
