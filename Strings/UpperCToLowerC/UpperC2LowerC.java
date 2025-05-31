
public class UpperC2LowerC {

    public static void main(String[] args) {
        String s = "wElcoME HomE";
        convertToLowerCase(s);

    }

    public static void convertToLowerCase(String s) {
        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];

            if (c >= 'A' && c <= 'Z') {
                char newc = (char) (c - 'A' + 'a');

                ch[i] = newc;
            }
        }

        for (char c : ch) {
            System.out.print(c);
        }
    }
}
