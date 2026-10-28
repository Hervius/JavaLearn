public class EingabeLesen {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // Assign the result of the call to a local
        // variable using String as data type
        String name = scanner.nextLine();

        // Output the result with System.out.println
        System.out.println(name);
    }
}
