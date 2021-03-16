package csaCalendar;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
