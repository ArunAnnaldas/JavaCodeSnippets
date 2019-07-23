package enumeration_5_butThereFromJDK_1_0;

/**
 * 
 * If no access modifier is specified for the constructor of an enum type, the
 * constructor is private.
 * 
 * It is a compile-time error if the constructor of an enum type (§8.9) is
 * declared public or protected.
 *
 */

enum WeekDays1 {
	SUNDAY("Sunday Funday", true), MONDAY("Marketing Monday"), TUESDAY("Trendy Tuesday"), WEDNESDAY(
			"Wellness Wednesday"), THURSDAY(
					"Thankful Thursday"), FRIDAY("Foodie Friday"), SATURDAY("Social Saturday", true);

	private String daysGreeting;
	private boolean isWeekend;

	WeekDays1(final String daysGreeting) {
		this.daysGreeting = daysGreeting;
	}

	WeekDays1(final String daysGreeting, final boolean isWeekend) {
		this(daysGreeting);
		this.isWeekend = isWeekend;
	}

	public String getDaysGreeting() {
		return daysGreeting;
	}

	public boolean isWeekend() {
		return isWeekend;
	}
}

public class _3_enumWithValues {
	public static void main(String[] args) {
		WeekDays1 wd = WeekDays1.THURSDAY;
		System.out.println(wd.getDaysGreeting());
		if (wd.isWeekend()) {
			doYourTaskForWeekEnds();
		} else {
			doYourTaskForWeekDays1(wd);
		}
	}

	private static void doYourTaskForWeekEnds() {
		System.out.println("Relax and Enjoy! It's Weekend :)");
	}

	private static void doYourTaskForWeekDays1(WeekDays1 WeekDays1) {
		System.out.println("Ohh! It's a weekday. Have to work!");
	}
}