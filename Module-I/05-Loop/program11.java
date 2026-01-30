public class program11 {
    public static void main(String[] args) {
     // ans = 1 2 3 2 1 
        int n = 5 ;
        int val = n/2+1 ;
      
        for (int i = 1; i <= n ; i++) {
                 if(i >= val ){
                    System.out.print(val-- +" ");
                 }
                 else{
                    System.out.print(i+" ");
                 }
            
        }
    }
}
//  i = 0       true      1     i++
//  i = 1       true      2       i++
//  i=2         true       3      check (2 < 2  =5/2 )  false make i-- 
//  i=3        true  if(3 > 2.5 n/2) print val++  val= 3 + 0 
   
//   i =4 
//  i =5 false        
