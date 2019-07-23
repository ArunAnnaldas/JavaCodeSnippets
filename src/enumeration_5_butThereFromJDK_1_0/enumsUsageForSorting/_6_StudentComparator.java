package enumeration_5_butThereFromJDK_1_0.enumsUsageForSorting;

import java.util.Comparator;
import java.util.List;

public class _6_StudentComparator implements Comparator<_1_Student> {
	private _5_SortingFieldsOrderBean orderBean;

	public _6_StudentComparator(final _5_SortingFieldsOrderBean orderBean) {
		super();
		if (orderBean == null || orderBean.getFieldsInOrder() == null || orderBean.getFieldsInOrder().isEmpty()) {
			throw new IllegalArgumentException("SortingFieldsOrderBean can't be null or empty");
		}
		this.orderBean = orderBean;
	}

	@Override
	public int compare(_1_Student student1, _1_Student student2) {
		List<_4_SortingFieldOrder> orderFields = orderBean.getFieldsInOrder();
		return compareInFieldOrder(orderFields, student1, student2);
	}

	// recursive method to perform sorting on multiple fields and order.
	private int compareInFieldOrder(final List<_4_SortingFieldOrder> orderFields, final _1_Student student1,
			final _1_Student student2) {
		_4_SortingFieldOrder fieldOrder = orderFields.get(0);
		_3_SortingField field = fieldOrder.getSortingField();
		_2_SortingOrder order = fieldOrder.getSortingOrder();
		int comparisonResult = field.compare(student1, student2, order);
		// we check if the objects are same on the field comparison;
		// if yes and there are any remaining fields to compare
		// we call the method recursively by taking the sublist of order fields.
		if (comparisonResult == 0 && orderFields.size() > 1) {
			return compareInFieldOrder(orderFields.subList(1, orderFields.size()), student1, student2);
		}
		return comparisonResult;
	}
}