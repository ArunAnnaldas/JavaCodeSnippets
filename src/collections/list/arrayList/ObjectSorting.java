package collections.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Sort method on an ArrayList of Objects which actually doesn’t work until
 * unless we use interfaces like Comparable and Comparator
 * 
 * Sort the ArrayList<Student> based on the student Age property. This is how it
 * can be done – First implement Comparable interface and then Override the
 * compareTo method.
 * 
 * @author aannaldas
 *
 */

class Student implements Comparable {

	private String studentname;
	private int rollno;
	private int studentage;

	public Student(int rollno, String studentname, int studentage) {
		this.rollno = rollno;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public Integer getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public int compareTo(Object compareStu) {
		int compareage = ((Student) compareStu).getStudentage();
		/* For Ascending order */
		return this.getStudentage().compareTo(((Student) compareStu).getStudentage());
	}

	@Override
	public String toString() {
		return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}
}

public class ObjectSorting {
	public static void main(String args[]) {
		ArrayList<Student> arraylist = new ArrayList<Student>();
		arraylist.add(new Student(223, "Chaitanya", 26));
		arraylist.add(new Student(249, "Rahul1", 21));
		arraylist.add(new Student(245, "Rahul", 24));
		arraylist.add(new Student(209, "Ajeet", 32));

		Collections.sort(arraylist);

		for (Student str : arraylist) {
			System.out.println(str);
		}
	}
}
