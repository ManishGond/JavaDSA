
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("VII"));
    }

    public static int romanToInt(String s) {
        int total = 0;
        int prev = getValue(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));

            if (prev < curr) {
                total -= prev;
            } else {
                total += prev;
            }
            prev = curr;
        }

        total += prev;
        return total;
    }

    public static int getValue(char ch) {
        return switch (ch) {
            case 'I' ->
                1;
            case 'V' ->
                5;
            case 'X' ->
                10;
            case 'L' ->
                50;
            case 'C' ->
                100;
            case 'D' ->
                500;
            case 'M' ->
                1000;
            default ->
                0;
        };
    }
}
