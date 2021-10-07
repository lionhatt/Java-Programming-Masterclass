public class MegaBytesConverter {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int quotient = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.print(kiloBytes + " KB = " + quotient + " MB and " + remainder + " KB");
        }
    }
}
