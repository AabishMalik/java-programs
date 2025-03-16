package lab;
/*
 * To create an update and delete method in the Student class.
*/

class Student3 {

    private String name, section;
    private int roll_no;

    public Student3(String name, int roll_no, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
    }

    public String getName() { return this.name; }
    public int getRoll_no() { return roll_no; }
    public String getSection() { return section; }

    public void updateStudent(String name, int roll_no, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
    }

    public void deleteStudent() {
        this.name = null;
        this.roll_no = 0;
        this.section = null;
    }

}

public class prog3 {
    public static void main(String[] args) {
        Student3 student = new Student3("Aabish Malik", 57, "A1");
        System.out.println("Student details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRoll_no());
        System.out.println("Section: " + student.getSection());

        student.updateStudent("Aabish", 57, "A1");
        System.out.println("Student details after update:");
        System.out.println("Name: " + student.getName());   
        System.out.println("Roll No: " + student.getRoll_no());
        System.out.println("Section: " + student.getSection());
        

        student.deleteStudent();
        System.out.println("Student details after delete:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRoll_no());
        System.out.println("Section: " + student.getSection());

    }
}
