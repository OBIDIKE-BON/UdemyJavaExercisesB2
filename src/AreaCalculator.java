public class AreaCalculator {

    public static final double INVALID_AREA = -1.0;

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_AREA;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, Double y) {
        if (x < 0 || y < 0) {
            return INVALID_AREA;
        }
        return x * y;
    }
}
