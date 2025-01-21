public class Student {
    int orgID = 1234;
    String orgName = "Vignan University";
    int noOfDepts = 4;
    double netWorth = 500.00;
    static String chairman = "Dr. Lara";

    public static void main(String[] args) {
        int sID = 420;
        String sName = "Chitti";
        String sDept = "CSE";

        Student s1 = new Student();
        System.out.println(s1.getNetWorth());
        System.out.println(s1.getOrgName());

        Student s2 = new Student();
    }

    public double getNetWorth() {
        return netWorth;
    }

    public String getOrgName() {
        return orgName;
    }

     public void getDetails(int id) {
        System.out.println("Student ID: " + id);
     }
}
