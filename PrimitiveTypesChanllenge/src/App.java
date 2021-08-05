public class App {
    public static void main(String[] args) throws Exception {
        byte byteVar = 1;
        short shortVar = 1;
        int intVar = 1;
        long longVar = 50000 + 10 * (byteVar + shortVar + intVar);
        System.out.println(longVar);
    }
}
