public class Zahlenraten {
    public static void main(String[] args) {
        int ratezahl = 20;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Zahl: ");
        int zahl = scanner.nextInt();
        scanner.close();

        int min = (int)(ratezahl * 0.7);   // 14
        int max = (int)(ratezahl * 1.3);   // 26

        if (zahl == ratezahl) {
            System.out.println("Bullseye! Du hast die Zahl erraten!");
        } else if (zahl >= min && zahl <= max) {
            System.out.printf(
                    "Super! Die zu erratende Zahl war %d. Du bist im Intervall (%d, %d)%n",
                    ratezahl, min, max);
        } else {
            System.out.printf(
                    "Schade! Die zu erratende Zahl war %d. Du warst ausserhalb des Intervalls (%d, %d)%n",
                    ratezahl, min, max);
        }
    }
}