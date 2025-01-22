public class Studentupdateinfo{
	static Student1 updateInfo(Student1 s) {
		s.sid = 12;
	    s.name = "Bhargavi";
         s.address="marerlla";
         s.cgpa=9;
		return s;
	}
   public static void main(String [] args) {
	   Student1  s1 = new Student1();
	   System.out.println(s1.sid);
	   System.out.println(s1.name);
	   System.out.println(s1.cgpa);
	   System.out.println(s1.address);
	   updateInfo(s1);
	   System.out.println(s1.sid);
	   System.out.println(s1.name);
	   System.out.println(s1.cgpa);
	   System.out.println(s1.address);
   }
}
class Student1 {
	int sid=12;
	String name ="Bhargavi";
	int cgpa =9;
	String address ="marerlla";
	
}
