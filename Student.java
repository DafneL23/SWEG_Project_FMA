import java.util.ArrayList;
import java.util.List;

public class Student {
	
	String name;
	String password;
	String username;
	boolean isLoggedIn;
	public static List<Student> listOfStudents = new ArrayList<>();
	
	public  List<Student> followers = new ArrayList<>();
	public  List<Student> following = new ArrayList<>();
	
	static int studentIndex=0;
	static int numStudent=-1;
	
	public static int getNumStudents() {
		return studentIndex;
	}
	
	public static int numStudent() {
		return numStudent;
	}
	
	public Student(String nameInput, String usernameInput, String passwordInput) {
		name = nameInput;
		password = passwordInput;
		username = usernameInput;
		System.out.println("Student made");
		isLoggedIn = false;
		studentIndex++;
		
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public static boolean login (String usernameInput, String passwordInput) {
		boolean found = false;
		for (int i= 0; i < studentIndex; i++) {
			if (listOfStudents.get(i).getUsername().equals(usernameInput) ){
				if (listOfStudents.get(i).getPassword().equals(passwordInput)) {
					System.out.println("Login Successful");
					numStudent = i;
					listOfStudents.get(i).isLoggedIn = true;
				}
				
			}
			
		}
		
		
//		if(usernameInput == username && passwordInput == password) {
//			System.out.println("You are logged in");
//		}else {
//			System.out.println("Either the username or password is wrong");
//		}
		
		return true;
	}
	
	public void logout() {
		listOfStudents.get(numStudent).isLoggedIn = false;
	}

}
