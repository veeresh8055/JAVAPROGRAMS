public class program18 {
    public static void main(String[] args) {

        int n = 5;

        char val = 'a';
        for (int i = 0; i < n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
            val = 'a';
        }

    }
}
// output
// a b c d e
// a b c d e
// a b c d e
// a b c d e
// a b c d e
