import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        // reading string values
        Scanner sc = new Scanner(System.in);

        // using next() method [It read only first value of a sentence]
       

        System.out.println("Enter Full name ");
        String fullName = sc.nextLine();

         System.out.println("Enter the name ");
        String name = sc.next();
        
        System.out.println("Name is : " + name);
        System.out.println("Full Name : " + fullName);

    }
}
