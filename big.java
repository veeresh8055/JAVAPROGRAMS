import java.util.Arrays;

public class big {
    public static void main(String[] args) {

        int[] arr = { 3, 2, 4, 7, 1 };

        int[] newArray = sort(arr);

        System.out.println(Arrays.toString(newArray));

    }

    static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {  // < for descending and  > for ascending 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;

    }
}

// output:
// [7, 4, 3, 2, 1]