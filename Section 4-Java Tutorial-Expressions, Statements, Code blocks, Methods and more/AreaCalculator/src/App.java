public class App {
    public static void main(String[] args) throws Exception {
        area(5.0);
        area(-1);
        area(5.0, 4.0);
        area(-1.0, 4.0);
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return Math.PI*radius*radius;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y <0)) {
            return -1.0;
        }
        return x*y;
    }
}
