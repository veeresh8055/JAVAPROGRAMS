import java.util.Scanner;

class Email {
    String sender;
    String reciever;
    String subject;
    String description;

    public Email(String sender, String reciever, String subject, String description) {
        this.sender = sender;
        this.reciever = reciever;
        this.subject = subject;
        this.description = description;
    }

    void send() {
        System.out.println("sender : " + sender);
        System.out.println("reciever : " + reciever);
        System.out.println("subject : " + subject);
        System.out.println("Description : " + description);

    }
}

public class main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sender  email id ");
        String sender = sc.next();

        System.out.println("Reciever email ");
        String reciever = sc.next();

        System.out.println("Subject  ");
        String subject = sc.nextLine();

        System.out.println("Description  ");
        String description = sc.next();

        Email user1 = new Email(sender, reciever, subject, description);

        user1.send();

        sc.close();

    }
}