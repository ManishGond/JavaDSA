
public class ReverseVowels {

    public static void main(String[] args) {
        String st = "I'm better off from this home";
        reverseVowels(st);
    }

    public static void reverseVowels(String st) {
        char[] ch = st.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            while (i < j && !isVowel(ch[i])) {
                i++;
            }
            while (i < j && !isVowel(ch[j])) {
                j--;
            }

            if (i >= j) {
                break;
            }

            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i++;
            j--;
        }

        for (char c : ch) {
            System.out.print(c);
        }

    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
