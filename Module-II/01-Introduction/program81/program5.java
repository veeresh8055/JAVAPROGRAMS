import java.util.Scanner;

public class program5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("User Id ");
        int recieptNo = sc.nextInt();

        System.out.println("User Name ");
        String name = sc.next();

        System.out.println("Initial Name  ");
        String Initialname = sc.next();

        System.out.println("followers ");
        int followers = sc.nextInt();

        UserProfile u1 = new UserProfile(name, recieptNo, Initialname, followers);
        u1.display();

        sc.close();
    }
}

class UserProfile {
    String userName;
    int userId;
    String initial;
    int followers;

    public UserProfile(String userName, int userId, String initial, int followers) {
        this.userName = userName;
        this.userId = userId;
        this.initial = initial;
        this.followers = followers;
    }

    void display() {
        System.out.println("Username :" + userName);
        System.out.println(" user Id  :" + userId);
        System.out.println("initial name  :" + initial);
        System.out.println("followers :" + followers);
    }

}