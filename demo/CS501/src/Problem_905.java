
import java.util.GregorianCalendar;

public class Problem_905 {
    public static void main(String[] args) {
        GregorianCalendar calender = new GregorianCalendar();

        System.out.println("\nCurrent year, month, and day (MM/DD/YY): ");
        System.out.println(calender.get(calender.MONTH)+1 + "/" +
                calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));

        calender.setTimeInMillis(1234567898765L);

        System.out.print("\nElapsed time since January 1, 1970 set to " +
                "1234567898765L  (MM/DD/YY): ");
        System.out.println(calender.get(calender.MONTH)+1 + "/" +
                calender.get(calender.DAY_OF_MONTH) + "/" + calender.get(calender.YEAR));


    }
}
