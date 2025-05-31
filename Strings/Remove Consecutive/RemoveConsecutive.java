
public class RemoveConsecutive {

    public static void main(String[] args) {
        String result = removeConsecutive("aaabbcd", 3);
        System.out.println(result);  // Output: bcd
        System.out.println(areOccurrencesEqual("aaabbcd"));
    }

    public static String removeConsecutive(String A, int B) {
        char ch[] = A.toCharArray();
        char res[] = new char[ch.length];
        int index = 0;
        int i = 0;

        while (i < ch.length) {
            int j = i;
            int count = 0;
            while (j < ch.length && ch[i] == ch[j]) {
                j++;
                count++;
            }
            if (count < B) {
                for (int k = i; k < j; k++) {
                    res[index] = ch[k];
                    index++;
                }
            }
            i = j;
        }

        return new String(res, 0, index);
    }

    public static boolean areOccurrencesEqual(String s) {
        char ch[] = s.toCharArray();
        int expectedCount = -1;
        for (int i = 0; i < ch.length; i++) {
            boolean flag = false;

            for (int k = 0; k < i; k++) {
                if (ch[i] == ch[k]) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                }
            }
            if (expectedCount == -1) {
                expectedCount = count; // First unique char sets the expected count
            } else if (count != expectedCount) {
                return false; // Mismatch in frequency
            }
        }
        return true;
    }
}
