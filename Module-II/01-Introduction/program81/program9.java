import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the sim card");

        String name = sc.nextLine();
        
        System.out.println("Enter the network of the sim card");
        String network = sc.nextLine();

        System.out.println("Enter the price of the sim card");
        int price = sc.nextInt();

        System.out.println("Enter the type of the sim card");
        String type = sc.next();

        simCard s = new simCard(name, network, price, type);
        s.display();
    }
    
}

class simCard {
    String name;
    String network;
    int price;
    String type;

    public simCard(String name, String network, int price, String type) {
        this.name = name;
        this.network = network;
        this.price = price;
        this.type = type;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Network : " + network);
        System.out.println("Price : " + price);
        System.out.println("Type : " + type);

    }
}