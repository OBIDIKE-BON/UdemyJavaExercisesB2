public class IntEqualityPrinter {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void printEqual(int value1, int value2, int value3) {
        if (value1 < 0 || value2 < 0 || value3 < 0) {
            System.out.println(INVALID_VALUE);
        } else {
            if (value1 == value2) {
                if (value1==value3){
                    System.out.println("All numbers are equal");
                }else {
                    System.out.println("Neither all are equal or different");
                }
            } else if (value2==value3) {
                System.out.println("Neither all are equal or different");
            }else if (value1== value3){
                System.out.println("Neither all are equal or different");
            }else {
                System.out.println("All numbers are different");
            }
        }
    }
}
