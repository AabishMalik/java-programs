package lab;
/*
 * Allocated appropriate access specifiers to data members of Student and Course along with
 * justification in comments.
 * Added details to Students using a parameterized constructor.
 */

class Student2 {

    // Data members are private to ensure encapsulation and prevent direct access.
    private String name, section;
    private int roll_no;

    // Parameterized constructor to initialize student details.
    public Student2(String name, int roll_no, String section) {
        this.name = name;
        this.roll_no = roll_no;
        this.section = section;
    }

    // Getter and setter methods to provide controlled access to private fields.
    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setRoll_no(int roll_no) { this.roll_no = roll_no; }
    public int getRoll_no() { return roll_no; }

    public void setSection(String section) { this.section = section; }
    public String getSection() { return section; }
}

class Course2 {

    // Data members are private to ensure encapsulation and prevent direct access.
    private String course_name;
    private int course_code, credits;

    // Parameterized constructor to initialize course details.
    public Course2(String course_name, int course_code, int credits) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.credits = credits;
    }

    // Getter and setter methods to provide controlled access to private fields.
    public void setCourse_name(String course_name) { this.course_name = course_name; }
    public String getCourse_name() { return course_name; }

    public void setCourse_code(int course_code) { this.course_code = course_code; }
    public int getCourse_code() { return course_code; }

    public void setCredits(int credits) { this.credits = credits; }
    public int getCredits() { return credits; }
}

public class prog2 {
    public static void main(String[] args) {
        // Creating Student object using parameterized constructor.
        Student2 student = new Student2("Aabish Malik", 57, "A1");

        // Creating Course object using parameterized constructor.
        Course2 course = new Course2(
                "Introduction to object oriented programming using Java", 411, 4);

        // Displaying student details.
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll No: " + student.getRoll_no());
        System.out.println("Section: " + student.getSection());

        // Displaying course details.
        System.out.println("Course Name: " + course.getCourse_name());
        System.out.println("Course Code: " + course.getCourse_code());
        System.out.println("Credits: " + course.getCredits());
    }
}
