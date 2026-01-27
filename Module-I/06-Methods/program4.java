public class program4 {
    public static void main(String[] args) {
        
        System.out.println("main starts");
        display();
        System.out.println("main ends");
    }
    static void display(){
        System.out.println("display starts");
        test();
        System.out.println("display ends");
    }
    static void test(){
        System.out.println("test start");
        System.out.println("test ends");
    }
}

// output
// main starts
// display starts
// test start
// test ends
// display ends
// main ends