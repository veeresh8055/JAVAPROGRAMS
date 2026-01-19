import java.util.Scanner;

class Program__6
{
    // max  of a or b 
    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        int a = in.nextInt() ;
        int b = in.nextInt() ;
        if (a>b){

            System.out.println(a+"is grater ");
        }
        else{
            System.out.println(b+"is grater ");

        }
    }
}