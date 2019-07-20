package enumeration_5.enumsUsageForSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		// preparing some hard-coded data to keep code simple and focused.
		ArrayList<_1_Student> studentList = new ArrayList<_1_Student>();
		studentList.add(new _1_Student(101, "Vijay", 24, 98));
		studentList.add(new _1_Student(109, "Ajay", 27, 86));
		studentList.add(new _1_Student(108, "Jai", 26, 49));
		studentList.add(new _1_Student(106, "Ajay", 23, 45));
		studentList.add(new _1_Student(104, "Jai", 26, 62));
		studentList.add(new _1_Student(103, "Vijay", 23, 98));
		studentList.add(new _1_Student(105, "Jai", 21, 54));
		System.out.println("Sorting by Name...");
		// SortingFieldsOrderBean order = new SortingFieldsOrderBean();
		// order.addField(SortingField.NAME);
		// Or in short because of chaining based implementation of addField method by
		// returning current object (return this)
		_5_SortingFieldsOrderBean order = new _5_SortingFieldsOrderBean().addField(_3_SortingField.NAME);
		Collections.sort(studentList, new _6_StudentComparator(order));
		printStudentList(studentList);
		System.out.println("Sorting by Name and age (both ascending)...");
		order = new _5_SortingFieldsOrderBean().addField(_3_SortingField.NAME).addField(_3_SortingField.AGE);
		Collections.sort(studentList, new _6_StudentComparator(order));
		printStudentList(studentList);
		System.out.println("Sorting by Name and age (desc) and rollno...");
		order = new _5_SortingFieldsOrderBean().addField(_3_SortingField.NAME)
				.addField(_3_SortingField.AGE, _2_SortingOrder.DESC).addField(_3_SortingField.ROLLNO);
		Collections.sort(studentList, new _6_StudentComparator(order));
		printStudentList(studentList);
		System.out.println("sorting by age...");
		order = new _5_SortingFieldsOrderBean().addField(_3_SortingField.AGE);
		Collections.sort(studentList, new _6_StudentComparator(order));
		// Or Simply we can write as below
		// Collections.sort(studentList, SortingField.AGE);
		// Remember we have implemented java.util.Comparator in the SortingField as well
		// This will work ONLY when we have to sort on ONE field only.
		printStudentList(studentList);
		System.out.println("sorting by rollno in descending order...");
		order = new _5_SortingFieldsOrderBean().addField(_3_SortingField.ROLLNO, _2_SortingOrder.DESC);
		Collections.sort(studentList, new _6_StudentComparator(order));
		// Or Simply we can write as below
		// Collections.sort(studentList, SortingField.ROLLNO);
		printStudentList(studentList);
		System.out.println("sorting by result, marks descending, rollno in ascending order...");
		order = new _5_SortingFieldsOrderBean().addField(_3_SortingField.RESULT)
				.addField(_3_SortingField.MARKS, _2_SortingOrder.DESC).addField(_3_SortingField.ROLLNO);
		Collections.sort(studentList, new _6_StudentComparator(order));
		printStudentList(studentList);
	}

	private static void printStudentList(ArrayList<_1_Student> studentList) {
		for (_1_Student student : studentList) {
			System.out.println(student);
		}
		System.out.println();
	}
}