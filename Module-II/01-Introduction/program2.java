class Demo1{
   static int x = 10 ;
   static int y = 20 ;

}
class mainClass1{
    public static void main(String[] args) {
        
      System.out.println("Program started");
      System.out.println("X value " + Demo1.x);
      System.out.println("y value " + Demo1.y);
      System.out.println("Changing the X and Y variable of Demo1 class ");
      Demo1.x = 99;
      Demo1.y = 88;
      System.out.println("Afetr reassigning a value to the static variable ");
      System.out.println("X value " + Demo1.x);
      System.out.println("y value " + Demo1.y);
   }
}
    
// output
// Program started
// X value 10
// y value 20
// Changing the X and Y variable of Demo1 class
// Afetr reassigning a value to the static variable
// X value 99
// y value 88