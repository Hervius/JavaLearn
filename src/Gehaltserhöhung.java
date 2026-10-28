public class Gehaltserhöhung {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // System.out.println("Zahl: ");
        int zahl = scanner.nextInt();

        if(zahl%2 == 0){
            System.out.println("Die Zahl " + zahl + " ist gerade");
        } else {
            System.out.println("Die Zahl " + zahl + " ist ungerade");
        }

        //System.out.print("x = ");
        int x = scanner.nextInt();
        //System.out.print("y = ");
        int y = scanner.nextInt();

        // Check if x is smaller than y,
        // if true write "smaller"
        if(x < y){
            System.out.println("smaller");
        }
        // Check if x equals y,
        // if true write "equals"
        if(x == y){
            System.out.println("equals");
        }

        // Check if x is greater than y,
        // if true write "greater"
        if(x > y){
            System.out.println("greater");
        }
    }
}

