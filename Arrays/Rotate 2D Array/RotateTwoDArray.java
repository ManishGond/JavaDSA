
import java.util.Scanner;

public class RotateTwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix before Rotation: ");
        for (int arr1[] : arr) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr1[l] + " ");
            }
            System.out.println();
        }

        transposeAndRotateC(arr);
        System.out.println("Matrix after C Rotation: ");
        for (int arr1[] : arr) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr1[l] + " ");
            }
            System.out.println();
        }

        transposeAndRotateAC(arr);
        System.out.println("Matrix after AC Rotation: ");
        for (int arr1[] : arr) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr1[l] + " ");
            }
            System.out.println();
        }

        transposeAndRotate180(arr);
        System.out.println("Matrix after 180 Rotation: ");
        for (int arr1[] : arr) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr1[l] + " ");
            }
            System.out.println();
        }

    }

    public static void transposeAndRotateC(int arr[][]) {
        // Code: We need to rotate a matrix 90deg clockwise
        // Step 1: Transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Row-Reverse the transposed matrix
        for (int row[] : arr) {
            int first = 0;
            int last = arr.length - 1;
            while (first < last) {
                int temp = row[first];
                row[first] = row[last];
                row[last] = temp;

                first++;
                last--;
            }
        }
    }

    public static void transposeAndRotateAC(int arr[][]) {
        // Code: We need to rotate a matrix 90deg clockwise
        // Step 1: Transpose the matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Col-Reverse the transposed matrix
        for (int i = 0; i < arr.length; i++) {
            int first = 0;
            int last = arr.length - 1;
            while (first < last) {
                int temp = arr[first][i];
                arr[first][i] = arr[last][i];
                arr[last][i] = temp;

                first++;
                last--;
            }
        }
    }

    public static void transposeAndRotate180(int arr[][]) {
        // Step 1: Row Reverse (left <-> right)
        for (int row[] : arr) {
            int left = 0;
            int right = arr[0].length - 1;

            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }
        }

        // Step 2: Col Reverse (top <-> bottom)
        for (int i = 0; i < arr[0].length; i++) {
            int top = 0;
            int bottom = arr.length - 1;

            while (top < bottom) {
                int temp = arr[top][i];
                arr[top][i] = arr[bottom][i];
                arr[bottom][i] = temp;

                top++;
                bottom--;
            }
        }
    }
}
