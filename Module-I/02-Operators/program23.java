public class program23 {
  public static void main(String[] args) {
    int a = 13 ; 
    int b = a++ + a++;
    System.out.println(b);
    System.out.println(a);

    int r = 12 ;
    int s = r-- + r--;
    System.out.println(s);
    System.out.println(r);

    // int v =  10 ;
    // System.out.println(v-- + v-- + v++ + v--); // 36
    // System.out.println(v);
    
    

    int k = 21;
    int f = k++ + k++ + k++;
     System.out.println(f);// 66


     // pre operation

     int x = 20;
     System.out.println(++x); // 21
     System.out.println(--x); // 20

     int pp = 23;
     int qq = ++pp + ++pp;
     System.out.println(qq); // 49 

     int rr = 28 ;
     int ss = --rr + --rr;
     System.out.println(ss); // 53


     System.out.println('A' + 'A'); // 130 
  }   
}
// output
// 27
// 15
// 23
// 10