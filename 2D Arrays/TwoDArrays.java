
public class TwoDArrays {

    public static void main(String[] args) {
        int[][] arr = new int[4][6];

        arr[1][2] = 4;
        arr[0][1] = 3;

        // cool trick for 2D arrays
        for (int arr1[] : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }

        // To Print the length of rows
        System.out.println(arr.length);
        // To Print the length of columns
        System.out.println(arr[0].length);
    }
}
