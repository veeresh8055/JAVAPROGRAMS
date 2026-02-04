import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the a value");
        double a = sc.nextDouble();

        System.out.println("Enter b Value");
        double b = sc.nextDouble();

        double sum = a + b;
        System.out.println("The Sum is : " + sum);
        
        sc.close();
    }
}

// output
// Enter the a value
// 1.3
// Enter b Value
// 3.5
// The Sum is : 4.8