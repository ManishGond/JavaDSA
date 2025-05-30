
import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        removePrime(arr);

        System.out.println(arr);

    }

    public static void removePrime(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (checkPrime(list.get(i))) {
                list.remove(i);
            }
        }
    }

    static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
