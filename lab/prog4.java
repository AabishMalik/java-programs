package lab;

import java.util.*;

/* To Search Student details of a Course using a parameretized constructor of Course Class.
 * To Get the Results of Students by Roll No.s using a method on Course class
 */
class Student4 {
	String name, section;
	int roll_no;

	public Student4(String name, int roll_no, String section) {
		this.name = name;
		this.roll_no = roll_no;
		this.section = section;

	}
}

class Course4 {
	ArrayList<Student4> students;
	String name;
	int credits;

	Course4(String name, int credits) {
		this.name = name;
		this.credits = credits;
		this.students = new ArrayList<Student4>();
	}

	void add_student(Student4 student) {
		if (get_student(student.roll_no) != null) {
			return;
		}

		this.students.add(student);

	}

	Student4 get_student(int roll_no) {
		for (Student4 st : this.students) {
			if (st.roll_no == roll_no) {
				return st;
			}
		}
		return null;
	}
}

public class prog4 {
	public static void main(String[] args) {
		Course4 course = new Course4("Introduction to Object-Oriented Programming", 4);
		course.add_student(new Student4("Aabish Malik", 57, "A1"));
		course.add_student(new Student4("Ashank Gupta", 42, "A1"));
		course.add_student(new Student4("Dhruv Sharma", 32, "A1"));

		find(course, 57);
		find(course, 32);
		find(course, 1);
		
		
	}
	static void find(Course4 course, int roll_no){
		Student4 st = course.get_student(roll_no);
		if (st == null){
			System.err.println("Student not Found");
		}else{
			System.out.printf("Found Student : (%s,%d,%s)\n", st.name, st.roll_no,  st.section);
		}
	}
}
