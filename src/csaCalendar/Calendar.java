package csaCalendar;

public class Calendar {
    private int year;
    private Month[] calendar;
    private final String[] monthNames = new String[]{"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private int[] monthLengths;


    public Calendar(int year) {
        this.year = year;
        int feb = 28;
        calendar = new Month[12];
        if (isLeapYear(year))
             feb = 29;
        monthLengths = new int[]{31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = findFirstDay(year);
        for (int i = 0; i < 12; ++i) {
            calendar[i] = new Month(monthNames[i], monthLengths[i], day);
            day += monthLengths[i];
            day %= 7;
        }
    }

    private static int findFirstDay(int year) {
        return ((year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 + 1) %7;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    @Override
    public String toString() {
        String s = year + "\n";
        for (Month m : calendar) {
            s += m + "\n";
        }
        return s;
    }
}
