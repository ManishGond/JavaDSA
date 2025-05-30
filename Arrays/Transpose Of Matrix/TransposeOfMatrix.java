
import java.util.Scanner;

public class TransposeOfMatrix {

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

        int arr2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        System.out.println("Matrix before Transpose: ");
        for (int arr1[] : arr) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr1[l] + " ");
            }
            System.out.println();
        }

        transpose(arr);

        System.out.println("Matrix after Transpose 3x3: ");
        for (int arr1[] : arr) {
            for (int l = 0; l < arr[0].length; l++) {
                System.out.print(arr1[l] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix after Transpose 4x4: ");
        transpose(arr2);
        for (int arr1[] : arr2) {
            for (int l = 0; l < arr2[0].length; l++) {
                System.out.print(arr1[l] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
