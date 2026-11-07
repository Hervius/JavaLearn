public class Wohnung{

    private int rooms;
    private double price;
    private String rentee;

    Wohnung(int rooms, double price){
        this.rooms = rooms;
        this.price = price;
        this.rentee = "";
    }

    void rent(String name){
        rentee = name;
    }

    void moveOut(){
        this.rentee = "";

    }

    void print(){
        System.out.println("This flat has " + rooms + " rooms, costs " + price + " Eur and is currently rented by " + rentee + ".");

    }

    public static void main(String[] args){
        Wohnung flat = new Wohnung(10, 190.5);
        flat.rent("Richard");
        flat.print();
    }

}


