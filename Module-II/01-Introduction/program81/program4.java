import java.util.Scanner;

public class program4 {
       public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Card number");
        int cardNo  = sc.nextInt();

        System.out.println("name ");
        String name  = sc.next();

        System.out.println("Expiry  ");
        int  expiry  = sc.nextInt();

        System.out.println("Bank Name  ");
        String size = sc.next();


        DebitCard d1 = new DebitCard(cardNo, name, expiry, name);
        d1.details();
     

        sc.close();
    }
}


class DebitCard {
    long cardNo;
    String name;
    int expiry;
    String bankName;

    public DebitCard(long cardNo, String name, int expiry, String bankName) {
        this.cardNo = cardNo;
        this.name = name;
        this.expiry = expiry;
        this.bankName = bankName;
    }

    void details() {
        System.out.println("Card No : " + cardNo);
        System.out.println("Card Holder : " + name);
        System.out.println("Expiry Date  : " + expiry);
        System.out.println("Bank name  : " + bankName);
    }

}