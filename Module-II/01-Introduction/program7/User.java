import java.util.Scanner;

class UserRegistration {
    String username;
    String email;
    long number;

    public UserRegistration(String username, String email, long number) {
        this.username = username;
        this.email = email;
        this.number = number;
    }

    public UserRegistration(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public UserRegistration(String username, long number) {
        this.username = username;
        this.number = number;
    }

    void display() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + number);
    }
}

public class User {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for username, email, phone");
        System.out.println("Enter 2 for username, email");
        System.out.println("Enter 3 for username, phone");
        
        int n = sc.nextInt();

        if (n == 1) {
            System.out.print("Enter username: ");
            String username = sc.next();

            System.out.print("Enter email: ");
            String email = sc.next();

            System.out.print("Enter phone number: ");
            long number = sc.nextLong();

            UserRegistration user1 = new UserRegistration(username, email, number);
            user1.display();

        } else if (n == 2) {
            System.out.print("Enter username: ");
            String username = sc.next();

            System.out.print("Enter email: ");
            String email = sc.next();

            UserRegistration user1 = new UserRegistration(username, email);
            user1.display();

        } else if (n == 3) {
            System.out.print("Enter username: ");
            String username = sc.next();

            System.out.print("Enter phone number: ");
            long number = sc.nextLong();

            UserRegistration user1 = new UserRegistration(username, number);
            user1.display();

        } else {
            System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        }

        sc.close();
    }
}