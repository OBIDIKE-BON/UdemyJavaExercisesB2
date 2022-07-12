public class MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            double hours = minutes / 60.0;
            double days = hours / 24.0;
            long years = (long) (days / 365);
            long rmDays = (long) (days % 365);


            System.out.println(minutes + " min = "  +
             years +" y and "+ rmDays+" d");
        }
    }
}
