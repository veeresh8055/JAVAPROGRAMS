import java.util.Scanner;

class Reciept {
    int recieptNo;
    String name;
    double amount;
    int quantity;

    public Reciept(int recieptNo, String name, double amount, int quantity) {
        this.recieptNo = recieptNo;
        this.name = name;
        this.amount = amount;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("reciept number : " + recieptNo);
        System.out.println(" reciept name   : " + name);
        System.out.println("Amount   : " + amount);
        System.out.println("Quantity  : " + quantity);

    }

}

public class program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("reciept number");
        int recieptNo = sc.nextInt();

        System.out.println("name ");
        String name = sc.next();

        System.out.println("type  ");
        double amount = sc.nextDouble();

        System.out.println("Quantity");
        int quantity = sc.nextInt();

        Reciept r1 = new Reciept(recieptNo, name, amount, quantity);
        r1.display();

        sc.close();
    }
}