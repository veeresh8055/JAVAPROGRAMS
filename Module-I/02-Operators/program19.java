public class program19 {
  public static void main(String[] args) {
    double principle = 100000.00;
    double rate = 12.5;
    double tenure = 2.0;

    
    
    double si = (principle * tenure * rate ) /100;  // 25000.0
    System.out.println("The Simple Interest is :" + si );
    
    
    double totalPayment = principle + si; //125000.0
    System.out.println("Total Payble Amount : " + totalPayment);

    double emi = totalPayment / (12*tenure);//5208.33333333
    System.out.println("Emi for 1 Month : " +emi);


  }   
}
 
//output
// The Simple Interest is :25000.0
// Total Payble Amount : 125000.0
// Emi for 1 Month : 5208.333333333333
