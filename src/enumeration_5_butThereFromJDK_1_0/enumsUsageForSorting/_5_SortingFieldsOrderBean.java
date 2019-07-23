package enumeration_5_butThereFromJDK_1_0.enumsUsageForSorting;

import java.util.ArrayList;
import java.util.List;

public class _5_SortingFieldsOrderBean {
	private List<_4_SortingFieldOrder> fieldsOrder = new ArrayList<_4_SortingFieldOrder>();

	public _5_SortingFieldsOrderBean() {
		super();
	}

	// To Create SortingFieldOrder in ASC or DESC order
	public synchronized _5_SortingFieldsOrderBean addField(final _4_SortingFieldOrder fieldOrder) {
		// contains will check the implemented equals method of SortingFieldOrder
		// and will make sure that we have not added any SortingField twice.
		if (!fieldsOrder.contains(fieldOrder)) {
			fieldsOrder.add(fieldOrder);
		}
		return this;
	}

	// To Create SortingFieldOrder in ASC order
	public synchronized _5_SortingFieldsOrderBean addField(final _3_SortingField field) {
		_4_SortingFieldOrder fieldOrder = new _4_SortingFieldOrder(field);
		if (!fieldsOrder.contains(fieldOrder)) {
			fieldsOrder.add(fieldOrder);
		}
		return this;
	}

	// To Create SortingFieldOrder in ASC or DESC order
	public synchronized _5_SortingFieldsOrderBean addField(final _3_SortingField field, final _2_SortingOrder order) {
		_4_SortingFieldOrder fieldOrder = new _4_SortingFieldOrder(field, order);
		if (!fieldsOrder.contains(fieldOrder)) {
			fieldsOrder.add(fieldOrder);
		}
		return this;
	}

	public List<_4_SortingFieldOrder> getFieldsInOrder() {
		return fieldsOrder;
	}

	@Override
	public String toString() {
		return "SortingFieldsOrderBean [fieldsOrder=" + fieldsOrder + "]";
	}
}