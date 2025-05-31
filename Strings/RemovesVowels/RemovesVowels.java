
public class RemovesVowels {

    public static void main(String[] args) {
        String st = "youcandoit";
        removeVowels(st);
    }

    public static void removeVowels(String st) {
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'A' || st.charAt(i) == 'E' || st.charAt(i) == 'I' || st.charAt(i) == 'O' || st.charAt(i) == 'U'
                    || st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u') {
                continue;
            }

            System.out.print(st.charAt(i));
        }
    }
}
