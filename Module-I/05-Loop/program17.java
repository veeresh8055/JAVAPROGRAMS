public class program17 {
 public static void main(String[] args) {
    int n = 5 ;
    // for(int i=0; i<n;i++){
        
    //     for(int j=1; j<=n ; j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

     int val = 1;
    for(int i=0; i<n;i++){
        
        for(int j=1; j<=n ; j++){
            System.out.print(val+++" ");
        }
        System.out.println();
        val=1;
    }

    
 }   
}

// output
// 1 2 3 4 5 
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5