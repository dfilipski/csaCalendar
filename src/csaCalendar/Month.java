package csaCalendar;

public class Month {
    private String name;
    private int days;
    private String firstDay;

    public Month(String name, int days, String firstDay) {
        this.name = name;
        this.days = days;
        this.firstDay = firstDay;
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
