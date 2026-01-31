
public class program8 {
    // factorial of a number

    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        while (n >= 1) {
            fact = fact * n;
            n--;
        }
        System.out.println("the factorial is : " + fact);
    }

}

// output
// the factorial is : 120