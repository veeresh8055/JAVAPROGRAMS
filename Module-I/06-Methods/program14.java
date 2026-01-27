public class program14 {
    public static void main(String[] args) {
        // Discount calculator

        System.out.println("After Discount is : " + applyDiscount(1000, 10));
        System.out.println("After Discount is : " + applyDiscount(1500, 21));
        System.out.println("After Discount is : " + applyDiscount(3350, 33));
        System.out.println("After Discount is : " + applyDiscount(12500, 15));
    }
    static double applyDiscount(int price , int dis){
        return (price - (price * dis )/100);  
    }
}
// output
// After Discount is : 900.0
// After Discount is : 1185.0
// After Discount is : 2245.0
// After Discount is : 10625.0