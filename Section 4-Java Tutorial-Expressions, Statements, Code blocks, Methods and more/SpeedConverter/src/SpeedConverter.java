public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double dmilesPerHour = kilometersPerHour / 1.609d;
            long milesPerHour = Math.round(dmilesPerHour);
            return milesPerHour;
        }
    }
    
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.print(kilometersPerHour + " km/h= " + milesPerHour + " mi/h");
        }
    }
}
