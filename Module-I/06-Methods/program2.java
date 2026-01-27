public class program2 {
    static void check() {
        System.out.println("Executing check()....");
    }

    static void verify() {
        System.out.println("Executing verify()....");

    }

    static void help() {
        System.out.println("Executing help()....");

    }

    public static void main(String[] args) {

        System.out.println("PROGRAM START");
        check();
        verify();
        help();

        System.out.println("PROGRAM END");
    }
}
// output
// PROGRAM START
// Executing check()....
// Executing verify()....
// Executing help()....
// PROGRAM END