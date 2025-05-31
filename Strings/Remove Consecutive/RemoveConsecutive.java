
public class RemoveConsecutive {

    public static void main(String[] args) {
        String result = removeConsecutive("aaabbcd", 3);
        System.out.println(result);  // Output: bcd
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
}
