public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfTheDay) {
        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            return false;
        } else {
            if (isBarking) {
                if (hourOfTheDay < 8 || hourOfTheDay > 22) {
                    return true;
                }
            }
        }
        return false;
    }
}
