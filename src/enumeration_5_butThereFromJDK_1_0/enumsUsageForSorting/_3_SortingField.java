package enumeration_5_butThereFromJDK_1_0.enumsUsageForSorting;

import java.util.Comparator;

public enum _3_SortingField implements Comparator<_1_Student> {

	AGE {
		@Override
		public int compare(_1_Student student1, _1_Student student2) {
			return Integer.compare(student1.getAge(), student2.getAge());
		}
	},
	NAME {
		@Override
		public int compare(_1_Student student1, _1_Student student2) {
			if (student1.getName() != null && student2.getName() != null) {
				return student1.getName().compareTo(student2.getName());
			} else if (student1.getName() != null) {
				return 1;
			} else {
				return -1;
			}
		}
	},
	ROLLNO {
		@Override
		public int compare(_1_Student student1, _1_Student student2) {
			return Integer.compare(student1.getRollno(), student2.getRollno());
		}
	},
	MARKS {
		@Override
		public int compare(_1_Student student1, _1_Student student2) {
			return Integer.compare(student1.getMarks(), student2.getMarks());
		}
	},
	RESULT {
		@Override
		public int compare(_1_Student student1, _1_Student student2) {
			// the default will be reverse order (descending), pass has to come up
			// so, comparison will be student 2 vs student1
			return Boolean.compare(student2.getResult(), student1.getResult());
		}
	};

	// Below common method to control ASC or DESC order. the default is ASC.
	public int compare(_1_Student student1, _1_Student student2, _2_SortingOrder order) {
		return (_2_SortingOrder.DESC.equals(order)) ? compare(student2, student1) : compare(student1, student2);
	}
}
