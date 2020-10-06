class teacher {
   String designation = "Teacher";
   String collegeName = "ABCCollege";
   void does(){
	System.out.println("teaching...");
   }
}

public class ClassTeacher extends teacher{
   String mainSubject = "Mathematics";
   public static void main(String args[]){
	ClassTeacher obj = new ClassTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}