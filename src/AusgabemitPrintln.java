public class AusgabemitPrintln {
    public static void main(String[] args) {
        int year = 2009;
        String color = "red";
        double price = 3999.99;
        float consumption = 6.5f;

        // Create your output afterwards
        System.out.println("The car is from " + year + ", has the color "+ color + ", consumes " + consumption +
                " l/100km and costs " + price + " Euros.");

        System.out.printf("The car is from %d, has the color %s, consumes %f l/100km and costs %f Euros.", year, color, consumption, price);

    }
}
