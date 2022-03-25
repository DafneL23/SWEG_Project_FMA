import java.util.ArrayList;
import java.util.List;
//testing a push/commit @Dafne 

public class Forum {
	

    String subject;
	String text;
	String username;
	public static List<Forum> listOfForums = new ArrayList<>();
    public static List<String> listOfSubjects = new ArrayList<>();
    public List<String> listOfComments;
    static int forumIndex=0;

    public Forum(String subjectInput, String textInput){

        subject = subjectInput;
        text = textInput;
        listOfComments = new ArrayList<>();
        listOfComments.add(text);
        forumIndex++;
        

    }

    public static int getNumForums() {
		return forumIndex;
	}

    public List<String> getAllForumSubjects(){

        return listOfSubjects;


    }

    public String getForumSubject(){

        return subject;


    }

    public void setComment(String comment){

        listOfComments.add(comment);

    }

    public static void makeComment(String subjectInput, String comment){

        boolean found = false;
		for (int i= 0; i < forumIndex; i++) {
            
			if (listOfForums.get(i).getForumSubject().equals(subjectInput) ){
				
				listOfForums.get(i).setComment(comment);
                System.out.println("Comment successfully made");
                
				
			}
			
		}



    }
    public static List<String> viewForum(String subjectInput){
        System.out.println("Hello");
        for (int i= 0; i < forumIndex; i++) {
            System.out.println(listOfForums.get(i).getForumSubject());
			if (listOfForums.get(i).getForumSubject().equals(subjectInput) ){
                System.out.println("we got here heheeh");
				return listOfForums.get(i).listOfComments;
				
                
				
			}
			
		}
        return null;

    }
    public static List<String> viewForumSubject(){
    	listOfSubjects.clear();
    	for (int i= 0; i < forumIndex; i++) {
            System.out.println(listOfForums.get(i).getForumSubject());
            listOfSubjects.add(listOfForums.get(i).getForumSubject());
    	}
    	return listOfSubjects;
    	
    }


}
