
public class program1 {
    public static void main(String[] args) {
        System.out.println("Program Start");

        Test();
        Test();
        Test();
        Test();
        System.out.println("Program End");
    }

    static void Test() {
        System.out.println("Executing test.......!");
    }

}
// output
// Program Start
// Executing test.......!
// Executing test.......!
// Executing test.......!
// Executing test.......!
// Program End
