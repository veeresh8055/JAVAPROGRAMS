public class program13 {
    public static void main(String[] args) {
        // check the over spped of a vehicle if its more than 80 fine if its not leave
        // ...!

        System.out.println("Over Speed Fine  : " + overSpeedFine(65));
        System.out.println("Over Speed Fine  : " + overSpeedFine(161));
        System.out.println("Over Speed Fine  : " + overSpeedFine(90));
        System.out.println("Over Speed Fine  : " + overSpeedFine(41));
    }

    static boolean overSpeedFine(int val) {
        return val > 80;
    }
}

// output
// Over Speed Fine : false
// Over Speed Fine : true
// Over Speed Fine : true
// Over Speed Fine : false