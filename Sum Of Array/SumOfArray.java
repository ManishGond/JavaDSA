
public class SumOfArray {

    public static void main(String[] args) {
        int[] arr1 = {10, 3, -1, -8, 7, 12, 3, 15};
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }

        System.out.println(sum);
    }
}
