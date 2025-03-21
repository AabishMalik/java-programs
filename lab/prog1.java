package lab;

class Student1 {
  String name,section;
  int roll_no;
  Student1() {
    this.name = "No Name";
    this.section = "No Section";
    this.roll_no = 0;
  }

}

class Course1 {

  String course_name;
  int course_code, credits;

  Course1() {
    this.course_name = "No Course";
    this.course_code = 0;
    this.credits = 0;
  }
}

public class prog1 {
  public static void main(String[] args) {
    Student1 student = new Student1();
    student.name = "Aabish Malik";
    student.roll_no = 57;
    student.section = "A1";

    Course1 course = new Course1();
    course.course_name = "Introduction to object oriented programming using Java";
    course.course_code = 411;
    course.credits =  4;

    System.out.println("Student Name: " + student.name);
    System.out.println("Roll No: " + student.roll_no);
    System.out.println("Section: " + student.section);

    System.out.println("Course Name: " + course.course_name);
    System.out.println("Course Code: " + course.course_code);
    System.out.println("Credits: " + course.credits);
  }
}
