public class program10 {
    // program to return a value form the test method

    static int test(int a) {
        return a;
    }

    static double play() {

        return 2.3;
    }

    public static void main(String[] args) {
        int val = test(20);
        System.out.println("the returned value is : " + val);

        System.out.println("play method is called and the value is : " + play());
    }
}
// output
// the returned value is : 20
// play method is called and the value is : 2.3