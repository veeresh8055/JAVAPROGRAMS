import java.util.Scanner;

public class program6 {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of the battery");
   String  name = sc.nextLine();

    System.out.println("Enter the price of the battery");
    int price = sc.nextInt();

    System.out.println("Enter the capacity of the battery");
    int capacity = sc.nextInt();

    System.out.println("Enter the type of the battery");
    String type = sc.next();

    mobilebattery battery1 = new mobilebattery(name, price, capacity, type);

    battery1.display();

    sc.close();  

   }

}

class mobilebattery {
    String name;
    int price;
    int capacity;
    String type;

    public mobilebattery(String name, int price, int capacity, String type) {
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