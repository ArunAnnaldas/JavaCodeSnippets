package enumeration_5.enumsUsageForSorting;

public class _4_SortingFieldOrder {
	private _3_SortingField sortingField;
	private _2_SortingOrder sortingOrder;

	public _4_SortingFieldOrder() {
		super();
	}

	public _4_SortingFieldOrder(final _3_SortingField sortingField) {
		this();
		this.sortingField = sortingField;
	}

	public _4_SortingFieldOrder(final _3_SortingField sortingField, final _2_SortingOrder sortingOrder) {
		this(sortingField);
		this.sortingOrder = sortingOrder;
	}

	public _3_SortingField getSortingField() {
		return sortingField;
	}

	public void setSortingField(_3_SortingField sortingField) {
		this.sortingField = sortingField;
	}

	public _2_SortingOrder getSortingOrder() {
		return sortingOrder;
	}

	public void setSortingOrder(_2_SortingOrder sortingOrder) {
		this.sortingOrder = sortingOrder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sortingField == null) ? 0 : sortingField.hashCode());
		return result;
	}

	// checked only for SortingField to make sure that we can't add any field twice.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_4_SortingFieldOrder other = (_4_SortingFieldOrder) obj;
		if (sortingField != other.sortingField)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SortingFieldOrder [sortingField=").append(sortingField).append(", sortingOrder=")
				.append(sortingOrder).append("]");
		return builder.toString();
	}
}
