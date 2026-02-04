import java.util.Scanner;
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Phone Number :");
        long number = sc.nextLong();

        System.out.println("Enter CGPA :");
        double cgpa = sc.nextDouble();
       
        System.out.println("Enter the Status :");
        boolean status = sc.nextBoolean();
        
        System.out.println("Phone Number : " +number);
        System.out.println("CGPA  : " +cgpa);
        System.out.println("Status  : " +status);

        sc.close();

    }
}
// output
// Enter Phone Number :
// 6376476934
// Enter CGPA :
// 9.9
// Enter the Status :
// true
// Phone Number : 6366476934
// CGPA  : 9.9
// Status  : true
