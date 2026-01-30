public class program19 {
    public static void main(String[] args) {
        int n = 5;

        int  val = 5;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(val + " ");
                val--;
            }
            System.out.println();
            val = 5;
        }

    }
}

// output
// 5 4 3 2 1 
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
// 5 4 3 2 1
