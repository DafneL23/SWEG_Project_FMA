import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
//		List<Student> listOfStudents = new ArrayList<>();
		
//		Student nick = new Student("nick", "nick.rich", "password");
//		System.out.println(nick.getPassword());
//		listOfStudents.add(0, new Student("nick", "nick.rich", "password"));
//		listOfStudents.add(1, new Student("rich", "very funny name", "123123123"));
//		System.out.println(listOfStudents.get(1).getPassword());
		
		 Scanner input = new Scanner(System.in);
		 
		while(true) {
//			int numStudents = 0;
			if(true) {
				
				System.out.println("Welcome to F=MA. What would you like to do. Press 1 for Signup, Press 2 for Login");
				String command = input.nextLine(); 
				System.out.println(command);
				if(command.equalsIgnoreCase("student signup")) {
					System.out.println("Welcome to Student Signup Page");
					System.out.println("Enter First and Last name");
					String name  = input.nextLine(); 
					
					System.out.println("Enter username");
					String username  = input.nextLine(); 
					
					System.out.println("Enter Password");
					String password  = input.nextLine(); 
					
					Student.listOfStudents.add(Student.getNumStudents(), new Student(name, username, password));
					
//					System.out.println("What would you like to do. 1 to see password, 2 to logout");
//					String command2  = input.nextLine(); 
//					if(command2.equalsIgnoreCase("password")) {
//						System.out.println(Student.listOfStudents.get(Student.getNumStudents()-1).getPassword());
//						
//					}
					
				}if(command.equalsIgnoreCase("mentor signup")) {
					System.out.println("Welcome to Mentor Signup Page");
					System.out.println("Enter First and Last name");
					String name  = input.nextLine(); 
					
					System.out.println("Enter username");
					String username  = input.nextLine(); 
					
					System.out.println("Enter Password");
					String password  = input.nextLine(); 
					
					Mentor.listOfMentors.add(Mentor.getNumMentors(), new Mentor(name, username, password));
					
//					System.out.println("What would you like to do. 1 to see password, 2 to logout");
//					String command2  = input.nextLine(); 
//					if(command2.equalsIgnoreCase("password")) {
//						System.out.println(Mentor.listOfMentors.get(Mentor.getNumMentors()-1).getPassword());
//						
//					}
					
				}
				
				else if(command.equalsIgnoreCase("student login")) {
					System.out.println("Enter username");
					String username  = input.nextLine(); 
					
					System.out.println("Enter Password");
					String password  = input.nextLine(); 
					Student.login(username,password);
					
					while (Student.listOfStudents.get(Student.numStudent).isLoggedIn) {
						System.out.println("What would you like to do. Create Post, View Post");
						String decision  = input.nextLine(); 
						if(decision.equalsIgnoreCase("create forum")) {

							System.out.println("Enter Forum Subject");
							String subject  = input.nextLine(); 
							System.out.println("Enter Forum Post");
							String forum  = input.nextLine(); 
							Forum.listOfForums.add(Forum.getNumForums(), new Forum(subject, forum));


						}else if (decision.equalsIgnoreCase("create comment")){
							System.out.println("Enter Forum Subject");
							String subject  = input.nextLine(); 
							System.out.println("Enter Forum Post");
							String comment  = input.nextLine(); 
							Forum.makeComment(subject, comment);
						}else if (decision.equalsIgnoreCase("view")){
							System.out.println("Enter Forum Subject you want to view");
							String subject  = input.nextLine(); 
							System.out.println(Forum.viewForum(subject));

						}else if (decision.equalsIgnoreCase("view subjects")){
							System.out.println(Forum.viewForumSubject());

						}else if (decision.equalsIgnoreCase("logout")){
							
							Student.listOfStudents.get(Student.numStudent).logout();
						}
					
					
					}	
				}
				else if(command.equalsIgnoreCase("mentor login")) {
					System.out.println("Enter username");
					String username  = input.nextLine(); 
					
					System.out.println("Enter Password");
					String password  = input.nextLine(); 
					Mentor.login(username,password);
					while (Mentor.listOfMentors.get(Mentor.numMentor).isLoggedIn) {
						System.out.println("What would you like to do. Create Post, View Post");
						String decision  = input.nextLine(); 
						if(decision.equalsIgnoreCase("create forum")) {

							System.out.println("Enter Forum Subject");
							String subject  = input.nextLine(); 
							System.out.println("Enter Forum Post");
							String forum  = input.nextLine(); 
							Forum.listOfForums.add(Forum.getNumForums(), new Forum(subject, forum));


						}else if (decision.equalsIgnoreCase("create comment")){
							System.out.println("Enter Forum Subject");
							String subject  = input.nextLine(); 
							System.out.println("Enter Forum Post");
							String comment  = input.nextLine(); 
							Forum.makeComment(subject, comment);
						}else if (decision.equalsIgnoreCase("view")){
							System.out.println("Enter Forum Subject you want to view");
							String subject  = input.nextLine(); 
							System.out.println(Forum.viewForum(subject));

						}else if (decision.equalsIgnoreCase("view subjects")){
							System.out.println(Forum.viewForumSubject());

						}else if (decision.equalsIgnoreCase("logout")){
							
							Mentor.listOfMentors.get(Mentor.numMentor).logout();
						}
						
						
						
					}
					
					
					
				}
				
				
			}else {//This is for when they are already logged in
				System.out.println("What would you like to do. Create Post, View Post");
				String decision  = input.nextLine(); 
				if(decision.equalsIgnoreCase("create forum")) {

					System.out.println("Enter Forum Subject");
					String subject  = input.nextLine(); 
					System.out.println("Enter Forum Post");
					String forum  = input.nextLine(); 
					Forum.listOfForums.add(Forum.getNumForums(), new Forum(subject, forum));


				}else if (decision.equalsIgnoreCase("create comment")){
					System.out.println("Enter Forum Subject");
					String subject  = input.nextLine(); 
					System.out.println("Enter Forum Post");
					String comment  = input.nextLine(); 
					Forum.makeComment(subject, comment);
				}else if (decision.equalsIgnoreCase("view")){
					System.out.println("Enter Forum Subject you want to view");
					String subject  = input.nextLine(); 
					System.out.println(Forum.viewForum(subject));

				}
				else if (decision.equalsIgnoreCase("view subjects")){
					System.out.println(Forum.viewForumSubject());

				}
				

			}
		}
				
	}
			
		

}


