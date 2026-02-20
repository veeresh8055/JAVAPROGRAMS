public class Automorphic {
    public static void main(String[] args) {
        int n = 5;
        if (isAutomorph(n)) {
            System.out.println("The number is automorph");
        } else {
            System.out.println("The Number is not Automorph");
        }

      

    }

    static boolean isAutomorph(int n) {
        int digits = findDigits(n);

        int sqrt = n * n;

        int mod = mod(10, digits);

        int lastValue = sqrt % mod;

        return n == lastValue;

    }

    static int findDigits(int n) {
        int digit = 0;
        while (n > 0) {
            digit++;
            n = n / 10;
        }
        return digit;
    }

    static int mod(int a, int digit) {
        int product = 1;
        for (int i = 0; i < digit; i++) {
            product = product * a;
        }
        return product;
    }

}
