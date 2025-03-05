package lab;

class Student {
  private String name,section;
  private int roll_no;
  Student() {
    this.name = "No Name";
    this.section = "No Section";
    this.roll_no = 0;
  }

  public void setName(String name) { this.name = name; }

  public String getName() { return this.name; }

  public void setRoll_no(int roll_no) { this.roll_no = roll_no; }

  public int getRoll_no() { return roll_no; }

  public void setSection(String section) { this.section = section; }
  public String getSection() { return section; }
}

class Course {

  private String course_name;
  private int course_code, credits;

  Course() {
    this.course_name = "No Course";
    this.course_code = 0;
    this.credits = 0;
  }

  public void setCourse_name(String course_name) { this.course_name = course_name; }

  public String getCourse_name() { return course_name; }
  
  public void setCourse_code(int course_code) { this.course_code = course_code; }
  public int getCourse_code() { return course_code; }

  public void setCredits(int credit_hour) { this.credits = credit_hour; }
  public int getCredits() { return credits; }
}

public class prog1 {
  public static void main(String[] args) {
    Student student = new Student();
    student.setName("Aabish Malik");
    student.setRoll_no(57);
    student.setSection("A1");

    Course course = new Course();
    course.setCourse_name(
        "Introduction to object oriented programming using Java");
    course.setCourse_code(411);
    course.setCredits(4);

    System.out.println("Student Name: " + student.getName());
    System.out.println("Roll No: " + student.getRoll_no());
    System.out.println("Section: " + student.getSection());

    System.out.println("Course Name: " + course.getCourse_name());
    System.out.println("Course Code: " + course.getCourse_code());
    System.out.println("Credits: " + course.getCredits());
  }
}
