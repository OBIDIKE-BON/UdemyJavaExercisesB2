public class Main {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 5.0));
        MinutesToYearsDaysCalculator.printYearsAndDays(7994);
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(-1,-1,-1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(1,2,3);
        IntEqualityPrinter.printEqual(2,1,1);
    }
}
