import java.util.Scanner; // 1st iimport scanner class

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 2nd create instance of that scanner class
        System.out.println("Enter the value  ");
        int val = sc.nextInt(); // 3rd read the value from the user
        System.out.println("The value  is : " + val);
        sc.close();
    }
}
// output
// Enter the value
// 10
// The value is : 10