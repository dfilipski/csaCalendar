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
        String out = name + "\n";
        String dirtyMonth =
                "S   M   Tu  W   Th  F   S  \n" +
                " X   X    X   X    X   X   X \n" +
                " X   X    X   X    X   X   X \n" +
                " X   X    X   X    X   X   X \n" +
                " X   X    X   X    X   X   X \n" +
                " X   X    X   X    X   X   X \n" +
                " X   X    X   X    X   X   X ";
        String cleanMonth = dirtyMonth;

        for (int i = 0; i < firstDayNumber; ++i) {
            cleanMonth = cleanMonth.replaceFirst("X", "_");
        }

        for (int i = 1; i <= days; ++i) {
            cleanMonth = cleanMonth.replaceFirst("X", String.valueOf(i));
        }
        cleanMonth = cleanMonth.replaceAll("X", "");
        System.out.println(cleanMonth);

        return out + cleanMonth;
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
