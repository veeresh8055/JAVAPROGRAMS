import java.util.Scanner;

public class program7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the water bottle");
        String name = sc.nextLine();
        System.out.println("Enter the price of the water bottle");
        int price = sc.nextInt();
        System.out.println("Enter the capacity of the water bottle");
        int capacity = sc.nextInt();
        System.out.println("Enter the type of the water bottle");
        String type = sc.next();

        waterBottle bottle1 = new waterBottle(name, price, capacity, type);

        bottle1.display();
   
    
    }

    
}
class waterBottle{
    String name;
    int price;
    int capacity;
    String type;

    public waterBottle(String name, int price, int capacity, String type) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.type = type;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Capacity : " + capacity);
        System.out.println("Type : " + type);

    }
}
