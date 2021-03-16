package csaCalendar;

public class Month {
    private String name;
    private int days;
    private String firstDay;
    private int firstDayNumber;
    private final String[] weekDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday"};

    public Month(String name, int days, int firstDayNumber) {
        this.name = name;
        this.days = days;
        this.firstDay = weekDays[firstDayNumber];
        this.firstDayNumber = firstDayNumber;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", days=" + days +
                ", firstDay='" + firstDay + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getFirstDay() {
        return firstDay;
    }
}
