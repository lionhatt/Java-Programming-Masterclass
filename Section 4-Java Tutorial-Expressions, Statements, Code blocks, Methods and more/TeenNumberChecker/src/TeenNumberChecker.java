public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        if (isTeen(num1)) return true; 
        if (isTeen(num2)) return true; 
        if (isTeen(num3)) return true; 
        return false;
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) {
            return true;
        }
        return false;
    }
}
