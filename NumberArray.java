import java.util.Arrays;

public class NumberArray {
    public static void main(String[] args) {
        int[] arr = {2,3,7,-8,4,1,-9,0};
        System.out.println("Gia tri nho nhat la " + minValue(arr));
    }

    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
