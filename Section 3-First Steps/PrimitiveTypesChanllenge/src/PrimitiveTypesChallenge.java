public class PrimitiveTypesChallenge {
    public static void main(String[] args) throws Exception {
        byte byteVar = 1;
        short shortVar = 1;
        int intVar = 1;
        long longVar = 50000L + 10L * (byteVar + shortVar + intVar);
        System.out.println(longVar);

        short shortValue = (short) (1000 + 10 * (byteVar + shortVar + intVar));
    }
}
