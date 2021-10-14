public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int numSum = num1 + num2;
        if (numSum == num3) {
            return true;
        }
        return false;
    }
}
