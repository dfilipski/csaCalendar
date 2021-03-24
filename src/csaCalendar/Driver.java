package csaCalendar;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            calendarPrompt(sc);

            System.out.print("Do you want to generate another calendar? ");
            if (sc.hasNextLine())
                sc.nextLine();
            String response = sc.nextLine();
            if (response.toLowerCase().charAt(0) != 'y')
                break;
        }
    }

    private static void calendarPrompt(Scanner sc) {
        Calendar cal;

        System.out.print("Enter a year greater than 1582: ");
        int year = sc.nextInt();

        while (year < 1582) {
            System.out.print("Enter a year greater than 1582: ");
            year = sc.nextInt();
        }

        cal = new Calendar(year);

        System.out.println(cal.toString());
    }
}
