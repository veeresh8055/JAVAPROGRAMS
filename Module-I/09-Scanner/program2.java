import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        // program to find the given number is even or odd number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even number ");
        } else {
            System.out.println("Odd Number ");
        }
        sc.close();
        
        System.out.println(sc.getClass()); //class java.util.Scanner
    }
}

// output
// Enter the number
// 11
// Odd Number