public class program7 {
    public static void main(String[] args) {
        play('j');
    }

    static void play(char ch) {
        System.out.println("The char is :" + ch);
        help(true);
    }

    static void help(boolean k) {

        System.out.println("the value passed is : " + k);
    }
}
// output
// The char is :j
// the value passed is : true
