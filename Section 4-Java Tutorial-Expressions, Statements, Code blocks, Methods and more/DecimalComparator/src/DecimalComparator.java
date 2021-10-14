import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) throws Exception {
        areEqualByThreeDecimalPlaces(1.111, 1.1119);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        double lnum1 = ((long)(num1*1e3))/1e3 ;
        double lnum2 = ((long)(num2*1e3))/1e3 ;
        if (lnum1 == lnum2) {
            return true;
        } 
        return false;
        
    }
}
